
public class Designer extends Funcionario {

	public double getBonificao() {
		return super.getBonificao() + 200;
		//super substitui o this para indicar que vem da classe mão  e não desta classe
	}
}
