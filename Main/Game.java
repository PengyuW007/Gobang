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
            while (!endGame()) {
                System.out.println("\n" + "P1 place: ");
                row = scan.nextInt();
                col = scan.nextInt();
                System.out.println("("+row+","+col+")");
                p1.play(row, col, black, getBoard());
                steps++;
                getBoard().printBoard();

                System.out.println("\n" + "P2 place: ");
                row = scan.nextInt();
                col = scan.nextInt();
                System.out.println("("+row+","+col+")");
                p2.play(row, col, white, getBoard());
                steps++;
                getBoard().printBoard();
            }
        } else {
            //white,p2 first
            while (!endGame()) {

            }
        }

    }//end runGame

    public boolean endGame() {
        boolean win = false;

        if (steps == grid * grid) {
            win = true;
        }

        return win;
    }

}
