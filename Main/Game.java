public class Game {
    private int grid;
    private Board board;

    public Game(int grid){
        this.grid = grid;
        board = new Board(grid);
    }//end constructor

    public void play(){

    }

    public Board getBoard(){
        return board;
    }
}
