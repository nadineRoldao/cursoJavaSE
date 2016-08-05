package aula35.heranca;

public class TesteHeranca {

public static void main(String[] args) {
		
		Animal a1 = new Galinha();
		Animal a2 = new Cachorro();
		Animal a3 = new Animal();
		Coruja a4 = new Coruja();
		
		
		System.out.println();
		
		a1.fazerBarulho();
		a2.fazerBarulho();
		a3.fazerBarulho();
		
		System.out.println();
		
		// Verificando os tipos
		System.out.println(a1 instanceof Animal);
		System.out.println(a1 instanceof Cachorro);
		System.out.println(a1 instanceof Galinha);
		System.out.println(a1 instanceof Coruja);
		
		System.out.println();
		
		barulho(a4);
		barulho(a1);
				
	}
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
}
