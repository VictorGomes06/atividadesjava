package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		int multiplicador1;
		int multiplicador2;
		int multiplicador3; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("qual o multiplicador ? ");
		multiplicador1 = leitor.nextInt();
		System.out.print("qual o m�ximo multiplicador ?");
		multiplicador2 = leitor.nextInt();
		
		System.out.println("---------------------- ");
		System.out.println("tabuada do " + multiplicador1);
		System.out.println("----------------------");
		
		


	}

}
