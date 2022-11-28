package bancoAlura;

public class Vendedor extends Funcionario {

	private String cidade;

	// metodo
	public double bonifica() {
		return super.bonifica() + 2;
	}

}
