package Level2.ex4;

/**
 * Created by Ксения on 15.03.2016.
 * & <--------   чтобы тип ограничивался потомками Animal и одновременно реализовывал интерфейс Miauable!!!!
 * если есть еще один интерфес -> Animal & Miauable & Serializable
 *
 * можно только интерфесами ограничить типы: T extends Miauable & Serializable
 */
public class Gen3<T extends Animal & Miauable> {
    T object;


    public Gen3(T object) {
        this.object = object;
    }

    void show(){
        double d = object.doubleValue();
        System.out.println(d);
    }
}
