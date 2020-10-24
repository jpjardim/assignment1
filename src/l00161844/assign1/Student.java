package l00161844.assign1;

import java.util.ArrayList;

/**
 * @author paulo_jardim
 */
public class Student extends Person implements PartTimeAble{
    double beerMoney;
    String course;
    ArrayList<Job> jobs;

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
}
