import java.util.Scanner;

public class Choosingwords {

    Scanner scanner = new Scanner(System.in);

    Layout layout = new Layout();

    public static String word1;
    public static String word2;

    public void chooseWord(){

        System.out.println(StartGame.playerOne + ", enter a word");
        word1 = scanner.nextLine().toLowerCase().trim();

        System.out.println();

        System.out.println(StartGame.playerTwo + ", enter a word");
        word2 = scanner.nextLine().toLowerCase().trim();

        System.out.println();

        layout.initializeGuesses(word1, word2);
        layout.displayGuessedWord(layout.getGuessedWord1(), StartGame.playerOne);
        layout.displayGuessedWord(layout.getGuessedWord2(), StartGame.playerTwo);
    }
}