package listaDeExercicios03.exercicio01.vetoresBlocosRepeticao;

import java.util.Arrays;

/**
 * 27/06/2016
 * 
 * @author Nadine
 *
 */

public class RepeticaoVetores {

	// A)

	// declarando array Simples com int
	int[] numerosPares = new int[5];

	// declarando array Simples com double
	double[] notasMatematica = new double[5];

	// declarando array Simples com string
	String[] melhoresLutadores = new String[5];

	public RepeticaoVetores() {

		// atribuindo valores à minha lista de números pares
		numerosPares[0] = 2;
		numerosPares[1] = 4;
		numerosPares[2] = 6;
		numerosPares[3] = 8;
		numerosPares[4] = 10;

		// atribuindo valores à minha lista de notas de matematica
		notasMatematica[0] = 5.55;
		notasMatematica[1] = 6.5;
		notasMatematica[2] = 9.5;
		notasMatematica[3] = 8.75;
		notasMatematica[4] = 7.25;

		// atribuindo valores à minha lista de melhores lutadores
		melhoresLutadores[0] = "Roman Reigns";
		melhoresLutadores[1] = "Seth Rollins";
		melhoresLutadores[2] = "Dean Ambrose";
		melhoresLutadores[3] = "Kevin Owens";
		melhoresLutadores[4] = "Cassady";

	}

	public static void main(String[] args) {
		RepeticaoVetores rv = new RepeticaoVetores();

		rv.exibirListasComBlocosDeRepeticao();

		rv.exibirValoreslista(3);
	}

	public void exibirListasComBlocosDeRepeticao() {

		// B)

		// imprimindo a primeira lista com For

		for (int i = 0; i < numerosPares.length; i++) {
			System.out.println(numerosPares[i]);
		}

		// imprimindo a segunda lista com For Each
		for (double nm : notasMatematica) {
			System.out.println(nm);
		}

		// imprimindo a terceira lista com a classe auxiliar Arrays
		Arrays.sort(melhoresLutadores, 0, melhoresLutadores.length);
		String nomes = Arrays.toString(melhoresLutadores);
		System.out.println(nomes);

	}

	public void exibirValoreslista(int index) {

		// C)
		System.out.println(numerosPares[index]);
		System.out.println(notasMatematica[index]);
		System.out.println(melhoresLutadores[index]);

	}

}
