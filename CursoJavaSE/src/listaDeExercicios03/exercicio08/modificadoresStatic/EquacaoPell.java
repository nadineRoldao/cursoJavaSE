package listaDeExercicios03.exercicio08.modificadoresStatic;

public class EquacaoPell {
	
	public static String calcularEquacaoPell(int numero) {

		int numeroExibir = numero;

		// inicialmente o resultado � zero
		int resultado = 0;

		// inicialmente impar � um
		int impar = 1;

		// enquanto a subtra��o de numero por impar for maior ou igual a
		// zero, vai no bloco while
		while ((numero - impar) >= 0) {
			resultado++; // contando o n�mero de ciclos (entradas no bloco
							// while) - chamamos isso de opera��o de incremento
			numero -= impar; // realizando a subtra��o pr�priamente dita
			impar += 2; // aumentando os n�meros �mpares
		}

		// Verificando se o n�mero � absoluto ou aproximado
		if (numero == 0) {
			System.out.println("A RAIZ QUADRADA � ABSOLUTA");
		} else {
			System.out.println("O VALOR DA RAIZ QUADRADA � APROXIMADO");
		}

		return "O resultado da raiz quadrada de [" + numeroExibir + "] �: " + "[" + resultado + "]";
	}


}
