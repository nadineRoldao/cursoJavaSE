package listaDeExercicios02;

/**
 * nome: melhor combustivel data: 27/04/2016 número: 19
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
		System.out.println("********* QUAL O MELHOR COMBUSTÍVEL **********");
		System.out.println("**********************************************");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		double alcool;
		
		double gasolina;
		
		double resultado;
		
		System.out.println("Insira aqui o preço da gasolina: ");
		gasolina = sc.nextDouble();
		
		System.out.println("Insira aqui o preço do alcool: ");
		alcool = sc.nextDouble();
		
		resultado = alcool / gasolina;
		
		
		if (resultado < 0.7){
			
			System.out.println("O combustível mais econômico é o Alcool !!!");
			
		}else {
			
			System.out.println("O combustível mais econômico é a gasolina !!!");
			
		}
		sc.close();
	}
	
}
