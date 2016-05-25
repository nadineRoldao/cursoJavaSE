package listaDeExercicios01;

import java.util.Scanner;

public class OperadorLogico {
	
	public static void main(String[] args) {

		// Instanciando a classe scanner para receber as informações digitadas no prompt(CMD)
		// Obs: não esquecer de fazer o import
		Scanner sc = new Scanner(System.in);
		//exemplo 01 &&
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();

		// Nesse caso todas as expressões devem ser verdadeiras para a variáve ser true.
		boolean isJovem = (idade >= 12) && (idade < 20);

		System.out.println();
		System.out.println("eu sou jovem? " + isJovem);
		System.out.println();
		
		sc.close();
	}

}
