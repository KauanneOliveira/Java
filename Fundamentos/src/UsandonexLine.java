

import java.util.Scanner;

public class UsandonexLine {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		String mensagem = " ";
		
		System.out.println("Digite uma mensagem: ");
		mensagem = entrada.nextLine();
		
		System.out.println("Mensagem digitada: " +mensagem);
	}
}
