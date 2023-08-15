package operacoes_logicas;

import javax.swing.JOptionPane;

public class CalculadoraDeNotas {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota: ");

		double converteNota1 = Double.parseDouble(nota1);
		double converteNota2 = Double.parseDouble(nota2);
		double converteNota3 = Double.parseDouble(nota3);
		double converteNota4 = Double.parseDouble(nota4);
		
		double media = (converteNota1 + converteNota2 + converteNota3 + converteNota4)/4;
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "O aluno está aprovado, média: " + media);
			}else {
				JOptionPane.showMessageDialog(null, "O aluno está em recuperação, média: " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado, média: " + media);
		} 
					
	}

}
