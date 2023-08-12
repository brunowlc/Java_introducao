package operacoes_logicas;

public class RestoDaDivisao {
	
	public static void main(String[] args) {
		
		/* Módulo: Resto da divisão ( % ) */
		
		double carro = 10;
		double pessoa = 2;
		double resto = carro % pessoa; /*MOD*/
		String resultado;
		
		System.out.println("Sobraram exatamente " + resto + " carros.");
		
		/* 1- Testando conhecimentos das aulas anteriores
		if(resto == 1) {
			System.out.println("Sobrou exatamente " + resto + " carro");
		}else {
			System.out.println("Sobraram exatamente " + resto + " carros");
		}
		*/
		/* 2 - Testando conhecimentos das aulas anteriores
		resultado = resto == 1 ? "Sobrou exatamente " + resto + " carro" : "Sobraram exatamente " + resto + " carros";
		System.out.println(resultado);
		*/
		
		
		
	}
}
