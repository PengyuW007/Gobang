public abstract class Player implements IPlayer {
    private Chess chess;//black/white


    public Player(Chess chess) {
        this.chess = chess;
    }

    public Chess getChess(){
        return chess;
    }

    public abstract void play(char[][]place);

    public abstract char[][] numHands();

}
