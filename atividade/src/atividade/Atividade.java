package atividade;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valor1,valor2,valor3;
		
		System.out.print("primeiro número: ");
		valor1 = leitor.nextInt();
		
		System.out.print("segundo búmero: ");
	    valor2 = leitor.nextInt();
		
	    System.out.print("terceiro número: ");
	    valor3 = leitor.nextInt();
	    
	    if (valor1 > valor2 && valor1 >valor3) {
	    	
	    	System.out.println( valor1 +" :é maior");
	    }
	    else if (valor2 > valor1 && valor2 > valor3  ) {
	    
	    	System.out.println(valor2 + " :é maior");
	    }
         if(valor3 > valor2 && valor3 > valor1) {
        	 
        	 System.out.println(valor3 +":é maior");
         }

	    
	     if (valor1 < valor2 && valor1 < valor3) {
	    	 
	    	 System.out.println("o menor é " + valor1);
	     }
	    
	     if(valor2 < valor1 && valor2 < valor3) {
	    	 
	    	 System.out.println(" o menor é " + valor2);
	     }
	     else {
	    	 System.out.println("o menor é " + valor3);
	     }
	    
	    
	    

	}

}
