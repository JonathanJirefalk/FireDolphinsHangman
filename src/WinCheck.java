public class WinCheck {

    Guessing guessing = new Guessing();

    public void compareWords(char[] guessedWord, String playerWord, String playerName, int turn){

        StringBuilder tempString = new StringBuilder();

        for (char c : guessedWord) {
            tempString.append(c);
        }

        if(tempString.toString().equals(playerWord)){
            System.out.println();
            System.out.println("Game Over, " + playerName + " wins!");
            guessing.setTurn(3);
        }else if(turn == 0){
            guessing.setTurn(0);
        }else{
            guessing.setTurn(1);
        }
    }
}
