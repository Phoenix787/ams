package L1_Dolgov.xogame;

import L1_Dolgov.xogame.model.MainGame;
import L1_Dolgov.xogame.view.GameWindow;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        mainGame.start();

        GameWindow gameWindow = new GameWindow();
        gameWindow.start();
    }
}
