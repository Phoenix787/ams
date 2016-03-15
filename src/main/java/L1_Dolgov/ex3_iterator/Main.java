package L1_Dolgov.ex3_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Ксения on 13.03.2016.
 * Iterator. Дело в том, что мы не можем в цикле foreach удалять из коллекции элементы
 */
public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom", 25));
        list.add(new Person("Jerryh", 22));
        list.add(new Person("Pdam", 22));
        list.add(new Person("Kitty", 23));
        List<Person> list1 = new CopyOnWriteArrayList<>(list);

        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

//        list.stream().filter(person -> person.getName().equals("Tom")).forEach(list::remove);

        /*for (Person person : list) {       // ТАК НЕЛЬЗЯ!!!
            if (person.getName().equals("Tom") ){
                list.remove(person);   //Exception in thread "main" java.util.ConcurrentModificationException
            }
        }*/

        //Exception in thread "main" java.util.ConcurrentModificationException возникает потому что мы одновременно
        //пробегаем по коллекции и пытаемся её менять

        //ЧЕРЕЗ ИТЕРАТОР itco
        for (Iterator<Person> iterator = list.iterator(); iterator.hasNext(); ) {
            Person next = iterator.next();
            if (next.getName().equals("Tom")){
                iterator.remove();
            }

        }
        System.out.println();
        System.out.println("-------- Removed --------------");
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

       // CopyOnWriteArrayList<Person> позволит удалить элемент при обычном foreach
        //с точки зрения эффективности не очень хорош, практически создание копии массива

//        for (Person person : list1) {
//            if (person.getName().equals("Kitty")) {
//                list1.remove(person);
//            }
//        }

        list1.stream().filter(person -> person.getName().equals("Kitty")).forEach(list1::remove);

        System.out.println();
        System.out.println("-------- Removed from CopyOnWriteArrayList --------------");
        for (Person person : list1) {
            System.out.println(person.getName() + " " + person.getAge());
        }



    }
}
