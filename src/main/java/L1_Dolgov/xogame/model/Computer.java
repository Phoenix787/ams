package L1_Dolgov.xogame.model;

import java.util.Random;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Computer extends Player{

    private boolean isShoot;

    @Override
    public Point getPoint() {
        Random random = new Random();
        return new Point(random.nextInt(3), random.nextInt(3));
    }


}
