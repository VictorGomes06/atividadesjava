package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Random sorteio = new Random();

		int opcao, quantidadeRodadas = 0, contador;
		contador = 0;
		int escolhaUsuario = 0, escolhaMaquina;

		String escolha = "S";

		System.out.println("-------------------------------------------------");
		System.out.println("                 J O K E N P O                   ");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		

		System.out.print("Quantas partidas: ");
		quantidadeRodadas = ler.nextInt();
		System.out.println("");
		
	
		System.out.println("-------------------------------------------------");
		System.out.println(" 1 - Pedra");
		System.out.println(" 2 - Papel");
		System.out.println(" 3 - Tesoura");
		System.out.println("-------------------------------------------------");
		System.out.println("");

		System.out.println("qual a sua opc��o ?");
		 opcao= ler.nextInt();

		ler.close();

		System.out.println();

		while (opcao > 3  ) {
			System.out.println("Voc� n�o digitou um n�mero entre 1 e 3 para escolher uma op��o!");
			
		}

			if (escolhaUsuario > 0 && escolhaUsuario <= 3) {
				if (escolhaUsuario == 1)
					System.out.println("Voc� escolheu Pedra!");
			} else if (escolhaUsuario == 2) {
				System.out.println("Voc� escolheu Papel!");
			} else {
				System.out.println("Voc� escolheu Tesoura!");
			}

			escolhaMaquina = sorteio.nextInt(3) + 1;

			if (escolhaMaquina == 1) {
				System.out.println("A m�quina escolheu Pedra!");
			} else if (escolhaMaquina == 2) {
				System.out.println("A m�quina escolheu Papel!");
			} else {
				System.out.println("A m�quina escolheu Tesoura!");
			}

			if (escolhaUsuario == escolhaMaquina) {
				System.out.println("Empate!");
			} else if ((escolhaUsuario == 1 && escolhaMaquina == 3) || (escolhaUsuario == 2 && escolhaMaquina == 1)
					|| (escolhaUsuario == 3 && escolhaMaquina == 2)) {
				System.out.println("Voc� ganhou!");
			} else {
			}
			System.out.println("M�quina ganhou!");
			
			contador ++;
		

	}

}
