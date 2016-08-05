package aula35.heranca;

public class Galinha extends Animal {
	
	Galinha() {
		super(5, "Pintadinha");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("po po popopo popo po po po popopoppoooooooooooo");
	}
	
}
