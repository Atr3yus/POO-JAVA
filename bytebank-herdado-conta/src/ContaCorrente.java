
public class ContaCorrente extends Conta {

	//houve necessidade de gerar os construtor devido as classes filhas não herdarem os contrutores, 
	//somente atributos e metodos
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
