package listaDeExercicios03.exercicio11.exercicioFibonacci;

import java.util.ArrayList;

public class FibonacciUtil {
	

	public static ArrayList<Integer> sequenciaFibonacci(int valor) {

		ArrayList<Integer> listaResultado = new ArrayList<>();
		int valorAnterior = 0;
		int valorAtual = 1;
		int soma = 0;

		listaResultado.add(valorAnterior);
		listaResultado.add(valorAtual);

		while (soma < valor) {
			soma = valorAnterior + valorAtual;

			if (soma <= valor) {
				listaResultado.add(soma);
			}

			valorAnterior = valorAtual;
			valorAtual = soma;
		}

		return listaResultado;
	}

	public static int enesimaSequencia(int valor) {

		int valorAnterior = 0;
		int valorAtual = 1;
		int soma = 0;
		int enesima = 0;

		while (soma < valor) {
			soma = valorAnterior + valorAtual;

			if (soma <= valor) {
				enesima = soma;
			}

			valorAnterior = valorAtual;
			valorAtual = soma;
		}

		return enesima;
	}

	public static ArrayList<Integer> valoresFibonacci(int posicoes) {

		ArrayList<Integer> listaResultado = new ArrayList<>();
		int valorAnterior = 0;
		int valorAtual = 1;
		int soma = 0;

		listaResultado.add(valorAnterior);
		listaResultado.add(valorAtual);

		for (int i = 0; i < posicoes - 2; i++) {
			soma = valorAnterior + valorAtual;
			listaResultado.add(soma);

			valorAnterior = valorAtual;
			valorAtual = soma;
		}

		return listaResultado;
	}

}
