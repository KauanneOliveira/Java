package UsandoJOptionPane;

import javax.swing.JOptionPane;

public class ExemploDecisao {
	public static void main(String args[]) {
		
		String entrada;
		char op;
		
		entrada = JOptionPane.showInputDialog("Escolha:\n\t(S)olteiro\n\t(C)asado\n\t(D)ivorciado: ");
		op = entrada.charAt(0);
		
		switch(op) {
			case 'S':
			case 's':
				JOptionPane.showMessageDialog(null, "Solteiro!");
				break;
			case 'C':
			case 'c':
				JOptionPane.showMessageDialog(null, "Casado!");
				break;
			case 'D':
			case 'd':
				JOptionPane.showMessageDialog(null, "Divorciado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Outros!");
		}
	}
}
