import java.util.Scanner;

public class Guessing
{
    Scanner scanner = new Scanner(System.in);
    static Layout layout = new Layout();

    static int guessingTurn = 0;
    char guess;

    public void setTurn(int turn){
        guessingTurn = turn;
    }

    public void guessLetter(){

        System.out.println();

        if (guessingTurn == 0){

            System.out.println(StartGame.playerOne + "'s turn guess a letter!");
            guess = scanner.next().toLowerCase().charAt(0);

            char finalGuess = layout.checkDuplicateGuess(guess, guessingTurn);

            checkGuess(finalGuess, 0);

        }else if (guessingTurn == 1){

            System.out.println(StartGame.playerTwo + "'s turn guess a letter!");
            guess = scanner.next().toLowerCase().charAt(0);

            char finalGuess = layout.checkDuplicateGuess(guess, guessingTurn);

            checkGuess(finalGuess, 1);
        }
    }

    public void checkGuess(char guess, int turn){

        if(turn == 0){
            layout.checkGuessedWord(guess, 1, Choosingwords.word2);
        }else{
            layout.checkGuessedWord(guess, 0, Choosingwords.word1);
        }

        guessLetter();
    }
}