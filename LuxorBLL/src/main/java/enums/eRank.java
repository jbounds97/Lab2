package enums;

public enum eRank {
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);
	
	private int sRankNbr;
	
	public int getsRankNbr() {
		return sRankNbr;
	}

	public void setsRankNbr(int sRankNbr) {
		this.sRankNbr = sRankNbr;
	}
	private eRank(int sRankNbr) {
		this.sRankNbr = sRankNbr;
	}
	
	public static eRank eRankGetValue(int a){
		switch(a){
		case 2: return TWO;
		case 3: return THREE;
		case 4: return FOUR;
		case 5: return FIVE;
		case 6: return SIX;
		case 7: return SEVEN;
		case 8: return EIGHT;
		case 9: return NINE;
		case 10: return TEN;
		case 11: return JACK;
		case 12: return QUEEN;
		case 13: return KING;
		case 14: return ACE;
		}
		System.out.print("Number must be integer 2-14");
		System.exit(1);
		return TWO;
	}
	
}