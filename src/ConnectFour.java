import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like the height of the board to be? ");
        int boardHeight = scanner.nextInt();
        System.out.print("What would you like the length of the board to be? ");
        int boardLength = scanner.nextInt();

        char[][] board = new char[boardLength][boardHeight];

        initializeBoard(board);

        printBoard(board);

        System.out.println("Player 1: x");
        System.out.println("Player 2: o");

        System.out.println("Player 1: Which column would you like to choose?");
        int col = scanner.nextInt();
        char chipType = 'x';

        insertChip(board, col, chipType);

    }

    public static void printBoard(char[][] array){

        for (int i = array.length - 1; i > -1; i--){

            for (int j = 0; j < array[i].length; j++){

                System.out.print(array[i][j] + " ");

            }

            System.out.println();

        }

    }

    public static void initializeBoard(char[][] array){

        for (int i = 0; i < array.length; i++){

            Arrays.fill(array[i], '-');

        }

    }

    public static void insertChip(char[][]array, int col, char chipType){



    }

}