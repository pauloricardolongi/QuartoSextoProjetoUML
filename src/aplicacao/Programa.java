package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Produto número :" + i);
			System.out.print("Produtos: Comum, Usado ou Importado(c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (tipo == 'c') {
				lista.add(new Produto(nome, preco));
			}
			else if (tipo == 'u') {
				System.out.print("data de Fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, date));
			}
			else {
				System.out.print("Taxa Alfandegária: ");
				double alfandega = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, alfandega));
			}
		}

		System.out.println();
		System.out.println("ETIQUETA DE PREÇO:");
		for (Produto  prod : lista) {
			System.out.println(prod.etiquetaPreco());
		}
		
		sc.close();
		
	}
	}
	
	
	


