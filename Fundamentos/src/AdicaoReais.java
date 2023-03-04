import java.util.Scanner;

public class AdicaoReais {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		double soma = 0;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		num2 = entrada.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma é: " +soma);
	}
}
