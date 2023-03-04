import java.util.Scanner;

public class Conversao {
	public static void main(String args[]) {
		
		float C=0, F=0, T=0;
		int tem;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a opção\n\n1-Converter Celsius para Fahrenheit\n2-Converter Fahrenheit para Celsius");
		tem = entrada.nextInt();
		
		if(tem == 1) {
			System.out.println("Digite a temperatura:");
			T = entrada.nextFloat();
			F = (9 * T + 160) / 5;
			System.out.println("A temperatura em Fahrenheit: "+F);
		}
		else if(tem == 2){
			System.out.println("Digite a temperatura:");
			T = entrada.nextFloat();
			C = (T - 32) * 5 / 9;
			System.out.println("A temperatura em Celsius: "+C);
		}
		else
			System.out.println("Opção Inválida!");
	}
}
