package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos:");
		int n = sc.nextInt();
		for (int i=0; i<=n; i++) {
			System.out.println("Dados do produto número:" + i);
			System.out.print("Produto comum, usado ou importado(c,u,i)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço");
			double preco = sc.nextDouble();
			
		}
		
		
		sc.close();
		
		
	
	}

}
