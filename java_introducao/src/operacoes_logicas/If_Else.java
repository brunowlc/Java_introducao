package operacoes_logicas;

public class If_Else {

	public static void main(String[] args) {
		
		/* EXEMPLO - 1
		int mediaAluno = 70;
		String nome = "Bruno";
		--String nome = "Patricia"; Com essa variavel o codigo cai no Else
		
		-- O método Equals() compara os objetos por valor e retorna true pois as referências 
		  dos objetos são equivalentes.
		if (mediaAluno >= 70 && nome.equals("Bruno")) {
			System.out.println("Parabéns "+ nome + " você está Aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Você está Reprovado.");
		} else {
			System.out.println("Aluno não Encontrado");
		}
		Resumo: Se a media do aluno foi maior ou igual a 70 e(&&) o nome foi igual(Equals) a Bruno
		o sistema ira retornar aprovado; Caso seja menor que 70 o aluno estara reprovado
		e se o nome nao for igual(Equals) a bruno "Aluno nao encontrado". */
		
		
		/*EXEMPLO - 2*/
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70){
			System.out.println("Aluno Aprovado: " + media);
		} else if (media >= 40 && media <=69) {
			System.out.println("Aluno em recuperação: " + media);
		} 
		else {
			System.out.println("Aluno Reprovado: " + media);
		}
		
		/*Resumo: Para esse sistema entraremos com quatro notas, apos ele ira calcular a soma
		  das notas e dividir por quatro nos retornando a media do aluno. Se a media for maior ou
		  igual a 70 o aluno estará aprovado; se nao(Else) se(if) a media foi maior ou igual a 40 
		  e(&&) a media for menor ou igual a 69 o aluno estara em recuperação e se nao (Else) entrar
		  em uma das duas condições o aluno estará reprovado. */
			

	}
}
