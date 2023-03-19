
public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 4300.00;
		
		if (salario > 1900.00 && salario < 2800.00) {
			System.out.println("pode ser deduzido R$142.00");
		}else 	if (salario > 2800.00 && salario < 3751.00) {
			System.out.println("pode deduzir R$350.00");
		} else if (salario > 3751.00 && salario < 4664 ) {
			System.out.println("pode deduzir R$636.00");
		}
	}
		
}



