package l00161844.assign1;

import java.util.*;

/**
 * @author paulo_jardim
 */
public class CompanyDataBase extends EmployeeNameComparator{
    private ArrayList<Employee> employess;

    /**
     * default contructor
     */
    public CompanyDataBase() {
        employess = new ArrayList<Employee>();
    }

    /**
     *
     * @param newGuy the new employee
     */
    public void addEmployee(Employee newGuy){
        employess.add(newGuy);
    }

    /**
     * uses the compareTo method from the employee class to sort employees
     * @return the employees array sorted by salary, ascending order
     */
    public ArrayList<Employee> sortBySalary(){
        Collections.sort(getEmployess());
        return employess;
    }

    /**
     *
     * @return a sorted by name array of employees
     */
    public ArrayList<Employee> sortByName(){
        EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        for (int i = 0; i < employess.size(); i++){
            for (int j = 0; j < (employess.size() - 1 - i); j++){
                if(nameComparator.compare(employess.get(j), employess.get(j+1)) > 0)                {
                    Employee temp = employess.get(j);
                    employess.set(j,employess.get(j+1));
                    employess.set(j+1, temp);
                }
            }
        }
        return employess;
    }


    /**
     *
     * @return an array list with employees
     */
    public ArrayList<Employee> getEmployess(){
        return employess;
    }

}
