package listaDeExercicios03.exercicio13.desafio;

import java.io.Serializable;

/**
 * @author Nadine
 *
 */
public class Trabalhador implements Serializable{

	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//atributos da classe trabalhador
	private String nome;
	private char sexo;
	private int idade;
	private TipoTrabalhador tipoTrabalhador;
	private int id;
	private int tempoTrabalhoEmAnos;
	
	//construtor padrão
	public Trabalhador(){
		
	}
	
	//construtor auxiliar
	public Trabalhador(String nome, char sexo, int idade, TipoTrabalhador tipoTrabalhador, int id, int tempoTrabalhoEmAnos){
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.tipoTrabalhador = tipoTrabalhador;
		this.id = id;
		this.tempoTrabalhoEmAnos = tempoTrabalhoEmAnos;
		
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public TipoTrabalhador getTipoTrabalhador() {
		return tipoTrabalhador;
	}
	
	public void setTipoTrabalhador(TipoTrabalhador tipoTrabalhador) {
		this.tipoTrabalhador = tipoTrabalhador;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTempoTrabalhoEmAnos() {
		return tempoTrabalhoEmAnos;
	}
	
	public void setTempoTrabalhoEmAnos(int tempoTrabalhoEmAnos) {
		this.tempoTrabalhoEmAnos = tempoTrabalhoEmAnos;
	}
}
