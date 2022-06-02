package banco;

public class CaixaEletronico {

	ContaCorrente cc = new ContaCorrente();
	
	public void iniciar() {
		
		
		cc.depositar(100);
		System.out.println("Seu saldo �: "+cc.getSaldo());
		
		sacar(50);
		
		System.out.println("Seu saldo �: "+cc.getSaldo());
		cc.depositar(200);
		System.out.println("Seu saldo �: "+cc.getSaldo());
		
	}
	
	public void sacar(double valor) {
		
		if (cc.getSaldo() < valor)
			System.out.println("Impos�vel realizar o saque!");
		else
			cc.sacar(valor);
					
	}

}
