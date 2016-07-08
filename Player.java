public class Player {
	String playername;
	ArrayList<Integer> cardswithplayer;
	int score;
	public Player (String name) {
		this.playername = name;
		this.score = 0;
		for(int i = 1; i < 14; i++) {
			cardswithplayer.add(i);
		}
		
		
	}
	
}
