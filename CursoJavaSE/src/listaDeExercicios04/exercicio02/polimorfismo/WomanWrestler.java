package listaDeExercicios04.exercicio02.polimorfismo;

public class WomanWrestler extends Wrestler {

	private static final long serialVersionUID = 1L;

	@Override
	public int punch() {
		System.out.println("punch...");
		return 50;
	}
	
	@Override
	public int kick() {
		System.out.println("kicking...");
		return 60;
	}
	
	@Override
	public void finisher() {
		System.out.println("simple finisher...");
	}
	
}
