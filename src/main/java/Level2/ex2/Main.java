package Level2.ex2;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> object = new Gen<>(12, "hello");
        System.out.println(object);
    }
}
