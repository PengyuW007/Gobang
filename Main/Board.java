public class Board {
    private int grid;
    private char board[][];

    public Board(int grid) {
        this.grid = grid;
        board = new char[grid][grid];
        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                board[i][j] = '*';
            }
        }
    }//end constructor

    public int getGrid() {
        return grid;
    }//end getGrid

    public void printBoard() {
        for(int i = 0;i<grid;i++){
            System.out.println();
            for(int j = 0;j<grid;j++){
                System.out.print(board[i][j]+" ");
            }
        }
    }//end printBoard
}
