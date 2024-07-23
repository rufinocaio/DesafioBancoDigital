public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Caio");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		banco.criarContaCorrente(venilton);
		banco.criarContaPoupanca(venilton);

		banco.depositarContaCorrente(venilton, 100);
		banco.sacarContaCorrente(venilton, 50);
		banco.depositarContaPoupanca(venilton, 200);

		banco.listarContasCorrente();
		banco.listarContasPoupanca();
	}

}
