package aplicacao;

import entidades.ProdutoImportado;

public class Programa {

	public static void main(String[] args) {
		
		ProdutoImportado pi = new ProdutoImportado("Tablet", 260.00,20.00);
		
		
		System.out.println(pi.etiquetaPreco());
	}

}
