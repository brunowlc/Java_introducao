package operacoes_logicas;

import javax.swing.JOptionPane;

public class EntradaDeDadosJoptionPane {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");
		
		double carroNumero = Double.parseDouble(carros);/* Double.parseDouble -> convertendo o valor recebido em String para double*/
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero); /* convertendo o valor da divisão de double para inteiro */
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão entre pessoas é: " + divisao);
		}else {
			System.out.println("Finalizado!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divição deu: " + resto);
		}else {
			System.out.println("Finalizado!");
		}
		
		
	}

}
