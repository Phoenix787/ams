package L1_Dolgov.xogame.model;

import L1_Dolgov.xogame.controller.GameController;

/**
 * Created by Ксения on 15.03.2016.
 */
public class MainGame {
    GameController gameController = GameController.instance();


    public void start(){
        gameController.getField().show();
        gameController.getField().doShoot(gameController.getComputer().getPoint(), Type.O);
        //checkIsWin
        gameController.getField().show();
        gameController.getField().doShoot(gameController.getUser().getPoint(), Type.X);
        gameController.getField().show();
    }
}
