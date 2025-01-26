 public class Layout {
    private static char[] guessedWord1;
    private static char[] guessedWord2;

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

    public void checkGuessedWord(char[] guessedWord, char guess, int turn, String word) {
        for (int i = 0; i < guessedWord.length; i++) {
            if (word.charAt(i) == guess) {
                guessedWord[i] = guess;
            }
        }

        if(turn == 0){
            guessedWord1 = guessedWord;
            displayGuessedWord(guessedWord);
        }else{
            guessedWord2 = guessedWord;
            displayGuessedWord(guessedWord);
        }
    }

    public void displayGuessedWord(char[] guessedWord) {
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
