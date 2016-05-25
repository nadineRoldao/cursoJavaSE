package listaDeExercicios01;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int valor = 10;

		// Os exemplos abaixo são para ilustrar duas formas de fazer a mesma coisa.

		//valor = valor + 10;
		  valor += 10;

		  //valor = valor - 10;
		  valor -= 10;

		  //valor = valor * 10;
		  valor *= 10;

		  //valor = valor / 10;
		  valor /= 10;

		double numero = 13;

		// Na programação chamamos o sinal % de módulo
		// numero = numero % 2;
		   numero %= 2;


		   System.out.println(valor);
		   System.out.println(numero);

	}

}
