/**
 * Purpose : Second Week Workshop
 * @author Ganesh Gavhad
 * @version 1.0
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;

public class DeckOfCard {
	
	private String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	ArrayList<Card> deck = new ArrayList<>(52);

	private int buildDeck() {
		
		for(int i=0;i<52;i++) {
			Card newcard = new Card(suits[i/13],ranks[i%13]);
			deck.add(newcard);
		}
		
		HashSet<Object> hashSet = new HashSet<>(deck);
		
		if(hashSet.size()==deck.size()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to deck of Card");
		DeckOfCard obj = new DeckOfCard();
		obj.buildDeck();
	}
}
