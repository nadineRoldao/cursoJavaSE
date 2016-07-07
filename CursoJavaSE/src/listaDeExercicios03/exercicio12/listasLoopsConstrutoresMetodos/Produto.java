package listaDeExercicios03.exercicio12.listasLoopsConstrutoresMetodos;

import java.io.Serializable;

public class Produto implements Serializable{
	
	// implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//declarando meus atributos de produto
	private double preco;
	private String nome;
	private int id;
	private int quantidadeEstoque;

	public Produto(){
		
	}
	
	public Produto(double preco, String nome, int id, int quantidadeEstoque) {
		this.preco = preco;
		this.nome = nome;
		this.id = id;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	//Getters and Setters
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	
	
	

}
