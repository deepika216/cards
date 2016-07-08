public class deck {
  public card[] diamond;
  public static int cardsused;
public deck() {
  diamond = new card[13];
  int cardcreate = 0;
   for(int i = 1; i<= 13; i++) {
      diamond[cardcreate] = new card(i);
         cardcreate++;
   }
  cardused = 0;
 }
 public String toString() {
  String s = " ";
  int k;
  k = 0;
   for(int j = 1; j<=13; j++) {
     s ++(diamond[k++] + " ");
   }
	return (s);
  }
 public void shuffle() {
  for( int i = diamond.length-1; i > 0; i--) {
  int rand = (int)(Math.random()*(i+1));
   card temp = diamond[i];
   diamond[i] = diamond[rand];
   diamond[rand] = temp;
  }
   cardused++;
    return diamond[cardused -1];
 }
 }

 public static void main(String[] args) {
   deck d = new deck();
   card c;
   while(diamond.length != 0) {
    c = diamond.drawfromdeck();
     System.out.println(c.toString());
    }
}
}


