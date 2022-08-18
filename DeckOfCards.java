package com.bridgelabz.deck_of_cards;

public class DeckOfCards {

	static final int numOfPlayers = 4;
	static final int numOfDistCards = 9;

	public static void main(String[] args) {

		System.out.println("Welcome to Deck of Card game !");

		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		shuffleCard(suit,rank);

	}

	public static void shuffleCard(String[] suit, String[] rank) {

		int[][] array = new int[suit.length][rank.length];
		int n = suit.length * rank.length;
		String[] deck = new String[n];

		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = rank[i] + "  ------->  " +suit[j];
			}
		}

		for(int i = 0; i < n; i++) {

			int random = i + (int) (Math.random() * (n -i));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		for(int i = 0; i < numOfPlayers; i++) {

			array[i][0] = i + 1;
			System.out.println("\n Player " +i+1 +" : " +array[i][0] +"\n");

			for(int j = 0; j < numOfDistCards; j++) {
				System.out.println(deck[i + j * numOfPlayers]);
			}
		}
	}
}


