import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contasPoupanca;
	private List<Conta> contasCorrente;

	public Banco(String nome) {
		this.nome = nome;
		contasPoupanca = new ArrayList<>();
		contasCorrente = new ArrayList<>();
	}

	public void criarContaPoupanca(Cliente cliente) {
		ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
		contasPoupanca.add(contaPoupanca);
	}

	public void criarContaCorrente(Cliente cliente) {
		ContaCorrente contaCorrente = new ContaCorrente(cliente);
		contasCorrente.add(contaCorrente);
	}

	public void depositarContaPoupanca(Cliente cliente, double valor) {
		for(Conta conta : contasPoupanca) {
			if (conta.cliente.equals(cliente))
				conta.depositar(valor);
			return;
		}
	}

	public void depositarContaCorrente(Cliente cliente, double valor) {
		for(Conta conta : contasCorrente) {
			if (conta.cliente.equals(cliente))
				conta.depositar(valor);
			return;
		}
	}

	public void sacarContaPoupanca(Cliente cliente, double valor) {
		for(Conta conta : contasPoupanca) {
			if (conta.cliente.equals(cliente))
				conta.sacar(valor);
			return;
		}
	}

	public void sacarContaCorrente(Cliente cliente, double valor) {
		for(Conta conta : contasCorrente) {
			if (conta.cliente.equals(cliente))
				conta.sacar(valor);
			return;
		}
	}

	public void transferir (Conta contaEnvio, Conta contaDestino, double valor) {
		contaEnvio.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void listarContasPoupanca() {
		System.out.println("Contas Poupança cadastradas no banco " + this.nome + ".");
		for(Conta conta : contasPoupanca) {
			conta.imprimirInfosComuns();
		}
	}

	public void listarContasCorrente() {
		System.out.println("Contas Corrente cadastradas no banco " + this.nome + ".");
		for(Conta conta : contasCorrente) {
			conta.imprimirInfosComuns();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContasPoupanca() {
		return contasPoupanca;
	}

	public void setContasPoupanca(List<Conta> contasPoupanca) {
		this.contasPoupanca = contasPoupanca;
	}

	public List<Conta> getContasCorrente() {
		return contasCorrente;
	}

	public void setContasCorrente(List<Conta> contasCorrente) {
		this.contasCorrente = contasPoupanca;
	}

}
