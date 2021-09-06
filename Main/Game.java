import java.util.Random;

public class Game {
    private int grid;
    private Board board;

    public Game(int grid) {
        this.grid = grid;
        board = new Board(grid);
    }//end constructor

    public Board getBoard() {
        return board;
    }

    public void runGame(){
        System.out.println("Board after initialization.....");
        getBoard().printBoard();//print initialized board

    }

}
