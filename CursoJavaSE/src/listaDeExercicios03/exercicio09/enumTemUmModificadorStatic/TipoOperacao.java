package listaDeExercicios03.exercicio09.enumTemUmModificadorStatic;

public enum TipoOperacao {

	ADICAO("adicao"), SUBTRACAO("subtracao"), MULTIPLICACAO("multiplicacao"), DIVISAO("divisao"), RAIZ_QUADRADA("raiz quadrada");
	
	public String valor;
	
	TipoOperacao(String valor){
		this.valor = valor;
	}
	
}
