public class Human extends Player{

    public Human(Chess chess) {
        super(chess);
    }

    @Override
    public void play(int row, int col, char place,Board board) {
        char grid[][] = board.getBoard();

        grid[row][col] = place;
    }


    @Override
    public char[][] numHands() {
        return new char[0][];
    }


}
