import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Banco {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		
		Cliente usuario = new Cliente();
		usuario.setNome("Rafael");
		
		System.out.println("*** Bem Vindo, "+ usuario.getNome() +" ***");
		
		Conta corrente = new ContaCorrente(usuario);
		Conta poupanca = new ContaPoupanca(usuario);
		
		corrente.depositar(100);
		System.out.println("Deposito de R$ 100 recebido.");
		corrente.extrato();
		
		System.out.println("Tranferindo R$ 70 para Conta Poupança");
		corrente.trasferir(70, poupanca);
		poupanca.extrato();
	}
}
