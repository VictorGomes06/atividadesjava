package atividade;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valor1,valor2,valor3;
		
		System.out.print("primeiro n�mero: ");
		valor1 = leitor.nextInt();
		
		System.out.print("segundo b�mero: ");
	    valor2 = leitor.nextInt();
		
	    System.out.print("terceiro n�mero: ");
	    valor3 = leitor.nextInt();
	    
	    if (valor1 > valor2 && valor1 >valor3) {
	    	
	    	System.out.println( valor1 +" :� maior");
	    }
	    else if (valor2 > valor1 && valor2 > valor3  ) {
	    
	    	System.out.println(valor2 + " :� maior");
	    }
         if(valor3 > valor2 && valor3 > valor1) {
        	 
        	 System.out.println(valor3 +":� maior");
         }

	    
	     if (valor1 < valor2 && valor1 < valor3) {
	    	 
	    	 System.out.println("o menor � " + valor1);
	     }
	    
	     if(valor2 < valor1 && valor2 < valor3) {
	    	 
	    	 System.out.println(" o menor � " + valor2);
	     }
	     else {
	    	 System.out.println("o menor � " + valor3);
	     }
	    
	    
	    

	}

}
