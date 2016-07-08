public class Diamonds {
	int bid;
	public getBidvalue() {
		return bid;
	}
	public makeBid() {
		int bidindex = (int)(Math.randaom() 13)
		return deck[bidindex];
	}
	public Player compareBid(Player b1, Player b2) {

		return  b1.bidmade > b2.bidmade ? b1:b2;
	}
	public Player status(Player b1, Player b2) {
		return  b1.score > b2.score ? b1:b2;
	}
	public ArrayList<Integers> shuffle(ArrayList<Integer> diamondcards {
 		for(int i = 0; i < 52; i++) {
 			int randomindex = (int)(Math.random() 52);
 			int temp = diamondcards[i];
 			diamondcards[i] = diamondcarads[randomindex];
 			diamondcards[randomindex] = temp;
		}
		return diamondcards;
 	}
	public static void main(String args[]) {
		ArrayList<Integer> diamondcards = new ArrayList<Integer>();
		
		for(int i = 1; i < 14; i++) {
			diamondcards.add(i);
		}
		shuffle(diamondcards);
		
		Player a;
		Player b;
		
		
		while( diamondcards.length() !=0 ) {
			int b.bidmade =  (int)(Math.Random() 13)
			System.out.println("MakeBid");
			int a.bidmade = Integer.parseInt(c.getPip(System.in));
			compareBid(a.bidmade,b.bidmade).score += diamondcards[0];
			diamondcards.remove(0);	
			spadecards.remove(a.bidmade);
			clubcards.remove(b.bidmade);

		}	
		System.out.println("Winner "+status(a,b).name+"MAX Score" +status(a,b).score);
}


