package listaExercicios02.notaEscolar;

import java.util.Scanner;

public class TesteNotaEscolar {
	
	public static void main(String[] args) {
		
		// Menu principal
		System.out.println("");
		System.out.println("**************************************************");
		System.out.println("******* SISTEMA - NOTA FINAL MEDIA ESCOLAR *******");
		System.out.println("**************************************************");
		System.out.println("");
		
		double[] notas = new double[4];
		
		NotaEscolar notaAluno = new NotaEscolar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		notaAluno.setNomeAluno( sc.nextLine() );
		
		System.out.println("Informe o ano escolar do aluno: ");
		notaAluno.setAnoEscolar( sc.nextInt() );
		
		System.out.println("Informe a nota do 1º bm: ");
		notas[0] = sc.nextDouble();
		
		System.out.println("Informe a nota do 2º bm: ");
		notas[1] = sc.nextDouble();
		
		System.out.println("Informe a nota do 3º bm: ");
		notas[2] = sc.nextDouble();
		
		System.out.println("Informe a nota do 4º bm: ");
		notas[3] = sc.nextDouble();
				
		notaAluno.setNotas(notas);

		double resultado = notaAluno.calcularMediaEscolar();
		
		notaAluno.verificarSituacao(resultado);
		
		// Exibindo as informações
		System.out.println(notaAluno.getNomeAluno());
		System.out.println(notaAluno.getAnoEscolar());
		System.out.println("Resultado: " + resultado + ", situação: " + notaAluno.getSituacao());
		System.out.println("O aluno foi aprovado ? " + notaAluno.isAprovado());
		
		sc.close();
	}

}
