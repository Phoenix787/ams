package Level2.ex1;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Main {

    public static void main(String[] args) {

//        NonGen intObject = new NonGen(12);
//        NonGen stringObject = new NonGen("Hello");
//
//        String object = (String) stringObject.getObject();
//
//        System.out.println(((Integer) intObject.getObject()));

        Gen<Integer> intObject = new Gen<>(12);
        Gen<String> stringObject = new Gen<>("Hello");

        String object = stringObject.getObject();

        System.out.println(intObject.getObject());

    }

}
