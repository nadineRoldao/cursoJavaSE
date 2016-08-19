package aula38.polimorfismoInterface;

public class Adicao implements AdicaoInterface {

	@Override
	public void somar(double a, double b) {
		
		double contaSomar = a + b;
		System.out.println(contaSomar);
		
	}
	
}
