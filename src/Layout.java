public class Layout {
    private static char[] guessedWord1;
    private static char[] guessedWord2;

    String player1GuessedLetters = "";
    String player2GuessedLetters = "";

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

        winCheck.compareWords(guessedWord1, word, startGame.playerTwo);
        winCheck.compareWords(guessedWord2, word, startGame.playerOne);

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
}
