package modelo;

public class Tesoureiro extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public int getSenha() {
		return this.senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) 
			return true;
		return false;
	}
	
	@Override
	public double getBonificacao() {
		//super é mais descritivo uma vez que o atributo está na superclasse
		return super.salario * 0.20;
	}
}
