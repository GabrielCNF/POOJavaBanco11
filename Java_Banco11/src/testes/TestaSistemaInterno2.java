package testes;

import modelo.Diretor;
import modelo.Gerente;
import modelo.SistemaInterno;
import modelo.Tesoureiro;

public class TestaSistemaInterno2 {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		Gerente g1,g2;
		g1 = new Gerente();
		g2 = new Gerente();
		
		g1.setSenha(123);
		g2.setSenha(123);
		
		g1.setNome("jorge");
		g2.setNome("carlos");
		
		Diretor d1 = new Diretor();
		d1.setNome("Reinaldo");
		d1.setSenha(123);
		
		Tesoureiro t = new Tesoureiro();
		t.setNome("shelton");
		t.setSenha(123);
		
		si.login(g1);
		si.login(g2);
		si.login(d1);
		si.login(t);
	}

}
