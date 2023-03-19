package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
			
		primeiraConta.saldo += 100;
		System.out.println("Seu saldo na primeiraConta é de R$ " + primeiraConta.saldo + " Reais");
				
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Seu saldo na segundaConta é de R$ " + segundaConta.saldo);
		
		System.out.println(primeiraConta.titular);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são iguais");
		}else {
			System.out.println("não são iguais");// contas não possuem endereços 
			//iguais pois foi criado um novo objeto
				}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
