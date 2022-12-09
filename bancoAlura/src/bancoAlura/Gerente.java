package bancoAlura;

public class Gerente extends Funcionario {
	
	public Gerente(int conta, int agencia) {
		super(conta,agencia);
	}

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	// metodos
	public double bonifica() {
		return super.bonifica() + 3;
	}

}
