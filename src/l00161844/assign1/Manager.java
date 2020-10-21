package l00161844.assign1;

/**
 * @author Paulo Jardim
 */
public class Manager extends Employee{
    private double bonus;

    /**
     * default constructor
     */
    public Manager(){
        super();
        bonus = 0;
    }

    /**
     * initialize all manager instance fields
     * @param n the manager name
     * @param a the manager age
     * @param s the manager salary
     * @param b the manager bonus
     */
    public Manager(String n, int a, double s, double b){
        super(n,a,s);
        bonus = b;
    }

    /**
     *
     * @return the manager bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     *
     * @return the manager total salary, which is salary + bonus
     */
    @Override
    public double getSalary() {
        return super.getSalary()+getBonus();
    }

    /**
     *
     * @return the manager name, age and salary
     */
    @Override
    public String getDescription() {
        return "name: " + getName() + " age: " + getAge() + " salary: " + getSalary();
    }

}