import java.util.*;
public class ReverseRecursively 
{
    public static <T> void revlist(List<T> list)
    {
        if(list.size() <= 1 || list == null)
        {
            return;
        }

        T value = list.remove(0);

        //calls the recursive function to reverse the list after removing
        //the first element revlist(list);

        revlist(list);

        list.add(value);
    }

    public static void main(String[] args) 
    {
        System.out.println("Reverse order of given list: ");
        
        List<String> list = new ArrayList<>();
            Collections.addAll(list, "platform", "learning", "best", "the");

            revlist(list);

            System.out.print(list);
    }
}
