

import java.util.Scanner;

public class Viagem {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int areia = 0;
		int elevador = 0;
		int viagem = 0;
		
		System.out.println("Digite a quantidade, em kg, que o elevador suporta de peso: ");
		elevador = entrada.nextInt();
		
		System.out.println("Digite a quantidade, em kg, de areia que será transpotada: ");
		areia = entrada.nextInt();
		
		if(elevador > areia)
			viagem = elevador / areia;
		else
		viagem = areia / elevador;
		
		System.out.println("A quantidade de viagens necessária são: " +viagem);
	}
}
