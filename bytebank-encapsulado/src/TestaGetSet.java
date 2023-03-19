
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo
		conta.deposita(200);
		conta.deposita(-900);
		
		System.out.println(conta.getSaldo());
		
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("123.456.789-0");
		conta.setTitular(paulo);
				
		System.out.println(conta.getTitular().getNome());
		System.out.println("O CPF do Paulo é " + paulo.getCpf());
		
		conta.getTitular().setProfissao("programador");
		
		//imprimindo na tela a informação de dois jeitos diferentes
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(paulo.getProfissao());
	}
}
