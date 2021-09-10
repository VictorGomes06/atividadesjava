package atividade8;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner (System.in);	
		
	String nomevendedor;
	
	double totalvendido,comissao,tempodecasa;
		
	
	System.out.println("nome do vendedor: ");
	 nomevendedor = leitor.next();
	 
	 System.out.println("tempo de casa : ");
	 tempodecasa = leitor.nextDouble();
	 
	 System.out.println("total vendido: ");
	 totalvendido = leitor.nextDouble();
	 
	 leitor.close();
	

	 if (totalvendido >=20000 && tempodecasa >= 1) {
		 comissao = totalvendido * 10 /100;
	 }
	 else if (totalvendido >= 10000 && tempodecasa >= 1 ) {
		 comissao = totalvendido * 5 /100;	 
	 }
	 else {
		 comissao = totalvendido * 3 / 100;
	 }
	
	System.out.println("vendedor" + nomevendedor +"\ncomissão" + comissao);
	
	
	
	
	
	
	
	
	
	}

}
