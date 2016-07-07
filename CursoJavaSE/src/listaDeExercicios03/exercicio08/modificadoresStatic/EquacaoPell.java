package listaDeExercicios03.exercicio08.modificadoresStatic;

public class EquacaoPell {
	
	public static String calcularEquacaoPell(int numero) {

		int numeroExibir = numero;

		// inicialmente o resultado é zero
		int resultado = 0;

		// inicialmente impar é um
		int impar = 1;

		// enquanto a subtração de numero por impar for maior ou igual a
		// zero, vai no bloco while
		while ((numero - impar) >= 0) {
			resultado++; // contando o número de ciclos (entradas no bloco
							// while) - chamamos isso de operação de incremento
			numero -= impar; // realizando a subtração própriamente dita
			impar += 2; // aumentando os números ímpares
		}

		// Verificando se o número é absoluto ou aproximado
		if (numero == 0) {
			System.out.println("A RAIZ QUADRADA É ABSOLUTA");
		} else {
			System.out.println("O VALOR DA RAIZ QUADRADA É APROXIMADO");
		}

		return "O resultado da raiz quadrada de [" + numeroExibir + "] é: " + "[" + resultado + "]";
	}


}
