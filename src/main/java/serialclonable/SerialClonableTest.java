package serialclonable;

/**
 * Created by Ксения on 06.03.2016.
 */
public class SerialClonableTest {
    public static void main(String[] args) {
        Employee harry = new Employee("HarrySmith", 32, 48000, 2013, 2, 12);
        try {
            Employee harry2 = (Employee)harry.clone();
            harry.raiseSalary(10);
            System.out.println(harry);
            System.out.println(harry2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
