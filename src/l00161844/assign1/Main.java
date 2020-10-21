package l00161844.assign1;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Paulo Jardim", 29, 3500.00);
        System.out.println(e1.getDescription());

        Manager m1 = new Manager("John Doe", 45, 5000.0, 3000.0);
        System.out.println(m1.getDescription());

    }
}
