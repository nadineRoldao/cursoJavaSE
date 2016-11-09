package listaDeExercicios04.exercicio02.polimorfismo;

public class SpecialWrestler extends Wrestler implements SpecialAbilities, FinishAbilities {

	private static final long serialVersionUID = 1L;

	@Override
	public void finisher() {
		System.out.println("simple finisher...");
	}

	@Override
	public int powerUpBomb() {
		System.out.println("OMG POWERBOMB...");
		return 600;
		
	}

	@Override
	public int spear() {
		System.out.println("SPEEEAAAAAR...");
		return 600;
		
	}

	@Override
	public int dirtyDeeds() {
		System.out.println("DIRTY DEEEEEEDDS...");
		return 600;
		
	}

	@Override
	public int f5() {
		System.out.println("F5...");
		return 600;
		
	}

	@Override
	public int pedigree() {
		System.out.println("Pedigree...");
		return 600;
		
	}

	@Override
	public int rko() {
		System.out.println("RKO IT'S OUTTA NOWHERE...");
		return 600;
		
	}

	@Override
	public int powerBomb() {
		System.out.println("POOOOWEER BOOOMB...");
		return 200;
	}

	@Override
	public int chokeSlam() {
		System.out.println("OMG IT'S CHOCKSLAM THE DEMON IS HERE...");
		return 450;
	}

	@Override
	public int supermanPunch() {
		System.out.println("SUPERMAN PUNCH...");
		return 500;
	}

	@Override
	public int suplexCity() {
		System.out.println("SUUUPLEEEX OMG SUPLEX CITY IS HERE...");
		return 500;
	}

}
