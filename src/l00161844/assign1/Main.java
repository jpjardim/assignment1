package l00161844.assign1;

import l00161844.assign1.item12.FancyPrint;
import l00161844.assign1.item12.SimplePrint;

import java.sql.DataTruncation;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("John", 15, "Science", new FancyPrint());
        s1.printDescription();
        s1.setSimplePrinter(new SimplePrint());
        s1.printDescription();

        Employee e1 = new Employee("Paulo", 29, 3500.0, new FancyPrint());

        e1.printDescription();

        Manager m1 = new Manager("Paulo", 29, 3500.0, new FancyPrint(), 200.0);

        m1.printDescription();
    }
}
