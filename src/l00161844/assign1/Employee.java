package l00161844.assign1;

/**
 * @author Paulo Jardim
 */
public class Employee extends Person implements Comparable<Employee> {
    private int employeeId = 0;
    private static int idGenerator = 1;
    private double salary;

    /**
     * default constructor and set salary to 0.0
     */
    public Employee(){
        super();
        salary = 0.0;
        employeeId++;
    }

    /**
     * initialize all employee instance fields
     * @param n the employee name
     *
     */
    public Employee(String n, int a, double s){
        super(n,a);
        salary = s;
        employeeId++;
    }

    /**
     *
     * @return the employee ID
     */
    public int getEmployeeId(){
        return this.employeeId;
    }

    /**
     *
     * @return the employee salary
     */
    public double getSalary(){
        return this.salary;
    }

    /**
     *
     * @return the employee description and instance fields
     */
    @Override
    public String getDescription() {
        String idFormatted = String.format("%04d", getEmployeeId()); // Filling with zeroes
        String nameFormatted = String.format("%20s", getName());
        String ageFormatted = String.format("%5d", getAge());
        String salaryFormatted = String.format("€%,10.2f", getSalary());
        return idFormatted + "     " + nameFormatted + "     " + ageFormatted + "     " + salaryFormatted;
    }

    /**
     * Compare employees based on salary
     * @param other the employee object
     * @return negative integer if object is smaller, zero if object is equal and positive integer if object is greater
     */
    @Override
    public int compareTo(Employee other) {
        if (this.salary - other.salary > 0)
            return 1;
        if (this.salary - other.salary < 0)
            return -1;
        return 0;
    }

    /**
     * Compare two employees
     * @param otherObj the other employee object
     * @return true if the name, age and salary are the same, return false otherwise
     */
    @Override
    public boolean equals(Object otherObj) {
        Employee other;

        if (otherObj instanceof Employee)
            other = (Employee) otherObj;
        else
            return false;

        if (this.getName().equals(other.getName()) &&
                (this.getAge() == other.getAge()) &&
                (this.salary == other.salary))
            return true;
        return false;
    }
}