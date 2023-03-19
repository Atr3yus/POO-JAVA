
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.05;		
		//para "caber" um numero double em uma variavel int foi usado (int) antes da variavel double, resultado corta as casas apos virgula
		int valor = (int)salario;
		System.out.println(valor);
		
		double pi = 1.14;
		System.out.println(pi);
	}

}
