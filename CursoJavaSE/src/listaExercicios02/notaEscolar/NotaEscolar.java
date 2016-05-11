package listaExercicios02.notaEscolar;

public class NotaEscolar {

	
	// Declarando atributos
	private String nomeAluno;

	private int anoEscolar;

	private String situacao;

	private double[] notas;

	private boolean aprovado;

	
	// Inicio m�todo que calcula a m�dia
	public double calcularMediaEscolar(double[] notas) {

		double totalNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];
		}

		double resultado = totalNotas / notas.length;

		return resultado;
	}
	// fim do m�todo

	// Inicio m�todo que calcula a m�dia
	public double calcularMediaEscolar() {

		double totalNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];
		}

		double resultado = totalNotas / notas.length;

		return resultado;
	}
	// fim do m�todo

	
	// Inicio m�todo que verifica a situa��o do aluno
	public void verificarSituacao(double media) {

		if (media < 4) {
			situacao = "Aluno foi reprovado";
			aprovado = false;
		} else if (media >= 4 && media < 6) {
			situacao = "Aluno em recupera��o";
			aprovado = false;
		} else {
			situacao = "Aluno foi aprovado";
			aprovado = true;
		}

	}
	// fim do m�todo

	
	// Criando os m�todos de acesso ( getters and setters )
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(int anoEscolar2) {
		anoEscolar = anoEscolar2;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
