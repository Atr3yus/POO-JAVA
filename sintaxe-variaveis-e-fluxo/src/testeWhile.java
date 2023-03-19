
public class testeWhile {
	
	public static void main(String[] args) {
		int contador = 0;
		//caso a varivel contador for incrementada dentro do laço, não havera a contagem, devido ela ser sempre,
		//reinicializada junto com o laço, nunca somando
		
		while (contador <= 10) {
			System.out.println(contador);
			contador ++;
			//contador += 1;
			//contador = contador + 1;
		}
		
		
	}

}
