package listaDeExercicios03.exercicio14.cruid;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Endereco e = new Endereco("5546-445", Logradouro.RUA, "Jo�o da Couves", 14, "S�o Paulo", "S�o Paulo", "bloco 5");
		Endereco ed = new Endereco("02343-030", Logradouro.RUA, "Mere Marie Anais de Sion", 472, "S�o Paulo", "S�o Paulo", "apto.8");
		
		Escola ec = new Escola(null, "colegio sao paulo", e);
		ec.adicionarAluno("Julia", 14, ed, true);
		ec.adicionarAluno("Nadine", 13, e, false);
		
		int codigoAluno = ec.getAlunos().get(0).getCodigoAluno();
		
		ec.atualizarEnderecoAluno(codigoAluno, e);
		
		ec.alunosMatricula();
		
		ec.removerAluno(codigoAluno);
		
		
	}
	
}
