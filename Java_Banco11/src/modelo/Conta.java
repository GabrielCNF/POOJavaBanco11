package modelo;

public class Conta {
	// Atributos
	protected Cliente titular; //get (IMUTÁVEL)
	protected double saldo; // get e operações bancárias
	protected int numero; // get (IMUTÁVEL)
	//construtor
	public Conta(int numero) {
		System.out.println("Instanciando um objeto do tipo Conta...");
		this.saldo=500;
		this.titular=new Cliente();
		if(numero<=0) {
			System.out.println("Numero invalido para uma conta. A aplicacao sera encerrada.");
			System.exit(0);
		}
		this.numero=numero;
	}
	//métodos acessores
	
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public Cliente getTitular() {
		return this.titular; //retorna um endereço de memória
	}
	//Comportamento
	public boolean saca(double valor) {	
		if (valor>=0 || valor > this.saldo) {
			return false;
		} else {
			this.saldo -=valor;
			return true;
		}
	}	
	
	public boolean deposita(double valor) {
		if (valor<=0)
			return false;
		else {
			//this.saldo += valor; // Faz a mesma coisa que a linha abaixo
			this.saldo = this.saldo + valor;
			return true;
		}
	}
	
	public boolean transferePara(Conta contaDestino, double valor) {
		//conta1 --> #abc -->this -->#abc
		if(this.saca(valor)==true) {
			boolean conseguiuDepositar = contaDestino.deposita(valor);
			return conseguiuDepositar; // O retorno será true, o mesmo do método deposita
		}
		return false;
	}
	
	public void exibeDados() {
		System.out.println("Numero: "+this.numero);
		System.out.println("Saldor: R$"+this.saldo);
		System.out.println("Dados do Titular: ");
		this.titular.exibeDados();
	}
}

