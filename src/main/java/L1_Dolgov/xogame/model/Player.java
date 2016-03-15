package L1_Dolgov.xogame.model;

/**
 * Created by Ксения on 15.03.2016.
 */
public abstract class Player {
    Point point;
    Type type;


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
