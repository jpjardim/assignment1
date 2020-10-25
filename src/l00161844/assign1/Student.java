package l00161844.assign1;

import l00161844.assign1.item12.ConsolePrint;
import l00161844.assign1.item12.FancyPrint;
import l00161844.assign1.item12.SimplePrint;

import java.util.ArrayList;

/**
 * @author paulo_jardim
 */
public class Student extends Person implements PartTimeAble{
    double beerMoney;
    String course;
    ArrayList<Job> jobs;
    private ConsolePrint printer = null;

    /**
     * default constructor
     * @param n the student name
     * @param a the student age
     * @param c the student course
     */
    public Student (String n, int a, String c){
        super(n,a); course = c; beerMoney =0; jobs = new ArrayList<Job>();
    }

    /**
     * overloaded constructor with the printer param
     * @param n the student name
     * @param a the student age
     * @param c the student course
     * @param f the printer type (fancy or simple print)
     */
    public Student (String n, int a, String c, FancyPrint f){
        super(n,a); course = c; beerMoney =0; jobs = new ArrayList<Job>(); printer = f;
    }

    /**
     * Update the beer money
     * @param b the money to be added
     */
    public void setBeerMoney(double b){
        beerMoney += b;
    }

    /**
     *
     * @return the student beer money
     */
    public double getBeerMoney(){
        return beerMoney;
    }

    /**
     *
     * @return the student course
     */
    public String getCourse(){
        return course;
    }

    /**
     *
     * @return the student name, age, course and beermoney
     */
    @Override
    public String getDescription() {
        String nameFormatted = String.format("%20s", getName());
        String ageFormatted = String.format("%5d", getAge());
        String beerMoneyFormatted = String.format("€%,10.2f", getBeerMoney());
        return getName() + "     " + ageFormatted + "     " + beerMoneyFormatted;
    }

    /**
     * add the job price to the beer money and add the job to the list of jobs
     * @param j the student job
     */
    @Override
    public void doJob(Job j) {
        setBeerMoney(j.getPrice());
        jobs.add(j);
    }

    /**
     *
     * @return the student list of jobs
     */
    public ArrayList<Job> getJobs(){
        return jobs;
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
