package modelo;

public class ContabilizadorDeBonificacoes {
	private double totalEmBonificacoes=0;
	//Agora posso receber todos os subtipos de Funcionario
	public void contabilizaBonificacao(Funcionario f) {
		//O getBonificacao invocado vai depender do objeto que foi passado como argumento
		//Pode ser Gerente, Caixa, Tesoureiro ....
		this.totalEmBonificacoes += f.getBonificacao();
	}

	public double getTotalEmBonificacoes() {
		return totalEmBonificacoes;
	}
}
