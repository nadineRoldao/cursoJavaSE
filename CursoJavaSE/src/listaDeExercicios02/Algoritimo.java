package listaDeExercicios02;

import java.util.Scanner;
/*
	nome: algoritimo
	data:19/04
	número:exercício 07
*/
public class Algoritimo {
	
	public static void main(String[] args) {
		
		 //declarando as variáveis
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		int numero03;

		// Menu principal
		System.out.println("");
		System.out.println("**************************************************************");
		System.out.println("******* ALGORITMO - exibir numeros em odem decrescente *******");
		System.out.println("**************************************************************");
		System.out.println("");

		System.out.println("Informe um primeiro inteiro: ");
		numero01 = sc.nextInt();

		System.out.println("Informe um segundo inteiro diferente do primeiro: ");
		numero02 = sc.nextInt();

		System.out.println("Informe um terceiro inteiro diferente do primeiro e do segundo: ");
		numero03 = sc.nextInt();
		
		int maior = 0;
		int meio = 0;
		int menor = 0;

		//comparando numero 01
		if(numero01 > numero02 && numero01 > numero03){
			maior = numero01;
		}else if (numero01 < numero02 && numero01 < numero03){
			menor = numero01;
		}else{
			meio  = numero01;
		}

		//comparando numero 02
		if(numero02 > numero01 && numero02 > numero03){
			maior = numero02;
		}else if (numero02 < numero01 && numero02 < numero03){
			menor = numero02;
		}else{
			meio  = numero02;
		}

		//comparando numero 03
		if(numero03 > numero02 && numero03 > numero01){
			maior = numero03;
		}else if (numero03 < numero02 && numero03 < numero01){
			menor = numero03;
		}else{
			meio  = numero03;
		}

		System.out.println("numeros em ordem decrescente: " + maior + ", " + meio + ", " + menor);
		
		sc.close();

	}

}
