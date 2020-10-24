package l00161844.assign1;

import java.sql.DataTruncation;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
//        Employee e1 = new Employee("Paulo Jardim", 29, 4000.0);
//        Manager m1 = new Manager("John Atkins", 45, 3000.00, 100.0);
//
//        m1.doJob(new Job("overtime", 100.0, 1));
//
//        System.out.println(m1.getDescription());

        Student s1 = new Student("Johny Martin", 25, "Computer science");
        System.out.println(s1.getDescription());

        s1.doJob(new Job("Porter", 10.0, 10));

        System.out.println(s1.getDescription());

        s1.doJob(new Job("Cleaning", 15.0, 8));

        for (Job j:s1.getJobs()){
            System.out.println(j.toString());
        }

    }
}
