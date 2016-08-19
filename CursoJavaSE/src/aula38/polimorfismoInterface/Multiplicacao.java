package aula38.polimorfismoInterface;

public class Multiplicacao implements MultiplicacaoInterface {

	@Override
	public void multiplicar(double a, double b) {
		
		double contaMultiplicar = a * b;
		System.out.println(contaMultiplicar);
		
	}

}
