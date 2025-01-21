import java.util.Scanner;

public class StartGame {

    public String playerOne;
    public String playerTwo;

    Scanner scanner = new Scanner(System.in);

    public void chooseNames(){

        System.out.println("Player 1, please insert your name!");
        playerOne = scanner.next();
        System.out.println("Player 2, please insert your name!");
        playerTwo = scanner.next();
    }
}