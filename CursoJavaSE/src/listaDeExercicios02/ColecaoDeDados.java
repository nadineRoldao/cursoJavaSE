package listaDeExercicios02;

/*
nome:colecao de dados
data:19/04
número:exercício 05
*/

import java.util.Arrays;

public class ColecaoDeDados {


	public static void main(String[] args) {
		
		String[] lista = {"Roman", "Dean", "Misha", "Jared", "Jensen", "Colin", "Robert"};
	
		// Menu principal
		System.out.println("");
		System.out.println("*****************************************");
		System.out.println("******* COLECAO DE DADOS *******");
		System.out.println("*****************************************");
		System.out.println("");
	
		Arrays.sort(lista, 0, lista.length); 
	
		System.out.println(Arrays.toString(lista));
	
		int posicao = Arrays.binarySearch(lista, "Roman");
		int posicao2 = Arrays.binarySearch(lista, "Dean");
		int posicao3 = Arrays.binarySearch(lista, "Misha");
		int posicao4 = Arrays.binarySearch(lista, "Jared");
		int posicao5 = Arrays.binarySearch(lista, "Jensen");
		int posicao6 = Arrays.binarySearch(lista, "Colin");
		int posicao7 = Arrays.binarySearch(lista, "Robert");
	
		System.out.println();
		System.out.println("Posicao: " + posicao + " valor:" + lista[posicao]);   
		System.out.println("Posicao: " + posicao2 + " valor:" + lista[posicao2]);   
		System.out.println("Posicao: " + posicao3 + " valor:" + lista[posicao3]);   
		System.out.println("Posicao: " + posicao4 + " valor:" + lista[posicao4]);   
		System.out.println("Posicao: " + posicao5 + " valor:" + lista[posicao5]);   
		System.out.println("Posicao: " + posicao6 + " valor:" + lista[posicao6]);   
		System.out.println("Posicao: " + posicao7 + " valor:" + lista[posicao7]);   
		
	}

}
