package l00161844.assign1;

import l00161844.assign1.item12.ConsolePrint;
import l00161844.assign1.item12.FancyPrint;
import l00161844.assign1.item12.SimplePrint;

/**
 * @author paulo_jardim
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
    public Manager(String n, int a, double s, FancyPrint f, double b){
        super(n,a,s,f); bonus = b;
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
        String idFormatted = String.format("%04d", getEmployeeId()); // Filling with zeroes
        String nameFormatted = String.format("%20s", getName());
        String ageFormatted = String.format("%5d", getAge());
        String salaryFormatted = String.format("€%,10.2f", super.getSalary()); //add Euro sign, comma and 2 decimal points precision
        String bonusFormatted = String.format("€%,8.2f", getBonus());
        return idFormatted + "     " + nameFormatted + "     " + ageFormatted + "     " + salaryFormatted + "     " + bonusFormatted + "\n" + getName() + "'s effective salary is: " + "€"+getSalary();
    }

    @Override
    public void doJob(Job j) {
        updateSalary(j.getPrice()*.7);
    }

    /**
     * set the printer tupe to simple
     * @param s the simple printer
     */
    public void setSimplePrinter(SimplePrint s){
        super.setSimplePrinter(s); //calls the super method
    }

    /**
     * set the printer type to fancy
     * @param f the fancy printer
     */
    public void setFancyPrinter(FancyPrint f){
        super.setFancyPrinter(f); //calls the super method
    }

    /**
     * wrapper method to invoke Simple or Fancy printer
     */
    public void printDescription(){
       super.printDescription(); //call the super method
    }
}