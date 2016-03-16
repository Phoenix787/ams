package Level2.ex3;

/**
 * Created by Ксения on 15.03.2016.
 * фильтруем типы --> только те типы, которые являются  Number  и его потомками
 */
public class Gen1<T extends Number> {
    T object;

    public Gen1(T object) {
        this.object = object;
    }

    void show(){
        double d = object.doubleValue();
        System.out.println(d);
    }
}
