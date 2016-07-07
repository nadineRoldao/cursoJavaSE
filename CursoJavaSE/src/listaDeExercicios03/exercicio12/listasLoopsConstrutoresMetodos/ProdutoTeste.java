package listaDeExercicios03.exercicio12.listasLoopsConstrutoresMetodos;

import java.util.ArrayList;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		ArrayList <Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(18.50, "shampoo" ,646, 30));
		produtos.add(new Produto(30000.50, "IPhone" ,1209, 95));
		produtos.add(new Produto(10.50, "batom" ,1355, 35));
		
		ControleProduto cp = new ControleProduto(produtos);
		
		ArrayList<String> lista = cp.ListarTotalEmEstoqueProdutos();
		for(String l : lista){
			System.out.println(l);
		}
		
		System.out.println();
		
		double total = cp.valorTotalProdutos();
		System.out.println("Valor total de produtos: " + total);
	}
	
}
