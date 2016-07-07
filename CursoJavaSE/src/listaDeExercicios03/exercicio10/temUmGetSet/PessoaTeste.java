package listaDeExercicios03.exercicio10.temUmGetSet;

import java.util.ArrayList;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco e = new Endereco(472, "Mere Marie Anais de Sion", "S�o Paulo", "S�o Paulo");
		
		ArrayList<String> telefones = new ArrayList<>();
		telefones.add("778898778");
		telefones.add("225545457");
		
		Pessoa p = new Pessoa(1124, "Edney", telefones, e);
		
		System.out.println("INFORMA��ES PESSOAIS: ");
		System.out.println("Id: " + p.getId());
		System.out.println("Nome da pessoa: " + p.getNome());
		
		//System.out.println("Telefones" + p.getTelefones());
		
		for(String tel : p.getTelefones()) {
			System.out.println(tel);
		}
		
		System.out.println("INFORM��ES DO ENDERE�O: ");
		System.out.println("N�mero do endere�o: " + p.getEndereco().getNumero());
		System.out.println("Nome da rua: " + p.getEndereco().getRua());
		System.out.println("Nome da cidade: " + p.getEndereco().getCidade());
		System.out.println("Nome do estado: " + p.getEndereco().getEstado());
		System.out.println();
		
		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}
