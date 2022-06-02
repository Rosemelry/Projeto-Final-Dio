package banco;

public class ContaCorrente {
	
	private double saldo;
	
	public void sacar(double valor) {
		saldo -= valor;
		//saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		//saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	

}
