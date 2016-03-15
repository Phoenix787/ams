package L1_Dolgov.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ксения on 12.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Person> mapPerson = new HashMap<>();
        mapPerson.put("friend", new Person("Tom", 25));
        mapPerson.put("friend2", new Person("Tom2", 33));
        mapPerson.put("vip", new Person("Albert", 29));

        System.out.println("----------- MAP ---------------");

        System.out.println(mapPerson.get("friend").getName());

        System.out.println();

        for (Map.Entry<String, Person> stringPersonEntry : mapPerson.entrySet()) {
            System.out.println(stringPersonEntry.getKey() + " -> " + stringPersonEntry.getValue());
        }

    }
}
