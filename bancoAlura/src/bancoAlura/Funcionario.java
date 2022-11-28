package bancoAlura;

public class Funcionario {
	private double saldo;
	private int conta;
	private Cadastro titular;

	public double getSaldo() {
		return saldo;
	}

	

	public double bonifica() {
		return this.saldo ;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public Cadastro getTitular() {
		return titular;
	}

	public void setTitular(Cadastro titular) {
		this.titular = titular;
	}
	//metodos deposita
	public void deposita(double valor) {
		 this.saldo += valor;
	}
	// metodo saca
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			System.out.println("Saque efetivado: valor: "+ valor);
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente.");
			
			return false;
		}
	}
	//metodo transfere
	public boolean transfere(double valor, Funcionario destino) {
		if(this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			System.out.println("Tranferencia realizada com sucesso.");
			return true;
		}else {
			System.out.println("Saldo indisponivel");
			return false;
		}
	}
	
	
	

}
