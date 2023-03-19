
public class Conta {

	//caracteristicas ou atributos
		
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total = 0;	//static deixa o atributo global, valendo
		
		//costrutor
		public Conta(int agencia, int numero) {
			Conta.total++;
			//System.out.println("O total de contas é de " + Conta.total);
			this.agencia = agencia;
			this.numero = numero;
			//this.saldo = 100;
			//System.out.println("Estou criando uma conta " + this.numero);
		}
				
		//metodos 
		 
		//saca = sacar dinheiro
		//deposita = depositar dinheiro
		//transfere = tranferir dinheiro entre contas
		
		public void deposita(double valor) {		
			if(valor >= 1) {		//condição para não ser possivel depositar valores negativos
				this.saldo += valor;
			} else {
				System.out.println("Não é possivel fazer essa transação");
			}
		}
		
		public boolean saca(double valor) {
			if(this.saldo >= valor) {	//condição para não ser possivel sacar alem do saldo e ficar negativo
				this.saldo -= valor;
				return true;			
			} else {
				System.out.println("você não tem saldo suficiente");
				return false;			
			}		
		}
		
		public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;			//condição para não ser possivel tranferir valor maio que valor do saldo
				destino.deposita(valor);
				return true;
			}
			return false;
		}
		
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero){
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
}















































