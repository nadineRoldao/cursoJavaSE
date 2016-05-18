package aulaJavaBeans;

import java.io.Serializable;

/**
 * 
 * @author Nadine
 *		
 *	UM JAVA BEANS CONT�M:
 *		-> implementa a interface Serializable
 *		-> Tem atributos privados
 *		-> Metodo construtor padr�o
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
	 * -> S�o utilizados para construir nosso objetos, ou seja, instancia-los.
	 * -> Por padr�o uma classe java possui um construtor vazio de forma
	 * impl�cita -> Quando criamos os nossos pr�prios construtores, o padr�o
	 * deixa de existir. -> Utilizamos construtores customizados para definir
	 * uma regra para a cria��o dos nossos objetos. Exp: classe Scanner
	 * 
	 */

	// Criando um construtor padr�o (vazio) manualmente
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
