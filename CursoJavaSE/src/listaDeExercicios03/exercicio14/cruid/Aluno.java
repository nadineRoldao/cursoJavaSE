package listaDeExercicios03.exercicio14.cruid;

import java.io.Serializable;

public class Aluno implements Serializable {

	// implementando a interface serializable
	private static final long serialVersionUID = 1L;

	// atributos da classe Aluno
	private String nome;
	private int idade;
	private Endereco endereco;
	private int codigoAluno;
	private boolean statusMatricula;

	public Aluno() {

	}

	// construtor auxiliar
	public Aluno(String nome, int idade, Endereco endereco, int codigoAluno, boolean statusMatricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.codigoAluno = codigoAluno;
		this.statusMatricula = statusMatricula;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public boolean isStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(boolean statusMatricula) {
		this.statusMatricula = statusMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", codigoAluno=" + codigoAluno
				+ ", statusMatricula=" + statusMatricula + "]";
	}

}
