package listaDeExercicios02;

/**
 * nome: melhor combustivel data: 27/04/2016 n�mero: 19
 * 
 * @author Nadine
 *
 */
import java.util.Scanner;

public class MelhorCombustivel {

	public static void main(String[] args) {

		// menu
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("********* QUAL O MELHOR COMBUST�VEL **********");
		System.out.println("**********************************************");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		double alcool;
		
		double gasolina;
		
		double resultado;
		
		System.out.println("Insira aqui o pre�o da gasolina: ");
		gasolina = sc.nextDouble();
		
		System.out.println("Insira aqui o pre�o do alcool: ");
		alcool = sc.nextDouble();
		
		resultado = alcool / gasolina;
		
		
		if (resultado < 0.7){
			
			System.out.println("O combust�vel mais econ�mico � o Alcool !!!");
			
		}else {
			
			System.out.println("O combust�vel mais econ�mico � a gasolina !!!");
			
		}
		sc.close();
	}
	
}
