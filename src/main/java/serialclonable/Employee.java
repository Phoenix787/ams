package serialclonable;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Ксения on 03.03.2016.
 * serialVersionUID генерируется в идее при реализации интерфейса Cloneable
 */
public class Employee extends SerialClonable implements Externalizable {
    private static final long serialVersionUID = 8198457638728295288L;
    private String name;
    private int age;
    private double salary;
    private Date hireDate;

    public Employee(String name, int age, double salary, int year, int month, int day) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,  month-1, day);
        this.hireDate = calendar.getTime();
    }

    public Employee() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void raiseSalary(double persent) {
        double raise = salary * persent / 100;
        salary+=raise;
    }

    @Override
    public String toString() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(hireDate);
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hiredate: " + calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/"
                + calendar.get(Calendar.DAY_OF_MONTH) +
                '}';
    }

    public void writeOut(PrintWriter out) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(hireDate);
        out.println(name + "|"
        + age + "|"
        + salary + "|"
        + calendar.get(Calendar.YEAR)+ "|"
        + calendar.get(Calendar.MONTH) + "|"
        + calendar.get(Calendar.DAY_OF_MONTH));

    }

//    public Employee readOut(Scanner in) {
//        String line = in.nextLine();
//        String[] tokens = line.split("\\|");
//        name = tokens[0];
//        age = Integer.parseInt(tokens[1]);
//        salary = Double.parseDouble(tokens[2]);
//        int y = Integer.parseInt(tokens[3]);
//        int m = Integer.parseInt(tokens[4]);
//        int d = Integer.parseInt(tokens[5]);
//        GregorianCalendar calendar = new GregorianCalendar(y, m - 1, d);
//        hireDate = calendar.getTime();
//        return new Employee(name, age, salary, hireDate);
//    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
        out.writeDouble(salary);
        out.writeLong(hireDate.getTime());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = in.readUTF();
        age = in.readInt();
        salary = in.readDouble();
        hireDate = new Date(in.readLong());

    }
}
