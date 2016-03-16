package Level2.ex4;

/**
 * Created by Ксения on 15.03.2016.
 */
public class MAin {
    public static void main(String[] args) {
        Gen1<Integer> integerGen1 = new Gen1<>(12);
        integerGen1.show();


        //можем создать только cat который имплиментирует интерфейс miauable
        Gen3<Cat> catGen3 = new Gen3<>(new Cat());

        catGen3.show();

      //  Gen1<String> str = new Gen1<>(5);  нельзя
    }
}
