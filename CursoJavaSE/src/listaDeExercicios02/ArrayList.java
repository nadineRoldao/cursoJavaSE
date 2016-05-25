package listaDeExercicios02;

import java.util.Scanner;
import java.util.ArrayList;

/*
	nome:Array List Com For E For Each
	data:20/04
	número:exercício 11
*/

public class ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> wweNomes = new ArrayList<String>();
		wweNomes.add("Roman Reigns");
		wweNomes.add("Dean Ambrose");
		wweNomes.add("Dolph Ziggler");
		wweNomes.add("AJ Styles");
		wweNomes.add("Star Dust");
		wweNomes.add("Kevin Owens");
		wweNomes.add("Kalisto");

		ArrayList<String> wweNomesMulheres = new ArrayList<String>();
		wweNomesMulheres.add("Sasha banks");
		wweNomesMulheres.add("Charlotte");
		wweNomesMulheres.add("Becky Linch");
		
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
			System.out.println(wweNomes.get(posicao));
		} else {
			System.out.println("o nome nao esta na lista");
		}
		System.out.println();
		
		sc.close();
	}

}
