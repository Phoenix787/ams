package Level2.ex1;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Gen<T> {
    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
