public class Deckofcards {
	
	int cardsindeck;
	int[] deck ;
	public shuffle {
 		for(int i=0; i < 52; i++) {
 			int randomindex = (int)(Math.random() 52);
 			int temp = deck[i];
 			deck[i] = deck[randomindex];
 			deck[randomindex] = temp;
 		}
			
}
