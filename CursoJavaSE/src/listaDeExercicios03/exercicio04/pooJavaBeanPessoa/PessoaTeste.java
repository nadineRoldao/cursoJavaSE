package listaDeExercicios03.exercicio04.pooJavaBeanPessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		//criando um objeto do tipo pessoa
		Pessoa p = new Pessoa("Dean Ambrose", 30, 1.93, false);
		
		//atribuindo valores ao meu objeto pessoa
		System.out.println("ATRIBUTOS DE UMA PESSOA: " );
		System.out.println();
		System.out.println("Nome: " + p.getNome());
		System.out.println();
		System.out.println("Idade: " + p.getIdade());
		System.out.println();
		System.out.println("Altura: " + p.getAltura());
		System.out.println();
		System.out.println("Estado Civil: " + p.isEstadoCivil());
		System.out.println();
	}
	
}
