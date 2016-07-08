public class players {
 
 static int systemdiamonds = 0;
  static int userdiamonds = 0;
ArrayList<Integer> systemarray = new ArrayList<Integer>();
 systemarray.add(1);
 systemarray.add(2);
 systemarray.add(3);
  systemarray.add(4);
systemarray.add(5);
systemarray.add(6);
systemarray.add(7);
systemarray.add(8);
systemarray.add(9);
systemarray.add(10);
systemarray.add(11);
systemarray.add(12);
systemarray.add(13);
ArrayList<Integer> userarray = new ArrayList<Integer>();
 userarray.add(1);
 userarray.add(2);
 userarray.add(3);
  userarray.add(4);
userarray.add(5);
userarray.add(6);
userarray.add(7);
userarray.add(8);
userarray.add(9);
userarray.add(10);
userarray.add(11);
userarray.add(12);
userarray.add(13);


  
  public modelcards( int playerbid, int diamondvalue) {
   this.playerbid = playerbid;
   this.diamondvalue = diamondvalue;
  }
  public static int generatesystembid(int[] systemarray) {
   int systembid = new Random.nextInt(systemarray.length);
    return systembid;
   }
public static int comparebid(this.playerbid,this.diamondvalue) {
  for(int i = 0; i < 13; i++) {    
   if(playerbid > systembid) { 
       udiamonds += diamondvalue;
        userarray.remove(playerbid);
    } else {
        sdiamonds += diamondvalue;
         systemarray.remove(systembid);
    }
  if(playerbid == systembid) {
     udiamonds = sdiamonds = diamondvalue/2;
      userarray.remove(playerbid);
      systemarray.remove(systembid);
   }
}
  public static displayresult() {
    if(udiamonds > sdiamonds) {
     return "user is winner";
    } else {
     return "system is winner"; 
    }
  }
}
      
