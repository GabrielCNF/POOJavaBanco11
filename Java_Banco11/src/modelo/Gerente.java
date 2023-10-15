package modelo;

public class Gerente extends Funcionario implements Autenticavel{

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
		return this.salario * 0.30;
	}
}
