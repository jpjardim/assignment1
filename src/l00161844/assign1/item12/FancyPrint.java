package l00161844.assign1.item12;

public class FancyPrint implements ConsolePrint{

    public FancyPrint(){}

    @Override
    public void printInfo(String infoToprint) {
        String[] part = infoToprint.split(" ", 2); //split the String in two
        System.out.printf("*****%20s*****\n", part[0]); //limit the first string to 20 chars, add 5 * before and after text
        String[] subString = part[1].split(" "); //split the second string in X times
        for (String s:subString){
            System.out.printf("%s\t", s); //print each substring with a tab between each one
        }
        System.out.println("\n******************************"); //prints out the bottom 30 *
    }
}
