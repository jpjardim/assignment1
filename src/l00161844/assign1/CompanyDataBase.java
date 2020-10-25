package l00161844.assign1;

import java.util.*;

/**
 * @author paulo_jardim
 */
public class CompanyDataBase extends EmployeeNameComparator{
    private ArrayList<Employee> employees;

    /**
     * default contructor
     */
    public CompanyDataBase() { employees = new ArrayList<Employee>(); }

    /**
     *
     * @param newGuy the new employee
     */
    public void addEmployee(Employee newGuy){
        employees.add(newGuy);
    }

    /**
     * uses the compareTo method from the employee class to sort employees
     * @return the employees array sorted by salary, ascending order
     */
    public ArrayList<Employee> sortBySalary(){
        Collections.sort(getemployees());
        return employees;
    }

    /**
     *
     * @return a sorted by name array of employees
     */
    public ArrayList<Employee> sortByName(){
        EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        for (int i = 0; i < employees.size(); i++){
            for (int j = 0; j < (employees.size() - 1 - i); j++){
                if(nameComparator.compare(employees.get(j), employees.get(j+1)) > 0)                {
                    Employee temp = employees.get(j);
                    employees.set(j,employees.get(j+1));
                    employees.set(j+1, temp);
                }
            }
        }
        return employees;
    }

    /**
     *
     * @return an array list with employees
     */
    public ArrayList<Employee> getemployees(){
        return employees;
    }

    /**
     * Bubble sort wrapper that calls the private bubbleSort method
     */
    public void bubblesortBySalary() {
        bubbleSort();
    }

    /**
     * Bubble sort method
     */
    private void bubbleSort(){
        for (int i = 0; i < employees.size(); i++){
            for (int j = 0; j < (employees.size() - 1 - i); j++){
              if(employees.get(j).getSalary() < employees.get(j+1).getSalary()){
                Employee temp = employees.get(j);
                employees.set(j, employees.get(j+1));
                employees.set(j+1, temp);
              }
            }
        }
    }

}
