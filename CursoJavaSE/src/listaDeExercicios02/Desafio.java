package listaDeExercicios02;

/*
nome:desafio
data:26/04
número:exercício 14
*/
import java.util.Random;

public class Desafio{

	public static void main(String[] args) {
		
		//MENU
		System.out.println("");
		System.out.println("***********************");
		System.out.println("******* DESAFIO *******");
		System.out.println("***********************");
		System.out.println("");
	
		//declarações
		Random rd = new Random();
	
		//lista
		String[] lutador01 = 
		{"Brock Lesnar", "Kevin Owens", "Chris Jericho", "Triple H", "Baron Corbin"};
	
		String[] lutador02 = {"Roman Reigns", "Dean Ambrose", "Dolph Ziggler", "AJ Styles", "Sami Zayn"};
	
		//Pegando um valor aleatório do primeiro lutador
		int posicaoLutador01 = rd.nextInt(lutador01.length);
	
		//Pegando um valor aleatório do primeiro lutador
		int posicaoLutador02 = rd.nextInt(lutador02.length);
	
		//recuperando o valor da luta.
		String luta = lutador01[posicaoLutador01] + "  vs  " + lutador02[posicaoLutador02];
	
		System.out.println();
		System.out.println("A luta escolhida foi: " + luta);
		System.out.println();
	
	}

}
