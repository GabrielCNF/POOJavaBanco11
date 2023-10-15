package modelo;
public abstract class Funcionario {
	protected String nome;
	protected double salario;	
	//construtor
	public Funcionario() {}
	
	//Métodos abstratos possuem apenas assinatura
	//Isso é uma garantia de que as subclasses concretas implementarão esse método
	public abstract double getBonificacao(); 
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
