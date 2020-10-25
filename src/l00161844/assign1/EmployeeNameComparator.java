package l00161844.assign1;

import java.util.Comparator;

/**
 * @author paulo_jardim
 */

public class EmployeeNameComparator implements Comparator<Employee> {

    public EmployeeNameComparator(){}

    /**
     *
     * @param o1 the first employee
     * @param o2 the second employee
     * @return a 0 if the object is the same, 1 if the first object is greater than the second one and -1 if the first object is smaller than the second one
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
