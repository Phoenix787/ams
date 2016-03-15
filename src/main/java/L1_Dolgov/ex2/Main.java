package L1_Dolgov.ex2;

import java.util.*;

/**
 * Created by Ксения on 12.03.2016.
 * Comparable, Comparator
 */
public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom", 25));
        list.add(new Person("Jerryh", 22));
        list.add(new Person("Pdam", 22));
        list.add(new Person("Kitty", 23));

        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Collections.sort(list, new Person());
        System.out.println("---------- Sorted by name length --------------");

        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        //можно отсортировать через TreeSet
        TreeSet<Person> treeSet = new TreeSet<>(list);
        System.out.println("------------ Sorted by treeset ---------------");

        for (Person person : treeSet) {
            System.out.println(person.getName() + " " + person.getAge());
        }

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(list, (o1, o2)->
                o1.getAge() - o2.getAge()
        );

        System.out.println("---------- Sorted by anonim comparator --------------");

        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }



    }

}
