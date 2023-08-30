import java.util.*;
public class ReverseCollection 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "platform", "learning", "best", "the");

        System.out.println("Reversing the list: " + list);

        Collections.reverse(list);//reverses list

        System.out.println(list);
    }    
}
