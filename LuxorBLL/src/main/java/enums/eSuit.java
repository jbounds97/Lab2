package enums;

public enum eSuit {
	HEARTS(1),
	SPADES(2),
	CLUBS(3),
	DIAMONDS(4);
	private int iSuitNbr;

	public int getiSuitNbr() {
		return iSuitNbr;
	}

	private eSuit(int iSuitNbr) {
		this.iSuitNbr = iSuitNbr;
	}
	public static eSuit eSuitGetValue(int a){
		switch(a){
		case 1: return HEARTS;
		case 2: return SPADES;
		case 3: return CLUBS;
		case 4: return DIAMONDS;
		}
		System.out.print("Number must be integer 1-4");
		System.exit(1);
		return HEARTS;
		}
	}

