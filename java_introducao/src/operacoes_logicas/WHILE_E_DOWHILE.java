package operacoes_logicas;

public class WHILE_E_DOWHILE {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		
		while (numero <= 10) { /* While(Enquanto) -> Verifica e depois executa o codigo */
			System.out.println("O numero atual é: " + numero);
			numero ++; /* Devemos incrementar com ++ pois se nao ele fica em loop infinito*/
		}
		
		/* DO WHILE */
		
		int numero2 = 0;
		
		/* Do While -> Primeiro executa e depois verifica*/
		do{
			System.out.println("O numero atual é: " + numero2);
			numero2++;
		} while (numero2 <=10);
	}
}
