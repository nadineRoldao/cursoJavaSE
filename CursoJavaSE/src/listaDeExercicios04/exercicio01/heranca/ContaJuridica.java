package listaDeExercicios04.exercicio01.heranca;

public class ContaJuridica extends Conta {

	private static final long serialVersionUID = 1L;

	private String numeroCNPJ;

	@Override
	public float socilicitarEmprestimo() {
		return getSaldoConta() * 4;
	}

	public String getNumeroCNPJ() {
		return numeroCNPJ;
	}

	public void setNumeroCNPJ(String numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}

}
