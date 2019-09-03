package bytebank;

public class TestaMetodo2 {
	public static void main(String[] args) {

		
	Conta contaDoTony = new Conta();
	contaDoTony.saldo = 100;
	contaDoTony.deposita(45);
	System.out.println(contaDoTony.saldo);
	
	boolean conseguiuRetirar = contaDoTony.saca(15);
	//contaDoTony.saca(200);
	System.out.println("seu saldo atual é: "+ contaDoTony.saldo);
	System.out.println(conseguiuRetirar);

	Conta contaDaMaria = new Conta();
	contaDaMaria.deposita(1000);
	
	
	if(contaDaMaria.transfere(3000, contaDoTony)) {
		System.out.println("Transferencia realizada com sucesso");
	}else {
		System.out.println("Faltou dinheiro");
	}
	System.out.println("Saldo da conta da Maria: " +contaDaMaria.saldo);
	System.out.println("Saldo da conta do Tony: "+ contaDoTony.saldo);
	}
}
