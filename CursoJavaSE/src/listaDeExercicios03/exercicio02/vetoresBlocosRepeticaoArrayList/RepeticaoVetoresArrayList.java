package listaDeExercicios03.exercicio02.vetoresBlocosRepeticaoArrayList;

import java.util.ArrayList;

public class RepeticaoVetoresArrayList {

	// A)

	// declarando array simples com int
	ArrayList<Integer> numerosImpares = new ArrayList<>();

	// declarando array Simples com double
	ArrayList<Double> notasArtes = new ArrayList<>();

	// declarando array Simples com string
	ArrayList<String> melhoresAtores = new ArrayList<>();

	public RepeticaoVetoresArrayList() {

		// atribuindo valores à minha lista de números impares
		numerosImpares.add(1);
		numerosImpares.add(3);
		numerosImpares.add(5);
		numerosImpares.add(7);
		numerosImpares.add(9);

		// atribuindo valores à minha lista de notas de matematica
		notasArtes.add(6.25);
		notasArtes.add(7.5);
		notasArtes.add(8.75);
		notasArtes.add(9.5);
		notasArtes.add(9.75);

		// atribuindo valores à minha lista de melhores lutadores
		melhoresAtores.add("Misha Collis");
		melhoresAtores.add("Jared Padalecki");
		melhoresAtores.add("Mark Sheppard");
		melhoresAtores.add("Jensen Ackles");
		melhoresAtores.add("Mark Pellegrino");
	}

	public static void main(String[] args) {
		RepeticaoVetoresArrayList rval = new RepeticaoVetoresArrayList();

		rval.exibirListasComBlocosDeRepeticao();

		rval.exibirValoreslista(0);
	}

	public void exibirListasComBlocosDeRepeticao() {

		// B)

		// imprimindo a primeira lista com For

		for (int i = 0; i < numerosImpares.size(); i++) {
			System.out.println(numerosImpares.get(i));
		}

		// imprimindo a segunda lista com For Each
		for (double na : notasArtes) {
			System.out.println(na);
		}

		// imprimindo a terceira lista com a classe auxiliar Arrays
		String n = melhoresAtores.toString();
		System.out.println(n);

	}

	public void exibirValoreslista(int index) {

		// C)
		System.out.println(numerosImpares.get(index));
		System.out.println(notasArtes.get(index));
		System.out.println(melhoresAtores.get(index));

	}

}
