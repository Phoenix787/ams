import com.iostreams.serializable.Employee;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Ксения on 03.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        PrintWriter out = new PrintWriter(new FileWriter("employee.txt"), true);
//
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Mary Terci", 21, 45000, new Date());
//        staff[1] = new Employee("Harry Ftruy", 23, 75200, new Date());
//        staff[2] = new Employee("Frank Sheft", 40, 20000, new Date());
//        write(staff, out);
//        out.close();
//
//        Scanner in = new Scanner(new FileInputStream("employee.txt"));
//
//       // BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("employee.txt"), "UTF-8"));
//
//        Employee[] staff1 = read(in);
//
//        for (Employee employee : staff1) {
//            System.out.println(employee);
//        }
//        in.close();

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("employee.dat"))) {
            dout.writeChars("Harry String, 23, 75000");

        } catch (IOException e) {
            e.printStackTrace();
        }

        RandomAccessFile raf = new RandomAccessFile("employee.dat", "rw");
        String s = raf.readLine();

        System.out.println(s);



    }

    public static Employee[] read(Scanner in) {
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            employees[i].readOut(in);

        }
        return employees;
    }

    public static void write(Employee[] employees, PrintWriter out){
        out.println(employees.length);
        for (Employee employee : employees) {
            employee.writeOut(out);
        }
    }



}
