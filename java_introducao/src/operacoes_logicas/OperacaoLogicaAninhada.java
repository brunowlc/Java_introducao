package operacoes_logicas;

public class OperacaoLogicaAninhada {
	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 20;
		int nota3 = 10;
		int nota4 = 80;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operações logicas aninhadas são operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno está aprovado direto média: " + media + ", Parabéns!");
				} else {
					System.out.println("Aluno está aprovado direto média: " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação média: " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto média: " + media);
		}
	}
}
