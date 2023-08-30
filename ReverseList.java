//java program that reverses elements in a list
import java.util.*;

public class ReverseList 
{
    
    public static void main(String[] args) {
        //Creating the list
        List<String> list = new ArrayList<>();
        //adds all the elements together
        Collections.addAll(list, "platform", "learning", "best", "the");

        //prints out the list
        System.out.println("Currrent list given: " + list);

        //reverses the list
        Collections.reverse(list);
        //prints out reverse list
        System.out.println("Reverse list: " + list);
    }



}
