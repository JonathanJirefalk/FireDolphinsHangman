public class App {

    StartGame startGame = new StartGame();
    Guessing guessing = new Guessing();

    public void run(){

        startGame.chooseNames();
        guessing.guessLetter();
    }
}