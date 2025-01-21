 import java.util.Scanner;

public class Choosingwords {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String word1 = "";
        String word2 = "";

     
        for (int turn = 1; turn <= 2; turn++) { 
            System.out.print("Player 1, enter a word (Turn " + turn + "): ");
            word1 = scanner.nextLine();

            System.out.print("Player 2, enter a word (Turn " + turn + "): ");
            word2 = scanner.nextLine();
        }

        
        System.out.println("Player 1 entered: " + word1);
        System.out.println("Player 2 entered: " + word2);
 
        scanner.close();
    }
}
