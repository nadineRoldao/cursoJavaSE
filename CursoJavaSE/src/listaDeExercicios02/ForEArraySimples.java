package listaDeExercicios02;

/*
nome:for e array simples
data:25/04
n�mero:exerc�cio 12
*/
import java.util.Scanner;

public class ForEArraySimples{

	public static void main(String[] args) {
	
		// Menu principal
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("******* For E Array Simples *******");
		System.out.println("***********************************");
		System.out.println("");
	
			// Declara��o de vari�veis			
			Scanner sc = new Scanner(System.in);
			int[] listaNumeros = new int[10];
	
			// Preenchendo o lista com valores informados pelo usu�rio
			for(int i = 0; i < listaNumeros.length; i++) {
				System.out.println("Informe o numero " + (i + 1) + ": ");
				listaNumeros[i] = sc.nextInt();
			}
	
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("******* Exibindo Numeros Pares *******");
			System.out.println("**************************************");
			System.out.println("");
			
			// Exibindo informa��es
			for(int i = 0; i < listaNumeros.length; i++) {
				
				if(listaNumeros[i] % 2 == 0) {
				System.out.println(listaNumeros[i]);
	
				}
			}	
		
			sc.close();
			
		}	

}
