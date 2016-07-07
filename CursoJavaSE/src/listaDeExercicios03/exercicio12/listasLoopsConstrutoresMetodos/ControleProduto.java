package listaDeExercicios03.exercicio12.listasLoopsConstrutoresMetodos;

import java.util.ArrayList;
import java.util.List;

public class ControleProduto {
	
	//declarando minha lista de produtodos
	private List<Produto> produtos;

	//construtor auxiliar que obriga o úsusrio a informar a lista de produtos
	public ControleProduto(List<Produto> produtos) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}
		this.produtos = produtos;
	}
	
	//métodos
	public double valorTotalProdutos(){
		double valorTotal = 0;
		
		for(Produto p : produtos){
			valorTotal += p.getPreco();
		}
		
		return valorTotal;
	}
	
	public ArrayList<String> ListarTotalEmEstoqueProdutos (){
		ArrayList<String> resultados = new ArrayList<>();
		
		for(Produto p : produtos){
			
			String nomeProduto = p.getNome();
			
			double multiplica = p.getPreco() * p.getQuantidadeEstoque();
			
			String resultado = nomeProduto + " - valor total é: " + multiplica;
			
			resultados.add(resultado);
		}
		
		return resultados ;
		
		
	}
	
	//Getters and Setters
	public List<Produto> getprodutos() {
		return produtos;
	}
	
	public void setprodutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}
