public class WinCheck {

    static Guessing guessing = new Guessing();

    public void compareWords(char[] guessedWord, String playerWord, String playerName){

        StringBuilder tempString = new StringBuilder();

        for (char c : guessedWord) {
            tempString.append(c);
        }

        if(tempString.toString().equals(playerWord)){
            System.out.println();
            System.out.println("Game Over, " + playerName + " wins!");
            guessing.setTurn(3);
        }
    }
}
