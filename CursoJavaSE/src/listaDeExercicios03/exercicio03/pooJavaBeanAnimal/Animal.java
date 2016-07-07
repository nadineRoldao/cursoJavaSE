package listaDeExercicios03.exercicio03.pooJavaBeanAnimal;

import java.io.Serializable;

public class Animal implements Serializable{
	
	//implementando a interface Serializable
	private static final long serialVersionUID = 1L;
	
	//atributos privados de um animal
	private String nome;
	private int idade;
	private String raca;
	private double peso;
	
	//construtor padrão 
	public Animal(){
	}
	
	//construtor auxiliar
	public Animal(String nome, int idade, String raca, double peso){
		
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.peso = peso;
	}
	
	//modificadores de acesso getters and setters 
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
		
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
}