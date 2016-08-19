package aula38.polimorfismoInterface;

public class SuperConta implements AdicaoInterface, MultiplicacaoInterface {

	@Override
	public void multiplicar(double a, double b) {

		double contaMultiplicar = a * b;
		System.out.println(contaMultiplicar);
		
	}

	@Override
	public void somar(double a, double b) {
		
		double contaSomar = a + b;
		System.out.println(contaSomar);
		
	}

	
	
}
