package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		//System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100.00;
		System.out.println("O valor do saldo da primeira conta é "+ primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 140.00;
		segundaConta.saldo = segundaConta.saldo / 2;
		
		System.out.println("O valor do saldo da segunda conta é "+ segundaConta.saldo);
		
		

	}
}
