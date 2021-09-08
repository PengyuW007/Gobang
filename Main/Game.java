import java.util.Random;
import java.util.Scanner;

public class Game {
    private int grid, steps;
    private Board board;
    private Player p1, p2;


    public Game(int grid, Player p1, Player p2) {
        this.grid = grid;
        board = new Board(grid);
        this.p1 = p1;
        this.p2 = p2;
    }//end constructor

    public Board getBoard() {
        return board;
    }

    public void runGame() {
        System.out.println("Board after initialization.....");
        getBoard().printBoard();//print initialized board

        String colour = p1.getChess().getColour();
        char black = '+', white = '-';

        Scanner scan = new Scanner(System.in);
        int row, col;

        if (colour.equals("Black")) {
            //p1 first
            //while (!endGame()) {
            do{
                System.out.println("\n" + "P1 place: ");
                row = scan.nextInt();
                col = scan.nextInt();
                System.out.println("(" + row + "," + col + ")");
                p1.play(row, col, black, getBoard());
                steps++;
                getBoard().printBoard();

                System.out.println("\n" + "P2 place: ");
                row = scan.nextInt();
                col = scan.nextInt();
                System.out.println("(" + row + "," + col + ")");
                p2.play(row, col, white, getBoard());
                steps++;
                getBoard().printBoard();
            }while(!endGame(row,col));

            //}
        } else {
            //white,p2 first

        }

    }//end runGame

    public boolean endGame(int row,int col) {
        boolean end = false;

        if (steps == grid * grid||success(row,col)) {
            //||success(row,col)
            end = true;
        }

        return end;
    }

    public boolean success(int row, int col) {
        boolean succ = false;
        //boolean UP, DOWN, LEFT, RIGHT, LEFT_UP, RIGHT_UP, LEFT_DOWN, RIGHT_DOWN;
        int count = 0, former = 0, last = 0;
        char[][] table = board.getBoard();

        char curr = table[row][col];

        /**********************************
         4 cases of line: up down,left right
         ***********************************/
        // char up = table[row--][col];char down = table[row++][col];
        //vertical
        for (int i = row; i > 0; i--) {
            if (table[i][col] == curr) {
                former++;
                if (former == 2 || table[i][col] != curr) {
                    break;
                }
            }
        }

        for (int i = row; i < row; i++) {
            if (table[i][col] == curr) {
                last++;
                if (last == 2 || table[i][col] != curr) {
                    break;
                }
            }
        }

        count = former + last;

        if (count == 2) {
            succ = true;
        } else {
            //initialize counters to 0
            count = 0;
            former = 0;
            last = 0;
            //char left = table[row][col--];char right = table[row][col++];
            //horizontal
            for (int i = col; i > 0; i--) {
                if (table[row][i]==curr){
                    former++;
                    if(former>=5||table[row][i]!=curr){
                        break;
                    }
                }
            }
        }

        //4 cases of diag,leftUp,rightUp,leftDown, rightDown,
        char leftUp = table[row--][col--];
        char rightDown = table[row++][col++];

        char rightUp = table[row--][col++];
        char leftDown = table[row++][col--];


        return succ;
    }

}
