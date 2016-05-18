package aulaJavaBeans;

import java.io.Serializable;

/**
 * 
 * @author Nadine
 *		
 *	UM JAVA BEANS CONTÉM:
 *		-> implementa a interface Serializable
 *		-> Tem atributos privados
 *		-> Metodo construtor padrão
 *		-> Modificadores de acesso getters and setters
 *	
 */
public class Pessoa implements Serializable {

	// Implementar a interface Serializable
	private static final long serialVersionUID = 1L;

	// Atributos privados
	private String nome;
	private String sobrenome;
	private double altura;
	private String dataNascimento;
	private boolean casado;

	/*
	 * Sobre construtores
	 * 
	 * -> São utilizados para construir nosso objetos, ou seja, instancia-los.
	 * -> Por padrão uma classe java possui um construtor vazio de forma
	 * implícita -> Quando criamos os nossos próprios construtores, o padrão
	 * deixa de existir. -> Utilizamos construtores customizados para definir
	 * uma regra para a criação dos nossos objetos. Exp: classe Scanner
	 * 
	 */

	// Criando um construtor padrão (vazio) manualmente
	public Pessoa() {
	}

	// Criando um construtor auxiliar
	public Pessoa(String nome, String sobrenome, double altura, String dataNascimento, boolean casado) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
		this.casado = casado;
	}

	// Modificadores de acesso getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

}
