
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		
		primeiro = 10;
		//primeiro não recebe o valor 10
		
		System.out.println(segundo);
		//saida continua 5
	}
}
