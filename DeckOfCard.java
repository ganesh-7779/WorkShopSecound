/**
 * Purpose : Second Week Workshop
 * @author Ganesh Gavhad
 *@version 1.0
 */
package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCard {
	String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	ArrayList<Card> deck = new ArrayList<>(52);

	public static void main(String[] args) {
		System.out.println("Welcome to deck of Card");
	}
}
