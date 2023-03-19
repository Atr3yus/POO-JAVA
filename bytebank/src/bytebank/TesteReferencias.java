package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;		
		System.out.println("saldo da primeiraConta: " + primeiraConta.saldo);
	
		Conta segundaConta = primeiraConta; //copia o endereço referente a primeiraConta
		System.out.println("saldo da segundaConta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segundaConta: " + segundaConta.saldo);		
		System.out.println("saldo da primeiraConta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são iguais");//contas possuem mesmo endereço, pois foi atribuido a segundaConta,
			//o endereço da primeiraConta (Conta segundaConta = primeiraConta;)
		}else {
			System.out.println("não são iguais");
			}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
