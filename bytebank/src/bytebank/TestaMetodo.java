package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(150);
		contaDoPaulo.saca(100);
		
		System.out.println("seu saldo é de : R$ " + contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		
		System.out.println("seu saldo é de : R$ " + contaDoPaulo.saldo);
		System.out.println("seu saldo é de : R$ " + contaDaMarcela.saldo);
	}
}
