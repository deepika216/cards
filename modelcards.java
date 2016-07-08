publi class modelcards {
 int playerbid;
 static int sdiamonds = 0;
  static int udiamonds = 0;
ArrayList<Integer> sarray = new ArrayList<Integer>();
 sarray.add(1);
 sarray.add(2);
 sarray.add(3);
  sarray.add(4);
sarray.add(5);
sarray.add(6);
sarray.add(7);
sarray.add(8);
sarray.add(9);
sarray.add(10);
sarray.add(11);
sarray.add(12);
ArrayList<Integer> uarray = new ArrayList<Integer>();
 uarray.add(1);
 uarray.add(2);
 uarray.add(3);
  uarray.add(4);
uarray.add(5);
uarray.add(6);
uarray.add(7);
uarray.add(8);
uarray.add(9);
uarray.add(10);
uarray.add(11);
uarray.add(12);


  
  public modelcards( int playerbid, int diamondvalue) {
   this.playerbid = playerbid;
   this.diamondvalue = diamondvalue;
  }
  public static int getRandom(int[] sarray) {
   int systembid = new Random.nextInt(sarray.length);
    return sarray[systembid];
   }
  public static int comparebids(int playerbid,int diamondvalue) {
  for(int i = 0; i < 13; i++) {    
   if(playerbid > systembid) { 
       udiamonds += diamondvalue;
        uarray.remove(playerbid);
    } else {
        sdiamonds += diamondvalue;
         sarray.remove(systembid);
    }
  if(playerbid == systembid) {
     udiamonds = sdiamonds = diamondvalue/2;
      uarray.remove(playerbid);
      sarray.remove(systembid);
   }
}
  public static displayresult() {
    if(udiamonds > sdiamonds) {
     System.out.println("user is winner" +udiamonds);
    } else {
     System.out.println("system is winner" +sdiamonds);
    }
 }
      
   
          
             
     
