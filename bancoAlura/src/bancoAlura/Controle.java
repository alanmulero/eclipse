package bancoAlura;

public class Controle {

	private double soma;

	public void registra(Funcionario f) {

		this.soma = this.soma + f.bonifica();
	}

	public double getSoma() {
		return soma;
	}

}
