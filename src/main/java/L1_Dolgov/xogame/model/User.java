package L1_Dolgov.xogame.model;

/**
 * Created by Ксения on 15.03.2016.
 */
public class User extends Player{



    private boolean isShoot;

    public User() {
        super();
    }

    public Point getPoint() {
        isShoot = false;
        while (!isShoot){

        }
        return point;
    }

    public boolean isShoot() {
        return isShoot;
    }

    public void setShoot(boolean shoot) {
        isShoot = shoot;
    }
}
