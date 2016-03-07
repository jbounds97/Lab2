package base;
import java.util.ArrayList;
import enums.eSuit;
import enums.eRank;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){
		for(int i = 0; i <= 3; i++){
			for(int j = 0; j <= 12; j++){
				Card newCard = new Card(eRank.eRankGetValue(j),eSuit.eSuitGetValue(i));
				deck.add(newCard);
			}
		}
	}
				
	public Card pop(){
		return deck.remove(0);
	}
	
	}
}

//Collections.shuffle(MakingDeck);