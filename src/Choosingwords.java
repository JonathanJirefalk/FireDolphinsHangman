import java.util.Scanner;

public class Choosingwords {

    Scanner scanner = new Scanner(System.in);
    StartGame startGame = new StartGame();

    Layout layout = new Layout();

    public static String word1;
    public static String word2;

    public void chooseWord(){

        System.out.println(startGame.playerOne + ", enter a word");
        word1 = scanner.nextLine();

        System.out.println(startGame.playerTwo + ", enter a word");
        word2 = scanner.nextLine();

        layout.initializeGuesses(word1, word2);

        System.out.println("Player 1 entered: " + word1);
        System.out.println("Player 2 entered: " + word2);
    }
}