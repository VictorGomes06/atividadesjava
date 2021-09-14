package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		int multiplicador1;
		int multiplicador2;
		int contador = 0; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("qual o multiplicador ? ");
		multiplicador1 = leitor.nextInt();
		System.out.print("qual o máximo multiplicador ?");
		multiplicador2 = leitor.nextInt();
		
		System.out.println("---------------------- ");
		System.out.println("tabuada do " + multiplicador1);
		System.out.println("----------------------");
		
	
		   while(contador < multiplicador2) {
			contador ++;
		   
			int vezes = multiplicador1 * contador; 				
			System.out.println(multiplicador1 + " x " + contador + " = " + vezes);
		   

		   }
	
	}
}