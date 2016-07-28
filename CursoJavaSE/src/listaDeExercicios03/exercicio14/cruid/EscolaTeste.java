package listaDeExercicios03.exercicio14.cruid;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Endereco e = new Endereco("5546-445", Logradouro.RUA, "Jo�o da Couves", 14, "S�o Paulo", "S�o Paulo", "bloco 5");
		Endereco ed = new Endereco("02343-030", Logradouro.RUA, "Mere Marie Anais de Sion", 472, "S�o Paulo", "S�o Paulo", "apto.8");
		
		Escola ec = new Escola(null, "colegio sao paulo", e);
		ec.adicionarAluno("Julia", 14, ed, true);
		ec.adicionarAluno("Nadine", 13, e, false);
		ec.adicionarAluno("Lucas", 14, ed, false);
		ec.adicionarAluno("Raphael", 13, e, true);
		ec.adicionarAluno("Giovanna", 13, ed, true);
		
		int codigoAluno = ec.getAlunos().get(1).getCodigoAluno();
		
		ec.atualizarEnderecoAluno(codigoAluno, e);
		
		ec.alunosMatricula();
		
		Aluno aluno = ec.pesquisarAluno(codigoAluno);
		System.out.println(aluno.toString());
		
		ec.removerAluno(codigoAluno);
		
	}
	
}
