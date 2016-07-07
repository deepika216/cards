public class Cards {
	char suit;
	int pip;
	public Cards(int sequence) {
		this.pip = sequence % 13;
		this.suit = sequence / 13;
	}
	
	public getPip () {
		
		return "123456789TJQK"[sequence % 13];
	}
	public getSuit() {
		return "CDHS"[sequence / 13];
	}
	
	
} 

