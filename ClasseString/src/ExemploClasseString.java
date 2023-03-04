
public class ExemploClasseString {
	public static void main(String args[]) {
		 double A= 5.2;
		 double B=5.6;
		 double C= -5.8;
		 
		 System.out.println("Arredondando para cima 5.2= " +Math.ceil(A));
		 System.out.println("Arredondando para cima 5.6= " +Math.ceil(B));
		 System.out.println("Arredondando para cima -5.8= " +Math.ceil(C));
		 
		 System.out.println();
		 
		 System.out.println("Arredondando para baixo 5.2= " +Math.floor(A));
		 System.out.println("Arredondando para baixo 5.6= " +Math.floor(B));
		 System.out.println("Arredondando para baixo -5.8= " +Math.floor(C));
		 
		 int D= 10;
		 int E= 15;
		 
		 double F= 5.9, G= 4.5;
		 
		 System.out.println();
		 
		 System.out.println("O maior entre 10 e 15: " +Math.max(D, E));
		 System.out.println("O maior entre 5.9 e 4.5: " +Math.max(F, G));
		 System.out.println("O maior entre 10 e 5.9: " +Math.max(D, F));
		 
		 System.out.println();
		 
		 System.out.println("O minimo entre 10 e 15: " +Math.min(D, E));
		 System.out.println("O minimo entre 5.9 e 4.5: " +Math.min(F, G));
		 System.out.println("O minimo entre 10 e 5.9: " +Math.min(D, F));
		 
		 System.out.println();
		 
		 double H= 900, I= 30.25;
		 
		 System.out.println("a raíz quadrada de 900= " +Math.sqrt(H));
		 System.out.println("a raíz quadrada de 30.25= " +Math.sqrt(I));
		 
		 System.out.println();
		 
		 double base= 5.5, potencia= 2;
		 
		 System.out.println("5.5 elevado a 2= " +Math.pow(base, potencia));
		 System.out.println("25 elevado a 0.5= " +Math.pow(25, 0.5));
		 
		 System.out.println();
		 
		 for(int qtd=1; qtd <=5; qtd++) {
				 int num= (int)(Math.random()*99);
				 System.out.println(num+ "  ");
		 }
		 
		 System.out.println();
		 
		 System.out.println(Math.floor(Math.random()*100));
	}
}
