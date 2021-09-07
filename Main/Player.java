public abstract class Player implements IPlayer {
    private Chess chess;//black/white


    public Player(Chess chess) {
        this.chess = chess;
    }

    public Chess getChess(){
        return chess;
    }

    public abstract void play(int row,int col,char place,Board board);

    public abstract char[][] numHands();

}
