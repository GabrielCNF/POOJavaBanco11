package testes;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1);
		cc.deposita(6000);
		cc.saca(1000);
		
		ContaPoupanca cp = new ContaPoupanca(2);
		cp.deposita(4000);
		
		cc.transferePara(cp, 500);
		System.out.println("Saldo de cc: "+cc.getSaldo());//5000
		System.out.println("Saldo de cp: "+cp.getSaldo());//5000
	}
}
