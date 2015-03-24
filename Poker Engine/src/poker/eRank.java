package poker;

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
	ACE(14),
	JOKER(99);
	

	private eRank(final int rank){
		this.rank = rank;
	}

	private int rank;
	
	public int getRank(){
		return rank;
	}
	
}