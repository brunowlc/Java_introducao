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
		
		/* System.out.println("Divisão entre pessoas deu " + divisao + " carros e sobrou " + resto + " carros"); */
		JOptionPane.showMessageDialog(null, "Divisão entre pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
		
	}

}
