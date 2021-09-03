public abstract class Player implements  IPlayer{
   private int row,col;

   public Player(){

   }

   public abstract void play();
   public abstract int numHands();

}
