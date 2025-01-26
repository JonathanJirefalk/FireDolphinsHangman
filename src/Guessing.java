import java.util.Scanner;

public class Guessing
{
    StartGame startGame = new StartGame();
    Choosingwords choosingwords = new Choosingwords();


    Scanner scanner = new Scanner(System.in);

    public int guessingTurn = 0;
    char guess;

    String wordOneGuessed;
    String wordTwoGuessed;

    public void guessLetter(){

        System.out.println(guessingTurn);

        if (guessingTurn == 0){

            System.out.println(startGame.playerOne + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 1;
            String word = choosingwords.word2;
            checkGuess(word);

        }else if (guessingTurn == 1){

            System.out.println(startGame.playerTwo + "'s turn guess a letter!");
            guess = scanner.next().charAt(0);
            guessingTurn = 0;
            String word = choosingwords.word1;
            checkGuess(word);
        }
    }

    public void checkGuess(String word){

        for (int i = 0; i < word.length(); i++){

            if (guess == word.charAt(i)){

                System.out.println("Correct Guess");
            }
        }
        displayGuess();
        guessLetter();
    }

    public void displayGuess(){


    }
}