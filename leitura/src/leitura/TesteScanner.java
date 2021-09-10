package leitura;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
	   Scanner leitor = new Scanner (System.in);	
	   int primeironumero;
	   int segundonumero;
	   int terceironumero;
	   int resultado; 
	   String nome;
	   
	   
	   System.out.print("qual o primeiro número? ");
	   primeironumero = leitor.nextInt();
	    
	   System.out.print("qual o segundo número? ");
		segundonumero = leitor.nextInt();
		 
		System.out.print("qual o seu nome? ");
		nome = leitor.next();
		leitor.close();
		
	    resultado = primeironumero + segundonumero;
		
	    System.out.println("olá " + nome);
		System.out.println("resultado: " + resultado);
		
		
		
		
	}
	
	
	
	
	
	
}
