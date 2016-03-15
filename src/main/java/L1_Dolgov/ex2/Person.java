package L1_Dolgov.ex2;

import java.util.Comparator;

/**
 * Created by Ксения on 12.03.2016.
 */
public class Person implements Comparable<Person>, Comparator<Person> {
    private String name;
    private int age;
    private int salary;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age  +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        //return age - o.age;
        if (age == o.age) {
            return name.compareTo(o.name);
        }
        return age - o.age;
    }
//Компаратор позволяет написать своё сравнение (уникальное).... например по длине имени
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.length() - o2.name.length();
    }
}
