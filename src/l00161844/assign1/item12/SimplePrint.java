package l00161844.assign1.item12;

/**
 * @author paulo_jardim
 */
public class SimplePrint implements ConsolePrint{

    /**
     * default constructor
     */
    public SimplePrint(){}


    /**
     * implements printInfo method
     * @param infoToprint String to print
     */
    @Override
    public void printInfo(String infoToprint) {
        System.out.println(infoToprint);
    }
}
