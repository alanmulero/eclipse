package bancoAlura;

public class ContaCorrente extends Funcionario {
	public ContaCorrente(int conta, int agencia) {
		super(conta, agencia);
	}

	@Override
	public boolean saca(double valor) {
		double saquePoupanca = valor += (valor * 0.10);
		System.out.println("O valor sacado da poupança foi de : =====>" + saquePoupanca);
		return super.saca(valor += (valor * 0.10));
		
	}

}
