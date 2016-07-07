package listaDeExercicios03.exercicio09.enumTemUmModificadorStatic;

public class CalculadoraUtilTeste {
	
	public static void main(String[] args) {
		
		String resultado = CalculadoraUtil.calcular(TipoOperacao.ADICAO, 30, 5);
		System.out.println(resultado);
		
		resultado = CalculadoraUtil.calcular(TipoOperacao.SUBTRACAO, 40, 5);
		System.out.println(resultado);
		
		resultado = CalculadoraUtil.calcular(TipoOperacao.MULTIPLICACAO, 5, 7);
		System.out.println(resultado);
		
		resultado = CalculadoraUtil.calcular(TipoOperacao.DIVISAO, 35, 5);
		System.out.println(resultado);
		
		resultado = CalculadoraUtil.calcular(TipoOperacao.RAIZ_QUADRADA, 35, 0);
		System.out.println(resultado);
	}

}
