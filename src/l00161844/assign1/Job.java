package l00161844.assign1;

/**
 * @author paulo_jardim
 */
public class Job {
    private String jobDescription;
    private double rate;
    private double time;

    /**
     *
     * @param j the job description
     * @param r the rate of the job
     * @param t the time spent doing the job
     */
    public Job(String j, double r, double t){
        jobDescription = j; rate = r; time = t;
    }

    /**
     * @return the job description
     */

    public String getJobDescription() {
        return jobDescription;
    }

    /**
     *
     * @return the job price, which is the rate * time
     */
    public double getPrice(){
        return getRate()*getTime();
    }

    /**
     *
     * @return the rate of the job
     */
    public double getRate() {
        return rate;
    }

    /**
     *
     * @return the time spent doing the job
     */
    public double getTime() {
        return time;
    }

    /**
     *
     * @return the job description and the price
     */
    @Override
    public String toString() {
        return "{Job desc: " + getJobDescription() + ", the price is: €" + getPrice() + "}";
    }
}
