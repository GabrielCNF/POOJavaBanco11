package modelo;

public class Diretor extends Gerente {
	@Override
	public double getBonificacao() {
		return super.salario * 0.50;
	}
}
