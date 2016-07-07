package listaDeExercicios03.exercicio09.enumTemUmModificadorStatic;

public class CalculadoraUtil {
	
	
	
	public static String calcular(TipoOperacao tipoOperacao, int valor, int valor2){
		
		String resultado;
		
		switch(tipoOperacao){
			case ADICAO:
				resultado = "O resultado da " + tipoOperacao.valor + " é: " + (valor + valor2);
				break;
			case SUBTRACAO:
				resultado = "O resultado da " + tipoOperacao.valor + " é: " + (valor - valor2);
				break;
			case MULTIPLICACAO:
				resultado = "O resultado da " + tipoOperacao.valor + " é: " + (valor * valor2);
				break;
			case DIVISAO:
				resultado = "O resultado da " + tipoOperacao.valor + " é: " + (valor / valor2);
				break;
			case RAIZ_QUADRADA:
				resultado = "O resultado da " + tipoOperacao.valor + " é: " + (Math.sqrt(valor));
				break;
			default:
				resultado = "Operação inválida";
		}
		
		return resultado;
	}

}
