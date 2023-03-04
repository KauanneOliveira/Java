
public class FuncoesString {
	public static void main(String args[]) {
		
		String mensagem = "Aprendendo Java";
		String mensagem1 = "Aula Java";
		
		int tamanho = mensagem.length();
		
		System.out.println("String = " +mensagem);
		System.out.println("Tamanho da String = " +tamanho);
		
		System.out.println("Caracter = " +mensagem.charAt(5));
		
		for(int indice = 10; indice < 15; indice++) {
			System.out.println(mensagem.charAt(indice));
		}
		
		System.out.println("Do 3° caractere até o fim: "+mensagem.substring(2));
		
		System.out.println();
		
		System.out.println("Troca caractere 'a' por 'u': " +mensagem1.replace('a', 'u'));
		System.out.println("Troca caractere 'v' por 'V': " +mensagem1.replace('v', 'V'));
		
		System.out.println("Tudo em maiusculo: " +mensagem.toUpperCase());
		System.out.println("Tudo em minusculo: " +mensagem.toLowerCase());
	}
}
