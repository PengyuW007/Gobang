import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //welcome();
        System.out.println("*************************************************************************");
        System.out.println("*************************** Welcome to Gomoku ***************************");
        System.out.println("***************************** 1. Start Game *****************************");
        System.out.println("***************************** 2. Quit Game ******************************");
        System.out.println("*************************************************************************");

        System.out.println("Type your choice ");
        Scanner scan = new Scanner(System.in);
        int startQuit;
        Boolean valid = false;
        do {
            startQuit = scan.nextInt();
            if (startQuit == 1) {
                System.out.println("\n" + "Now start Game!");
                //Start the game
                System.out.println("1. PVP" + "\t" + "2. AI");
                valid = false;
                do {
                    int choice = scan.nextInt();
                    if (choice == 1) {
                        //PVP
                        //Player p1 = new Human();
                        // Player p2 = new Human();
                        valid = true;
                    } else if (choice == 2) {
                        // AI VS Human
                        // Player p1 = new Human();
                        //Player p2 = new AI();
                        valid = true;
                    } else {
                        System.out.println("Not valid input. (Type 1 or 2)Try again!");
                    }
                } while (!valid);

                /*****************
                 Initialize Board
                 ****************/

                System.out.println("Which size of the board you want to play");
                System.out.println("1. 9*9" + "\t" + "2. 15*15" + "\t" + "3. 19*19");

                valid = false;
                Game game = null;
                do {
                    int choice = scan.nextInt();
                    if (choice == 1) {
                        //9*9
                        game = new Game(9);
                        valid = true;
                    } else if (choice == 2) {
                        //15*15
                        game = new Game(15);
                        valid = true;
                    } else if (choice == 3) {
                        //19*19
                        game = new Game(19);
                        valid = true;
                    } else {
                        System.out.println("Not valid input. (Type 1, 2 or 3)Try again!");
                    }
                } while (!valid);


            } else if (startQuit == 2) {
                valid = true;
                System.out.println("See you next time!");
                System.exit(0);
            } else {
                System.out.println("Not valid input. (Type 1 or 2)Try again!");
            }//end if startquit
        } while (valid == false);






    /*
    public static void welcome() {
        System.out.println("*************************************************************************");
        System.out.println("*************************** Welcome to Gomoku ***************************");
        System.out.println("***************************** 1. Start Game *****************************");
        System.out.println("***************************** 2. Quit Game ******************************");
        System.out.println("*************************************************************************");

        System.out.println("Type your choice ");
        Scanner scan = new Scanner(System.in);
        int startQuit;
        Boolean valid = false;
        do {
            startQuit = scan.nextInt();
            if (startQuit == 1) {
                System.out.println("\n"+"Now start Game!");
                //Start the game
                aiOrPvp();
                initializeBoard();
                valid = true;
            } else if (startQuit == 2) {
                valid = true;
                System.out.println("See you next time!");
                System.exit(0);
            } else {
                System.out.println("Not valid input. (Type 1 or 2)Try again!");
            }
        } while (valid == false);
    }//end welcome

    public static int aiOrPvp() {
        System.out.println("1. PVP"+"\t"+"2. AI");
        int res = 0;
        Scanner scan = new Scanner(System.in);
        Boolean valid = false;

        do {
            int choice = scan.nextInt();
            if (choice == 1) {
                //PVP
                //Player p1 = new Human();
               // Player p2 = new Human();
                res = 1;
                valid = true;
            } else if (choice == 2) {
                // AI VS Human
               // Player p1 = new Human();
                //Player p2 = new AI();
                res = 2;
                valid = true;
            } else {
                System.out.println("Not valid input. (Type 1 or 2)Try again!");
            }
        } while (!valid);
        return res;
    }//end aiOrPVP

    public static int initializeBoard() {
        System.out.println("Which size of the board you want to play");
        System.out.println("1. 9*9" + "\t" + "2. 15*15" + "\t" + "3. 19*19");
        int size  = 0;
        Scanner scan = new Scanner(System.in);
        Boolean valid = false;
        //Game game = null;
        do {
            int choice = scan.nextInt();
            if (choice == 1) {
                //9*9
                 //game = new Game(9);
                size = 9;
                valid = true;
            } else if (choice == 2) {
                //15*15
                //game = new Game(15);
                size = 15;
                valid = true;
            } else if (choice == 3) {
                //19*19
               //game = new Game(19);
                size = 19;
               valid = true;
            } else {
                System.out.println("Not valid input. (Type 1, 2 or 3)Try again!");
            }
        } while (!valid);
        return size;
        //Board board = game.getBoard();
        //board.printBoard();
    }//end initializeBoard
*/
    }
}