
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2221);
		
		System.out.println("Conta Corrente "+conta.getNumero());
		System.out.println("Agência "+ conta.getAgencia());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Siveira");
		paulo.setCpf("222.222.222-77");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		conta.getTitular().setCpf("333.333.333-33");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());
		
		
		
		
	}

}
