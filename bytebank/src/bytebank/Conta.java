package bytebank;

public class Conta {
	//caracteristicas ou atributos
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//metodos 
	
	//saca = sacar dinheiro
	//deposita = depositar dinheiro
	//transfere = tranferir dinheiro entre contas
	
	public void deposita(double valor) {		
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;			
		} else {
			System.out.println("você não tem saldo suficiente");
			return false;			
		}		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
