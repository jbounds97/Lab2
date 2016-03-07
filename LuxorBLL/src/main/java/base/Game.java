package base;

public class Game {
	public static void main(String args[]){
		play();
			
		}
	
	public static void play(){
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		makeHand(player1, player2, deck);
		compareHands(player1, player2);
	}
	
	public static void makeHand(Player player1, Player player2, Deck deck){
		for(int i = 1; i <= 5; i++){
			player1.addCard(deck.pop());
			player2.addCard(deck.pop());
	}
	public static void compareHands(Player player1, Player player2, Deck deck){
		
	}
}
}
