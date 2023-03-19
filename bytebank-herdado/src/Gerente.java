//extends quer dizer que a classe herda os atributos da classe Funcionario 
public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}	
	
//	public boolean autentica(String login, int senha) {
//		
//	}
//	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public double getBonificao() {
		return super.getBonificao() +  super.getSalario();	
		//super substitui o this para indicar que vem da classe mão  e não desta classe
	}
	
}
