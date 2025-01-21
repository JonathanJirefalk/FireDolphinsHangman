import java.util.Scanner;

public class Guessing
{
    Scanner scanner = new Scanner(System.in);
    
    public int guessingTurn = 0;
    public char playerOneGuess;
    public char playerTwoGuess;
    
    public void guessLetter(){

        if (guessingTurn == 0){

            System.out.println(StartGame.playerOne + "'s turn guess a letter!");
            playerOneGuess = scanner.next().charAt(0);
            guessingTurn = 1;
        }else if (guessingTurn == 1){

            System.out.println(StartGame.playerTwo + "'s turn guess a letter!");
            playerTwoGuess = scanner.next().charAt(0);
            guessingTurn = 0;
        }
    }
}