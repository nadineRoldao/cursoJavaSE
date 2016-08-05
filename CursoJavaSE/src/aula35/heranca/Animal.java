package aula35.heranca;

public class Animal {

		// Atributos (variaveis)
		private double peso;
		private String nome;
		
		// Construtor padrão
		public Animal() {
			
		}
		
		// construtor auxiliar
		public Animal(double peso, String nome) {
			this.peso = peso;
			this.nome = nome;
		}

		
		// Comportamentos (metodos)
		public void comer() {
			System.out.println("Animal comendo");
		}

		public void fazerBarulho() {
			System.out.println("Animal fazendo barulho");
		}
		
		// Getters and Setters
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
	
}
