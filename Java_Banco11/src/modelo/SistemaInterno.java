package modelo;

public class SistemaInterno {
	private int senhaDoSistema = 123;
	
	public void login(Autenticavel a) {
		if(a.autentica(this.senhaDoSistema)==true) {
			System.out.println("Acesso liberado!");
		}
		else {
			System.out.println("Acesso Negado");
		}
	}
}
