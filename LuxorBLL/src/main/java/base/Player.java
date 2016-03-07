package base;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public void addCard(Card card){
		hand.add(card);
	}
