package media_final;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		String nome;

		double nota1, nota2, nota3, nota4;
		double media;
	
		Scanner leitor = new Scanner(System.in);

		System.out.print("nome do(a) aluno(a) :");
		nome = leitor.next();

		System.out.print("nota do primeiro bimestre: ");
		nota1 = leitor.nextDouble();

		System.out.print
		("nota do segundo nimestre: ");
		nota2 = leitor.nextDouble();

		System.out.print("nota do terceiro bimestre: ");
		nota3 = leitor.nextDouble();

		System.out.print("nota do quarto bimestre: ");
		nota4 = leitor.nextDouble();

		leitor.close();

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("O(a) aluno(a):" + nome + " ficou com média " + media);

		if (media >= 6) {

			System.out.println("*** APROVADO ***");	
			}
	
		else if (media <4  ) {
			System.out.println("*** REPROVADO ***");
		}
		else {
			System.out.println("***RECUPERAÇÃO***");
		}
			
			
		
		
			
		

	}

}
