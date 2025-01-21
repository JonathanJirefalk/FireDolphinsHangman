import java.util.Scanner;

public class Guessing
{
    Scanner scanner = new Scanner(System.in);

    public int guessingTurn = 0;
    char guess;

    public void guessLetter(){

        System.out.println(guessingTurn);

        if (guessingTurn == 0){

            System.out.println(StartGame.playerOne + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 1;
            String word = Choosingwords.word2;
            checkGuess(word);

        }else if (guessingTurn == 1){

            System.out.println(StartGame.playerTwo + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 0;
            String word = Choosingwords.word1;
            checkGuess(word);
        }
    }

    public void checkGuess(String word){

        for (int i = 0; i < word.length(); i++){

            if (guess == word.charAt(i)){

                System.out.println("Correct Guess");
            }
        }
        guessLetter();
    }
}