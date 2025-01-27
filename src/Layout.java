import java.sql.SQLOutput;

public class Layout {
    private static char[] guessedWord1;
    private static char[] guessedWord2;

    StartGame startGame = new StartGame();
    WinCheck winCheck = new WinCheck();

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
            winCheck.compareWords(guessedWord1, word, startGame.playerTwo);

        }else{
            for (int i = 0; i < guessedWord2.length; i++) {
                if (word.charAt(i) == guess) {
                    guessedWord2[i] = guess;
                }
            }
            winCheck.compareWords(guessedWord2, word, startGame.playerOne);
        }

        displayGuessedWord(guessedWord1, startGame.playerOne);
        displayGuessedWord(guessedWord2, startGame.playerTwo);


    }

    public void displayGuessedWord(char[] guessedWord, String playerName) {

        System.out.print(playerName + "'s word:     ");

        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
