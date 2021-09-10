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

		System.out.println("qual a sua opcção ?");
		 opcao= ler.nextInt();

		ler.close();

		System.out.println();

		while (opcao > 3  ) {
			System.out.println("Você não digitou um número entre 1 e 3 para escolher uma opção!");
			
		}

			if (escolhaUsuario > 0 && escolhaUsuario <= 3) {
				if (escolhaUsuario == 1)
					System.out.println("Você escolheu Pedra!");
			} else if (escolhaUsuario == 2) {
				System.out.println("Você escolheu Papel!");
			} else {
				System.out.println("Você escolheu Tesoura!");
			}

			escolhaMaquina = sorteio.nextInt(3) + 1;

			if (escolhaMaquina == 1) {
				System.out.println("A máquina escolheu Pedra!");
			} else if (escolhaMaquina == 2) {
				System.out.println("A máquina escolheu Papel!");
			} else {
				System.out.println("A máquina escolheu Tesoura!");
			}

			if (escolhaUsuario == escolhaMaquina) {
				System.out.println("Empate!");
			} else if ((escolhaUsuario == 1 && escolhaMaquina == 3) || (escolhaUsuario == 2 && escolhaMaquina == 1)
					|| (escolhaUsuario == 3 && escolhaMaquina == 2)) {
				System.out.println("Você ganhou!");
			} else {
			}
			System.out.println("Máquina ganhou!");
			
			contador ++;
		

	}

}
