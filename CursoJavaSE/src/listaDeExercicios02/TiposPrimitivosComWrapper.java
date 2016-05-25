package listaDeExercicios02;

/*
nome:Mostrar Wrapper - 6 erros
data:18/04
número:exercício 02
*/
public class TiposPrimitivosComWrapper {

public static void main(String[] args) {
	
	// erro1: o double tinha que estar em camel case(nao sei se e assim que se escreve)
	// Não exite toString() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso Double
	Double valor1 = 45.78;
	String valor1Convertido = valor1.toString();
	// Não exite toString() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso Double


	// erro2: voce esta convertendo double normal em double normal
	String valor2 = "15.98";
	double valor2Convertido = Double.parseDouble(valor2);
	// Não exite parseDouble() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso Double


	// erro3: nao existe "int" na classe wrapper
	Integer valor3 = 10;
	String valor3Convertido = valor3.toString();

	// erro4: o float tinha que estar em camel case(nao sei se e assim que se escreve)
	Float valor4 = 3.50f;
	String valor4Convertido = valor4.toString();
	// Não exite toString() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso FLoat

	// erro5: o long tinha que estar em camel case(nao sei se e assim que se escreve)
	Long valor5 = 10l;
	String valor5Convertido = valor5.toString();
	// Não exite toString() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso Long

	// erro6: o boolean tinha que estar em camel case(nao sei se e assim que se escreve)
	Boolean casado = true;
	String casadoConverter = casado.toString();
	// Não exite toString() para tipos primitivos, temos que usar os tipos das classe Wrapper, no caso Boolean


	System.out.println();
	System.out.println("Erros corrigidos com sucesso !");
	System.out.println();

}

}
