package modelo;

public class Caixa extends Funcionario {
	private int numDoGuiche;

	public int getNumDoGuiche() {
		return numDoGuiche;
	}

	public void setNumDoGuiche(int numDoGuiche) {
		this.numDoGuiche = numDoGuiche;
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}
}
