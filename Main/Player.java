public abstract class Player implements IPlayer {
    private Chess chess;//black/white


    public Player(Chess chess) {
        this.chess = chess;
    }



    public abstract void play();

    public abstract char[][] numHands();

}
