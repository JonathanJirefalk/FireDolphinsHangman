public class App {

    StartGame startGame = new StartGame();
    Guessing guessing = new Guessing();
    Choosingwords choosingwords = new Choosingwords();

    public void run(){

        startGame.chooseNames();
        choosingwords.chooseWord();
        guessing.guessLetter();
    }
}