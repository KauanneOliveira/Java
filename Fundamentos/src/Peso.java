import java.util.Scanner;

public class Peso {
	public static void main(String args[]) {
		
		float peso, altura;
		int sexo;
		String nome;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite seu sexo (1-Masculino, 2-Feminino):");
		sexo = entrada.nextInt();
		
		System.out.println("Digite sua altura:");
		altura = entrada.nextFloat();
		
		if(sexo == 1) {
			peso = (72 * altura) - 58;
			System.out.println("Seu nome é "+nome+" do sexo masculino, com altura "+altura+" e o peso "+peso);
		}
		else if(sexo == 2){
			peso = (62 * altura) - 44;
			System.out.println("Seu nome é "+nome+" do sexo feminino, com altura "+altura+" e o peso "+peso);
		}
		else
			System.out.println("Opção Inválida!");
	}
}
