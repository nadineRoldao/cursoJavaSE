package listaDeExercicios04.exercicio02.polimorfismo;

public class CommonWrestler extends Wrestler implements CommonAbilities{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void finisher() {
		System.out.println("simple finisher...");
	}

	@Override
	public int dropKick() {
		System.out.println("Drop Kick...");
		return 250;
	}

	@Override
	public int superKick() {
		System.out.println("Superkick...");
		return 350;
	}

	@Override
	public int crossBody() {
		System.out.println("CROSSBODY...");
		return 100;
	}

	@Override
	public int suplex() {
		System.out.println("SUPLEX...");
		return 400;
	}

	@Override
	public int ddt() {
		System.out.println("DDT...");
		return 360;
	}

}
