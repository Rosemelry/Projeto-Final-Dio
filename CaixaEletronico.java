package banco;

public class CaixaEletronico {

	ContaCorrente cc = new ContaCorrente();
	
	public void iniciar() {
		
		
		cc.depositar(100);
		System.out.println("Seu saldo é: "+cc.getSaldo());
		
		sacar(50);
		
		System.out.println("Seu saldo é: "+cc.getSaldo());
		cc.depositar(200);
		System.out.println("Seu saldo é: "+cc.getSaldo());
		
	}
	
	public void sacar(double valor) {
		
		if (cc.getSaldo() < valor)
			System.out.println("Imposível realizar o saque!");
		else
			cc.sacar(valor);
					
	}

}
