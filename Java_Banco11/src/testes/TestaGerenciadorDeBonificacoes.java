package testes;

import modelo.Caixa;
import modelo.ContabilizadorDeBonificacoes;
import modelo.Diretor;
import modelo.Funcionario;
import modelo.Gerente;
import modelo.Tesoureiro;

public class TestaGerenciadorDeBonificacoes {
	public static void main(String[] args) {
		//Funcionario F = new Funcionario();
		Funcionario f = new Diretor();
		Gerente g1 = new Gerente();
		g1.setNome("Rafael");
		g1.setSalario(2000);
		Gerente g2 = new Gerente();
		g2.setNome("Fulano");
		g2.setSalario(3000);
		Tesoureiro t1 = new Tesoureiro();
		t1.setNome("Renata");
		t1.setSalario(1500);
		Caixa c1 = new Caixa();
		c1.setNome("Pedro");
		c1.setSalario(1000);
		
		ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
		contabilizador.contabilizaBonificacao(g1);
		contabilizador.contabilizaBonificacao(g2);
		contabilizador.contabilizaBonificacao(c1);
		contabilizador.contabilizaBonificacao(t1);
		
		System.out.println("Total em bonificacoes: R$"+contabilizador.getTotalEmBonificacoes());
	}
}
