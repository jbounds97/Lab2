package base;

import enums.eRank;
import enums.eSuit;

public class Card implements Comparable {	
	
	private eRank eRank;
	private eSuit eSuit;
	
	public eRank geteRank() {
		return eRank;
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	public int getiCardNbr() {
		return iCardNbr;
	}

	private void setiCardNbr(int iCardNbr) {
		this.iCardNbr = iCardNbr;
	}

	public Card(eRank eRank, eSuit eSuit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
