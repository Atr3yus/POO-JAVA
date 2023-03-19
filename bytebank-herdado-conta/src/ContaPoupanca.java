
public class ContaPoupanca extends Conta {

	//houve necessidade de gerar os construtor devido as classes filhas não herdarem os contrutores, 
	//somente atributos e metodos
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
}
