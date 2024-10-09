package conta;

public interface IConta {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void trasferir(double valor, Conta contadestino);
	
	void extrato();

}
