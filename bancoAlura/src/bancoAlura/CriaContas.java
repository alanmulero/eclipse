package bancoAlura;

public class CriaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente um = new Gerente();
		Cadastro umNovo = new Cadastro();
		um.setTitular(umNovo);
		um.getTitular().setNome("Toledo");
		System.out.println(um.getTitular().getNome());
		umNovo.setIdade(53);
		um.deposita(30);
		um.setSenha(11);
		
		Funcionario teste = new Funcionario();
		teste.deposita(10);
		System.out.println("Saldo funcionario: "+ teste.getSaldo());
		teste.saca(4);
		System.out.println("Saldo funcionario depois do saque: "+ teste.getSaldo());
		um.transfere(5, teste);
		System.out.println("Saldo do funcionario depois da tranferencia: "+ teste.getSaldo());

		
		
		
		
		//System.out.println(um.getSaldo());
		//System.out.println(um.bonifica());
		
		// Criando segunda conta
		Vendedor vendUm = new Vendedor();
		vendUm.deposita(5);
		// Funcionario
		
		// Instanciando controle de registro
		Controle automatico = new Controle();
		automatico.registra(um);
		automatico.registra(vendUm);
		System.out.println("Salto Total "+automatico.getSoma());
		System.out.println("Saldo do umNovo: "+ umNovo.getSaldo());
		System.out.println("Saldo do gerente um: "+ um.getSaldo());

	}

}
