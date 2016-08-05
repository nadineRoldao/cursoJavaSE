package aula37.polimorfismo;

public class OperacaoMatematicaTeste {

	public static void main(String[] args) {
		
		OperacaoMatematica soma = new Adicao();
		OperacaoMatematica divide = new Divisao();
		OperacaoMatematica subtrai = new Subtracao();
		OperacaoMatematica multiplica = new Multiplicacao();
		
		calcularComPolimorfismo(soma, 30, 15);
		calcularComPolimorfismo(divide, 30, 15);
		calcularComPolimorfismo(subtrai, 30, 15);
		calcularComPolimorfismo(multiplica, 30, 15);
		
	}
	
	public static void calcularComPolimorfismo(OperacaoMatematica om, double x, double y){
		
		double valor = om.calcular(x, y);
		System.out.println("valor: " + valor);
		
	}
	
	public void calcularSemPolimorfismo(OperacaoMatematica om, double x, double y){
		
		double valor = om.calcular(x, y);
		System.out.println("valor: " + valor);
		
	}

	
}
