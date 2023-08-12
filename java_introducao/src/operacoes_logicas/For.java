package operacoes_logicas;

public class For {

	public static void main(String[] args) {
		
		/* Estrutura de repetição FOR */
		
		/* for(int numero = 10; numero >= 0; numero --) {
			System.out.println("O numero atual é: " + numero);
		}
		for(int numero = 0; numero <=10; numero ++) {
			System.out.println("O numero atual é: " + numero);
		}*/
		
		
		/* Estrutura de repetição FOR com break(Parada) */
		
		/*for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 8) {
				System.out.println("Opaa, encontrei o numero " + numero);
				System.out.println("Estou esparando de executar...");
				break;
			}
		}*/
		
		
		/* Estrutura de repetição FOR com continue */
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 3 ||/*ou*/ numero == 6  ||/*ou*/ numero == 8 ) {
				System.out.println("Opaa, encontrei o numero " + numero + ".");
				continue;
			}
		}
	}
}
