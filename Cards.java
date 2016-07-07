public class Cards {
	char suit;
	int pip;
	public Cards(int pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}
	/*	private int[] sequence = new int[52];
	for(int i = 0; i < sequence.length(); i++) {
		sequence[i] = i;
	} */
	public getPip () {
		
		return "123456789TJQK"[sequence % 13];
	}
	public getSuit() {
		return "CDHS"[sequence / 13];
	}
	
} 

