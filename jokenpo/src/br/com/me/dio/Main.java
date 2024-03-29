package br.com.me.dio;

import java.util.Scanner;

/*
--------Regras--------
- Pedra amassa tesoura;
- Terousa corta papel;
- Papel embrulha pedra
----------------------
*/

public class Main {
	
	public static JoKenPo startGame() {
		System.out.print("******** Jo-Ken-Po ********\n");
		Scanner scan = new Scanner(System.in);
		
		//Nomes dos jogadores
		System.out.print("Informe o seu nome: ");
		String playerName = scan.next().toUpperCase();
		
		Player user = new Player(playerName);
		Player IA = new Player("IA");
		
		//Quantidade de rounds
		System.out.print(playerName + ", informe quantos rouds você deseja jogar: ");
		int rounds = scan.nextInt();
		
		//Retorno do novo jogo
		return new JoKenPo(user, IA, rounds);
	}

	public static void main(String[] args) {
		startGame();
	}
}
