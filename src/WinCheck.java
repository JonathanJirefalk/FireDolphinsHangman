public class WinCheck {

    static Guessing guessing = new Guessing();

    public void compareWords(char[] guessedWord, String playerWord, String playerName){

        String tempString = "";

        for (int i = 0; i < guessedWord.length; i++) {
            tempString += guessedWord[i];
        }

        if(tempString.equals(playerWord)){
            System.out.println(playerName + " wins!");
            guessing.guessingTurn = 3;
        }
    }
}
