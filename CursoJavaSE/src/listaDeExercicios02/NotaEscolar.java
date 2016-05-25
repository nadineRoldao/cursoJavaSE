package listaDeExercicios02;

import java.util.Scanner;

/*
	nome:Nota Escolar
	data:15/04
	n�mero:exerc�cio 01
*/
public class NotaEscolar {
	
	public static void main(String[] args) {
		 
		 //declarando as vari�veis
		Scanner sc = new Scanner(System.in);
		double notaMateria01;
		double notaMateria02;
		double notaMateria03;
		double notaMateria04;
		double notaMateria05;
		double notaFinal;
		String situacao;


		// Menu principal
		System.out.println("");
		System.out.println("**************************************************");
		System.out.println("******* SISTEMA - NOTA FINAL MEDIA ESCOLAR *******");
		System.out.println("**************************************************");
		System.out.println("");

		
		// Recuperando as informa��es fornecidas pelo usu�rio
		System.out.println("Informe a nota da materia de Portugues: ");
		notaMateria01 = sc.nextDouble();

		System.out.println("Informe a nota da materia de Matematica: ");
		notaMateria02 = sc.nextDouble();

		System.out.println("Informe a nota da materia de Ciencias: ");
		notaMateria03 = sc.nextDouble();

		System.out.println("Informe a nota da materia de Geografia: ");
		notaMateria04 = sc.nextDouble();

		System.out.println("Informe a nota da materia de Historia: ");
		notaMateria05 = sc.nextDouble();


		// Calculando a m�dia
		notaFinal = (notaMateria01 + notaMateria02 + notaMateria03 + notaMateria04 + notaMateria05) / 5;


		// Verificando a situa��o
		if(notaFinal < 4){

			situacao = "O aluno esta reprovado!";

		}else if(notaFinal >=4 && notaFinal <6){

			situacao = "O aluno esta de recuperacao!";

		}else{

			situacao = "O aluno esta aprovado!";	
		}


		// exibindo os resultados
		System.out.println();
		System.out.println("***********************");
		System.out.println("****** RESULTADO ******");
		System.out.println("***********************");
		System.out.println();

		System.out.println("Media nota escolar: " + notaFinal);
		System.out.println(situacao);

		sc.close();
	}

}