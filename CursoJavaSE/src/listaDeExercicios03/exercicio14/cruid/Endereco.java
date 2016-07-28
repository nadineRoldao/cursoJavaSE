package listaDeExercicios03.exercicio14.cruid;

import java.io.Serializable;

public class Endereco implements Serializable{

	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
		
	//atributos da classe trabalhador
	private String cep;
	private Logradouro logradouro;
	private String nome;
	private int numero;
	private String cidade;
	private String estado;
	private String complemento;
	
	
	
	public Endereco() {
		
	}

	//construtor auxiliar
	public Endereco(String cep, Logradouro logradouro, String nome, int numero, String cidade, String estado,String complemento) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
	}

	//Getters and Setters
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
	
}
