package Bridgelabz;
import java.util.*;
public class Flip {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    char userInput = ' ';
    char compInput = ' ';
    int playerFlip;

    static char[] board = new char[10];
    public void welcoming() {
        System.out.println("welcoming to Flip game");
    }
    public void uc1_newBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        System.out.println(" board: ");
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[4]+" | "+board[6]);
        System.out.println("----------");
        System.out.println(board[7]+" | "+board[9]+" | "+board[9]);
    }
    public void uc2_chooseSign() {
        System.out.println("Select letter X or O as your option: ");
        userInput = sc.next().charAt(0);
        if (userInput == 'X' || userInput == 'x') {
            compInput = 'O';
            System.out.println("Player option is X");
            System.out.println("Computer option is O");
        } else if (userInput == 'O' || userInput == 'o') {
            compInput = 'X';
            System.out.println("Player option is O");
            System.out.println("Computer option is X");
        } else
            System.out.println("Select in between o or x");
    }
    public void uc3_newBoard() {
        System.out.println(" board: ");
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[4]+" | "+board[6]);
        System.out.println("----------");
        System.out.println(board[7]+" | "+board[9]+" | "+board[9]);
    }
    public void uc4_makeAMove() {
        System.out.println("Enter the position number between 1 to 9 ");
        int move = sc.nextInt();
        board[move] = userInput;
        uc3_newBoard();
    }
    public void uc5_checkFreeSpace() {
        System.out.println("Free positions are = ");
        for(int i = 1; i < board.length; i++) {
            if(board[i] == ' ')
                System.out.print(i+" ");
        }

    }
    public void uc6_Flip() {

        int Flip = rnd.nextInt(2);
        System.out.println("Enter 1 for head and 0 for tail in order to check who plays first");
        playerFlip = sc.nextInt();
        if(Flip == playerFlip && Flip == 1) {
            System.out.println("Heads ,  player won the Flip");
            uc4_makeAMove();
        }
        else if(Flip == playerFlip && Flip == 0) {
            System.out.println("Tails, player won the Flip");
            uc4_makeAMove();
        }
    }

    public static void main(String[] args) {
        Flip runner = new Flip();
        runner.welcoming();
        runner.uc1_newBoard();
        runner.uc2_chooseSign();
        runner.uc3_newBoard();
        runner.uc4_makeAMove();
        runner.uc5_checkFreeSpace();
        runner.uc6_Flip();
    }
}
