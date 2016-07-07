package listaDeExercicios03.exercicio04.pooJavaBeanPessoa;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	// implementando a interface Serializable
	private static final long serialVersionUID = 1L;
	
	// atributos de uma pessoa
		private String nome;
		private int idade;
		private double altura;
		private boolean estadoCivil;
		
		//construtor padrão 
		public Pessoa(){
		}
		
		//construtor auxiliar
		public Pessoa(String nome, int idade, double altura, boolean estadoCivil){
			
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
			this.estadoCivil = estadoCivil;
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
		
		public double getAltura(){
			return altura;
		}
		
		public void setAltura(double altura){
			this.altura = altura;
		}

		public boolean isEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(boolean estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

	
}
