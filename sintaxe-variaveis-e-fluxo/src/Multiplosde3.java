
public class Multiplosde3 {

	public static void main(String[] args) {
			
		//metodo com "if"
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
			System.out.println(i);
			}					
		}
		//metodo sem "if"
		System.out.println();
		for (int i = 3; i <100; i += 3) {
			System.out.println(i);
		}
	}
}
