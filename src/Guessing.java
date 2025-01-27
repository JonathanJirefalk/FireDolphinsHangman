import java.util.Scanner;

public class Guessing
{
    static Scanner scanner = new Scanner(System.in);
    Layout layout = new Layout();
    Choosingwords choosingwords = new Choosingwords();

    public static int guessingTurn = 0;
    char guess;

    public void guessLetter(){

        if (guessingTurn == 0){

            System.out.println(StartGame.playerOne + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 1;

            checkGuess(guess, 0);

        }else if (guessingTurn == 1){

            System.out.println(StartGame.playerTwo + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 0;

            checkGuess(guess, 1);
        }
    }

    public void checkGuess(char guess, int turn){

        if(turn == 0){
            layout.checkGuessedWord(guess, 1, choosingwords.word2);
        }else{
            layout.checkGuessedWord(guess, 0, choosingwords.word1);
        }

        guessLetter();
    }
}