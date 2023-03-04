import java.util.Scanner;

public class EntradaDados {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma é: " +soma);
	}
}
