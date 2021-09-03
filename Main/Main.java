import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcome();
    }

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
                System.out.println("Now start Game!");
                //Start the game
                aiOrPvp();

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

    public static void aiOrPvp() {
        System.out.println("*************************************************************************");
        System.out.println("******************************* 1. PVP **********************************");
        System.out.println("******************************* 2. AI  **********************************");
        System.out.println("*************************************************************************");

        System.out.println("PVP/AI?");
        Scanner scan = new Scanner(System.in);
        Boolean valid = false;

        do {
            int choice = scan.nextInt();
            if (choice == 1) {
                //Play against person
                valid = true;
            } else if (choice == 2) {
                //play with AI

                valid = true;
            } else {
                System.out.println("Not valid input. (Type 1 or 2)Try again!");
            }
        } while (!valid);

    }//end aiOrPVP

    public static void initializeBoard(){
        System.out.println("Which size of the board you want to play");
        System.out.println("1. 9*9"+"\t"+"2. 15*15"+"\t"+"3. 19*19");

        Scanner scan = new Scanner(System.in);
        Boolean valid = false;

        do {
            int choice = scan.nextInt();
            if (choice == 1) {
                //9*9
                Game game = new Game(9);
                valid = true;
            } else if (choice == 2) {
                //15*15
                Game game = new Game(15);
                valid = true;
            } else if(choice ==3){
                //19*19
                Game game = new Game(19);
            }else{
                System.out.println("Not valid input. (Type 1, 2 or 3)Try again!");
            }
        } while (!valid);
    }//end initializeBoard

}