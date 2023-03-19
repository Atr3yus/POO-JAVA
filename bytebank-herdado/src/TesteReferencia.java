
public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer de = new Designer();
		de.setSalario(2000.0);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(de);
				
		System.out.println(controle.getSoma());
		
	}
	
	//funciona pois Gerente é um Funcionario, a classe filha pertence a classe mãe, recebe os metodos da classe mãe
	//mas não recebe os metodos da classe Gerente
	//	Funcionario g6 = new Gerente();
	//	g6.setNome("VAdu");
}
