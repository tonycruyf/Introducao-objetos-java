
public class TestaBanco {
	public static void main(String[] args) {
		Cliente tony = new Cliente();
		tony.nome = "Tony Cruyf";
		tony.cpf = "162.345.567-76";
		tony.profissao = "Empresário";
		
		Conta contaDoTony = new Conta();//cria uma nova conta do tipo Conta
		contaDoTony.deposita(100);// deposita o valor de 100 na contaDoTony
		
		contaDoTony.titular = tony; //associa o cliente tony com a conta contaDoTony
		System.out.println(contaDoTony.titular.nome);
		System.out.println(contaDoTony.saldo);
		System.out.println(contaDoTony.titular.cpf);
		System.out.println(contaDoTony.agencia);
	}

}
