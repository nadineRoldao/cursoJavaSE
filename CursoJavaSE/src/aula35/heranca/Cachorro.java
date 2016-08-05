package aula35.heranca;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super(25, "Dean Ambrose");
	}

	@Override
	public void fazerBarulho() {
		System.out.println("au au au auuuu");
	}
	
}

