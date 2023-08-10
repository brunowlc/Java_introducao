package operacoes_logicas;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		String saida;
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Tipo de condição usada para micro validações*/
		/*saida = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";*/
		saida = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <=69) ? "Aluno em Recuperação" : "Aluno Reprovado";
		/*A media é >= 70? se for verdade entao "aluno aprovado", : se nao a media é >=40 e <= 69? se for
		verdade "Aluno em recuperação", : se nao cair em nem uma condição dessa "Aluno Reprovado". */
		System.out.println(saida);
	}
}
