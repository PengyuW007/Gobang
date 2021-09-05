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


    }

    public void whoIsBlack(Player p1, Player p2){
        Random ran = new Random(1);

        //1. ai VS pp
        //2. p1 vs p2
        int black = ran.nextInt();

        if(black==0){
            p1.play();
            p2.play();
        }else{
            p2.play();
            p1.play();
        }
    }
}
