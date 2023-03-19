//extends quer dizer que a classe herda os atributos da classe Funcionario 
public class EditorVideo extends Funcionario{

	public double getBonificao() {
		return super.getBonificao() + 100;
		//super substitui o this para indicar que vem da classe mão  e não desta classe
	}
	
}
