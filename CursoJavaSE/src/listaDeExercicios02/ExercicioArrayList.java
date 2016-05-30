package listaDeExercicios02;

import java.util.Scanner;
import java.util.ArrayList;

/*
	nome:Array List Com For E For Each
	data:20/04
	número:exercício 11
*/

public class ExercicioArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> wweNomes = new ArrayList<String>();
		wweNomes.add("Roman");
		wweNomes.add("Dean");
		wweNomes.add("Dolph");
		wweNomes.add("AJ");
		wweNomes.add("Star");
		wweNomes.add("Kevin");
		wweNomes.add("Kalisto");

		ArrayList<String> wweNomesMulheres = new ArrayList<String>();
		wweNomesMulheres.add("Sasha");
		wweNomesMulheres.add("Charlotte");
		wweNomesMulheres.add("Becky");
		
		System.out.println("digite um nome que esteja na lista: ");
		String valor = sc.next();


		System.out.println();

		//Exibindo a lista inteira
		System.out.println(wweNomes.toString());

		System.out.println("Tamanho do ArrayList: " + wweNomes.size());
		System.out.println("WWE World Heavyweight Champion: " + wweNomes.get(0));
		System.out.println();

		boolean contem = wweNomes.contains(valor);

		if (contem) {
			int posicao = wweNomes.indexOf(valor);
			System.out.println("O nome " + wweNomes.get(posicao) + " existe na lista !");
		} else {
			System.out.println("o nome nao esta na lista");
		}
		System.out.println();

			sc.close();
	}

}
