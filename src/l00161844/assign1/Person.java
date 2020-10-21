package l00161844.assign1;


/**
 * @author Paulo Jardim
 *
 */

public abstract class Person {
    private String name;
    private int age;

    /**
     * default constructor
     */
    public Person(){
        name = "Don't know";
        age = 0;
    }

    /**
     * initialize all person instance fields
     * @param n the person name
     * @param a the person age
     */
    public Person(String n, int a){
        name = n;
        age = a;
    }

    /**
     *
     * @return the person age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return the person description
     */
    public abstract String getDescription();

    /**
     *
     * @return the person name
     */
    public String getName(){
        return name;
    }
}