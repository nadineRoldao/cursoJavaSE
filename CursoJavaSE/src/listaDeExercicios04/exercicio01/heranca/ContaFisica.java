package listaDeExercicios04.exercicio01.heranca;

public class ContaFisica extends Conta{

	private String numeroCPF;
	
	@Override
	public void sacar(float valorSaque){
		if(valorSaque <= 800.00 && valorSaque <= getSaldoConta()){
			 getSaldoConta() -= valorSaque;
			System.out.println("O valor sacado foi: " + valorSaque);
		}else{
			System.out.println("Voc� s� pode sacar at� 800,00 reais, mesmo que voc� tenha saldo o suficiente!");
			
		}
	}
	
	@Override
	public float socilicitarEmprestimo(float valor) {
		return 0;
	}
	
}
