package listaDeExercicios03.exercicio03.pooJavaBeanAnimal;

public class AnimalTeste {

	public static void main(String[] args) {
		
		//criando dois cachorros
		Animal cachorro = new Animal("Cas", 4, "Pug", 30.5);
		Animal baleia = new Animal("Sam", 20, "Baleia-Azul", 180000.5);//--> toneladas
		
		//atribuindo valores ao meu objeto cachorro
		System.out.println("ATRIBUTOS DE UM CACHORRO: " );
		System.out.println();
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println();
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.println();
		System.out.println("Raça: " + cachorro.getRaca());
		System.out.println();
		System.out.println("Peso: " + cachorro.getPeso());
		System.out.println();
		
		//atribuindo valores ao meu objeto baleia
		System.out.println("ATRIBUTOS DE UMA BALEIA: " );
		System.out.println();
		System.out.println("Nome: " + baleia.getNome());
		System.out.println();
		System.out.println("Idade: " + baleia.getIdade());
		System.out.println();
		System.out.println("Raça: " + baleia.getRaca());
		System.out.println();
		System.out.println("Peso: " + baleia.getPeso());
		System.out.println();
		
	}
	
}
