import java.util.Scanner;

public class StartGame {

    public static String playerOne;
    public static String playerTwo;

    static Scanner scanner = new Scanner(System.in);

    public void chooseNames(){

        System.out.println("Player 1, please insert your name!");
        playerOne = scanner.next();
        System.out.println();
        System.out.println("Player 2, please insert your name!");
        playerTwo = scanner.next();
        System.out.println();
    }
}