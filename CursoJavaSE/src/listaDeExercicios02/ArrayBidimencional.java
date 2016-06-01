package listaDeExercicios02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * nome: Array Bidimencional data: 27/04/2016 n�mero: 16
 * 
 * @author Nadine
 *
 */
public class ArrayBidimencional {

	// crtl + espa�o
	public static void main(String[] args) {

		// Criando o objeto Scanner
		Scanner sc = new Scanner(System.in);

		// MENU
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("******* Escolha sua s�rie favorita *******");
		System.out.println("******************************************");
		System.out.println("");

		System.out.println("SELECIONE");
		System.out.println("01 - Supernatural");
		System.out.println("02 - Game of Thrones");
		System.out.println("03 - Once Upon a Time");
		System.out.println();

		// Recebendo a informa��o do usu�rio
		int escolha = sc.nextInt();
		// Criando um array com duas dimens�es
		String[][] series = {
		
				{ "SPN", "Jensen", "Jared", "Misha" },
				{ "GOT", "John Snow", "Sansa Stark", "Aria Stark" },
				{ "OUAT", "Jenniffer", "Josh Dallas", "Lana Parilla" } 
				
		};

		String nomes;

		switch (escolha) {
		case 1:
			nomes = Arrays.toString(series[0]);
			System.out.println(nomes);
			break;

		case 2:
			nomes = Arrays.toString(series[1]);
			System.out.println(nomes);
			break;

		case 3:
			nomes = Arrays.toString(series[2]);
			System.out.println(nomes);
			break;

		default:
			System.out.println("Op��o n�o � v�lida !");
			break;
		}
		
		// Fechando a classe Scanner.
		sc.close();
	}

}