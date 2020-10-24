package l00161844.assign1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

    public EmployeeNameComparator(){}

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
