import java.util.Random;

public class Game {
    private int grid,steps;
    private Board board;
    private Player p1,p2;


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

        String colour = p1.getChess().getColour();

        if(colour.equals("Black")){
            //while ()
        }else {
            //white
        }

    }//end runGame

    public boolean endGame(){
        boolean win = false;

        if(steps==grid*grid ){
            win = true;
        }

        return win;
    }

}
