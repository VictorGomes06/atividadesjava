import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		

		System.out.println("-------------------------------");
		System.out.println("Calculo de �rea de uma casa");
		System.out.println("-------------------------------");
		System.out.println();
		
		Scanner leitor = new Scanner (System.in);
		
		double largura = 0 , comprimento = 0;
		double areadocomodo = 0, areatotal = 0;
		String resposta = "" ;
		String comodo = "";
		 
		
		
		while (resposta.equals("S") || resposta.equals ("s"));{
			
		
	    System.out.print("qual o nome do c�modo ? ");
	    comodo = leitor.next();
	  
		
		System.out.print("qual a largura ? ");
		largura = leitor.nextDouble();
		
		System.out.print("qual o comprimento ? ");
		comprimento = leitor.nextDouble();
		
		System.out.println(" A (o) " + comodo + " tem " + areadocomodo + "metros quadrados");
		
		System.out.print("voc� deseja calcular mais comodos (S/N)? ");
		resposta = leitor .next();
		
		areadocomodo = largura * comprimento;
		
		areatotal = areatotal + areadocomodo;
		
		}
		
		System.out.println("A �rea total da casa � " + areatotal);
		
		
	}

	
}
