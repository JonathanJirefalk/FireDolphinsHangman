import java.util.Scanner;

public class Choosingwords {

    Scanner scanner = new Scanner(System.in);

    public static String word1;
    public static String word2;

    public void chooseWord(){

        System.out.println("Player 1, enter a word");
        word1 = scanner.nextLine();

        System.out.println("Player 2, enter a word");
        word2 = scanner.nextLine();

        System.out.println("Player 1 entered: " + word1);
        System.out.println("Player 2 entered: " + word2);
    }
}
