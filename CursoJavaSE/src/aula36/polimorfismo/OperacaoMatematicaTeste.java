package aula36.polimorfismo;

public class OperacaoMatematicaTeste {

	public static void main(String[] args) {
		
		OperacaoMatematica soma = new Adicao();
		OperacaoMatematica divide = new Divisao();
		OperacaoMatematica subtrai = new Subtracao();
		OperacaoMatematica multiplica = new Multiplicacao();
		
		calculando(soma, 30, 15);
		calculando(divide, 30, 15);
		calculando(subtrai, 30, 15);
		calculando(multiplica, 30, 15);
		
	}
	
	public static void calculando(OperacaoMatematica om, double x, double y){
		
		double valor = om.calcular(x, y);
		System.out.println("valor: " + valor);
		
	}
	
}
