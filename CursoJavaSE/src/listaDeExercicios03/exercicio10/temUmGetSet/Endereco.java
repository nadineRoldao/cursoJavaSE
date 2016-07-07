package listaDeExercicios03.exercicio10.temUmGetSet;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	// implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//declarando atributos de endereço
	private int numero;
	private String rua;
	private String cidade;
	private String estado;
	
	//construtor padrão
	public Endereco(){
		
	}
	
	//construtor auxiliar
	public Endereco(int numero, String rua, String cidade, String estado){
		this.numero = numero;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	//Getters and Setters
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
