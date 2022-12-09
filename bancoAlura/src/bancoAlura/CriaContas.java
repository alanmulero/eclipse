package bancoAlura;

public class CriaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente um = new Gerente(12345, 5588);
		System.out.println("Numero conta do gerente: " + um.getConta());
		System.out.println("Numero conta do gerente: " + um.getAgencia());
		Gerente dois = new Gerente(1111, 2222);
		Cadastro doisNovo = new Cadastro();
		dois.setTitular(doisNovo);
		dois.getTitular().setNome("Fulano");
		System.out.println(dois.getTitular().getNome());

		Cadastro umNovo = new Cadastro();
		um.setTitular(umNovo);
		um.getTitular().setNome("Toledo");
		System.out.println(um.getTitular().getNome());
		umNovo.setIdade(53);
		um.deposita(30);
		um.setSenha(11);

		// Criando teste de abstract na classe Funcionario
		//Funcionario teste = new Funcionario(123, 3344);
		//System.out.println("Numero da conta: " + teste.getConta());
		//System.out.println("Numero conta do gerente: " + teste.getAgencia());

		//teste.deposita(10);
		//System.out.println("Saldo funcionario: " + teste.getSaldo());
		//teste.saca(4);
		//System.out.println("Saldo funcionario depois do saque: " + teste.getSaldo());
		//um.transfere(5, teste);
		//System.out.println("Saldo do funcionario depois da tranferencia: " + teste.getSaldo());
		// Conta corrente
		ContaCorrente cc = new ContaCorrente(45874, 2233);
		cc.deposita(100);
		cc.saca(10);
		
		ContaPoupanca cp = new ContaPoupanca(5556, 1122);
		cp.deposita(200);
		cc.transfere(10, cp);		//Conta poupança
		System.out.println("Saldo da cc ====> "+cc.getSaldo());
		System.out.println("Saldo da cp "+cp.getSaldo());
		
		ContaPoupanca cpDois = new ContaPoupanca(3333, 5555);
		cpDois.deposita(20);
		
		


		// System.out.println(um.getSaldo());
		// System.out.println(um.bonifica());

		// Criando segunda conta
		Vendedor vendUm = new Vendedor();
		vendUm.deposita(5);
		// Funcionario

		// Instanciando controle de registro
		Controle automatico = new Controle();
		automatico.registra(um);
		automatico.registra(vendUm);
		System.out.println("Salto Total " + automatico.getSoma());
		System.out.println("Saldo do umNovo: " + umNovo.getSaldo());
		System.out.println("Saldo do gerente um: " + um.getSaldo());

	}

}
