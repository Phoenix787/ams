package L1_Dolgov.xogame.controller;

import L1_Dolgov.xogame.model.*;

/**
 * Created by Ксения on 15.03.2016.
 */
public class GameController {


    private User user;
    private Computer computer;
    private Field field;
    private static GameController gameController;

    private GameController(){
        user = new User();
        computer = new Computer();
        field = new Field();

    }

    public static GameController instance(){
        if (gameController == null){
            gameController = new GameController();
        }
        return gameController;
    }

    public void doShoot(Point point, Type type){
        user.setPoint(point);
        user.setType(type);
        user.setShoot(true);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public static GameController getGameController() {
        return gameController;
    }

    public static void setGameController(GameController gameController) {
        GameController.gameController = gameController;
    }
}
