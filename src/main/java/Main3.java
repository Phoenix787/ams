import com.iostreams.serializable.Employee;
import com.iostreams.serializable.Manager;

import java.io.*;
import java.util.Date;

/**
 * Created by Ксения on 06.03.2016.
 */
public class Main3 {
    public static void main(String[] args) {

        Employee harry = new Employee("Harry Mild", 30, 10000, new Date());
        Manager carl = new Manager("Carl Brugger", 42, 75000, new Date());
        carl.setSecretary(harry);
        Manager mark = new Manager("Mark Owen", 45, 89000, new Date());
        mark.setSecretary(harry);

        Employee[] staff = new Employee[3];
        staff[0] = harry;
        staff[1] = carl;
        staff[2] = mark;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"))){
            //out.writeObject(staff);
            harry.writeExternal(out);
            carl.writeExternal(out);
            mark.writeExternal(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"))){
            Employee[] employee1 = new Employee[3];
            for (int i = 0; i < employee1.length ; i++) {
                employee1[i] = new Employee();
                employee1[i].readExternal(in);
            }

//            Employee[] newStaff = (Employee[]) in.readObject();
//            newStaff[0].setSalary(newStaff[0].getSalary() + 500);
//
            for (Employee employee : employee1) {
                System.out.println(employee);
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }



    }
}
