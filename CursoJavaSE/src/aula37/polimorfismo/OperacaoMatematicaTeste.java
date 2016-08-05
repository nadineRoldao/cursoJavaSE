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
		
		System.out.println();
		
		new OperacaoMatematicaTeste().calcularSemPolimorfismo(soma, 30, 15);
		new OperacaoMatematicaTeste().calcularSemPolimorfismo(divide, 30, 15);
		new OperacaoMatematicaTeste().calcularSemPolimorfismo(subtrai, 30, 15);
		new OperacaoMatematicaTeste().calcularSemPolimorfismo(multiplica, 30, 15);
		
	}
	
	public static void calcularComPolimorfismo(OperacaoMatematica om, double x, double y){
		
		double valor = om.calcular(x, y);
		System.out.println("valor: " + valor);
		
	}
	
	private void calcularSemPolimorfismo(Object o, double x, double y){
		
		if(o instanceof Adicao){
			double valor = new Adicao().calcular(x, y);
			System.out.println(valor);
			
		}else if(o instanceof Divisao){
			System.out.println(	new Divisao().calcular(x, y));
		
		}else if(o instanceof Subtracao){
			System.out.println(new Subtracao().calcular(x, y));
			
		}else if(o instanceof Multiplicacao){
			System.out.println(new Multiplicacao().calcular(x, y));
			
		}
		
	}

	
}
