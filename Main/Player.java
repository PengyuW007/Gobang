public abstract class Player implements IPlayer {
    private String chess;//black/white


    public Player(String chess) {

    }

    public String getChess() {
        return chess;
    }

    public abstract void play();

    public abstract char[][] numHands();

}
