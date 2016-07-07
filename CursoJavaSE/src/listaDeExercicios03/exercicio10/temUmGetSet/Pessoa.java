package listaDeExercicios03.exercicio10.temUmGetSet;

import java.io.Serializable;
import java.util.List;

public class Pessoa implements Serializable{

	// implementando a interface serializable
		private static final long serialVersionUID = 1L;
		
		//declarando atributos de Pessoa
		private int id;
		private String nome;
		private List<String> telefones;
			
		
		//composição Tem Um
		private Endereco endereco;
		
		//construtor padrão
		public Pessoa(){
			
		}
		
		//construtor auxiliar
		public Pessoa(int id, String nome, List<String> telefones, Endereco endereco){
			
			this.id = id;
			this.nome = nome;
			this.telefones = telefones;
			this.endereco = endereco;
			
		}
		
		//Getters and Setters
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Endereco getEndereco() {
			return endereco;
		}
		
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		
		public List<String> getTelefones() {
			return telefones;
		}
		
		public void setTelefones(List<String> telefones) {
			this.telefones = telefones;
		}
		
		
	
}
