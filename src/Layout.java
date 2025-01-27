import java.util.Scanner;

public class Layout {
    private static char[] guessedWord1;
    private static char[] guessedWord2;

    String player1GuessedLetters = "";
    String player2GuessedLetters = "";

    StartGame startGame = new StartGame();
    WinCheck winCheck = new WinCheck();
    Guessing guessing = new Guessing();
    Scanner scanner = new Scanner(System.in);
    public void initializeGuesses(String word1, String word2) {
        guessedWord1 = new char[word1.length()];
        guessedWord2 = new char[word2.length()];

        for (int i = 0; i < guessedWord1.length; i++) {
            guessedWord1[i] = '-';
        }
        for (int i = 0; i < guessedWord2.length; i++) {
            guessedWord2[i] = '-';
        }
    }

    public char[] getGuessedWord1() {
        return guessedWord1;
    }

    public char[] getGuessedWord2() {
        return guessedWord2;
    }

    public void checkGuessedWord(char guess, int turn, String word) {


        if(turn == 0){
            for (int i = 0; i < guessedWord1.length; i++) {
                if (word.charAt(i) == guess) {
                    guessedWord1[i] = guess;
                }
            }
            System.out.println();
            displayGuessedLetters(turn, guess);

        }else{
            for (int i = 0; i < guessedWord2.length; i++) {
                if (word.charAt(i) == guess) {
                    guessedWord2[i] = guess;
                }
            }
            System.out.println();
            displayGuessedLetters(turn, guess);
        }

        System.out.println();
        displayGuessedWord(guessedWord1, startGame.playerOne);
        displayGuessedWord(guessedWord2, startGame.playerTwo);

        if(turn == 0){
            winCheck.compareWords(guessedWord1, word, startGame.playerTwo, 0);
        }else{
            winCheck.compareWords(guessedWord2, word, startGame.playerOne, 1);

        }

    }

    public void displayGuessedWord(char[] guessedWord, String playerName) {

        System.out.print(playerName + "'s word:     ");

        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void displayGuessedLetters(int turn, char guess){

        if(turn == 1){
            player1GuessedLetters += guess;
        }else{
            player2GuessedLetters += guess;
        }

        System.out.print(startGame.playerOne + " guessed letters:     ");
        for (char c : player1GuessedLetters.toCharArray()) {
            System.out.print(c + "  ");
        }
        System.out.println();
        System.out.print(startGame.playerTwo + " guessed letters:     ");
        for (char c : player2GuessedLetters.toCharArray()) {
            System.out.print(c + "  ");
        }

        System.out.println();

    }

    public char checkDuplicateGuess(char guess, int turn) {

        boolean isDuplicate = false;

        if(turn == 0) {

            for (int i = 0; i < player1GuessedLetters.length(); i++) {
                if (player1GuessedLetters.charAt(i) == guess) {
                    isDuplicate = true;
                    break;
                }
            }

        }else{

            for (int i = 0; i < player2GuessedLetters.length(); i++) {
                if (player2GuessedLetters.charAt(i) == guess) {
                    isDuplicate = true;
                    break;
                }
            }
        }

        if(isDuplicate){
            System.out.println("Duplicate Guess, please input a new letter!");
            return checkDuplicateGuess(scanner.next().toLowerCase().charAt(0), turn);
        }else{
            return guess;
        }
    }
}
