package l00161844.assign1;

import l00161844.assign1.item12.ConsolePrint;
import l00161844.assign1.item12.FancyPrint;
import l00161844.assign1.item12.SimplePrint;

import java.util.Comparator;

/**
 * @author paulo_jardim
 */
public class Employee extends Person implements Comparable<Employee>, PartTimeAble {
    private int employeeId;
    private static int idGenerator;
    private double salary;
    private ConsolePrint printer = null;

    /**
     * default constructor and set salary to 0.0
     */
    public Employee(){
        super(); salary = 0.0; idGenerator++;
        employeeId=idGenerator;
    }

    /**
     * initialize all employee instance fields
     * @param n the employee name
     *
     */
    public Employee(String n, int a, double s, FancyPrint f){
        super(n,a); salary = s; idGenerator++; printer = f;
        employeeId=idGenerator;
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

    public void updateSalary(double s){
        salary += s;
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
        double result = Double.compare(this.salary, other.salary);
        if (result > 0)
            return 1;
        if (result < 0)
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

    /**
     *
     * @param j the job object
     */
    @Override
    public void doJob(Job j) {
        updateSalary(j.getPrice()*.4);
    }

    /**
     * set the printer tupe to simple
     * @param s the simple printer
     */
    public void setSimplePrinter(SimplePrint s){
        printer = s;
    }

    /**
     * set the printer type to fancy
     * @param f the fancy printer
     */
    public void setFancyPrinter(FancyPrint f){
        printer = f;
    }

    /**
     * wrapper method to invoke Simple or Fancy printer
     */
    public void printDescription(){
        printer.printInfo(getDescription());
    }
}