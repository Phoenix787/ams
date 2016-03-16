package Level2.ex4;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Gen2<T extends Animal> {
    T object;

    public Gen2(T object) {
        this.object = object;
    }

    void show(){
        double d = object.doubleValue();
        System.out.println(d);
    }
}
