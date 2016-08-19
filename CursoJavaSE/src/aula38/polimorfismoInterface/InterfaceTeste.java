package aula38.polimorfismoInterface;

public class InterfaceTeste {

	private static void exibirSoma(AdicaoInterface ai, double a, double b){
		ai.somar(a, b);
	}
	
	private static void exibirMultiplicacao(MultiplicacaoInterface sc, double a, double b){
		sc.multiplicar(a, b);
	}
	
	public static void main(String[] args) {
		
		Adicao a = new Adicao();
		exibirSoma(a, 15, 15);
		
		Multiplicacao m = new Multiplicacao();
		exibirMultiplicacao(m, 3, 10);
		
		SuperConta sc = new SuperConta();
		exibirSoma(sc, 15, 10);
		exibirMultiplicacao(sc, 5, 5);
		
		System.out.println();
		
		System.out.println(sc instanceof SuperConta);
		
		System.out.println(sc instanceof MultiplicacaoInterface);
		
		System.out.println(sc instanceof AdicaoInterface);
		
		System.out.println(a instanceof AdicaoInterface);
		
		System.out.println(a instanceof MultiplicacaoInterface);
		
		System.out.println(m instanceof AdicaoInterface);
		
		System.out.println(m instanceof MultiplicacaoInterface);
	}
	
}
