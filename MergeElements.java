import java.util.*;
import java.util.Iterator;

//java program to merge 2 lists elementwise
public class MergeElements 
{
    public static void main(String[] args) {
        //Implementing lists to merge together
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //importing chars to 1st list
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("G");
        list1.add("H");

        //importing chars to 2nd list
        list2.add("B");
        list2.add("D");
        list2.add("F");

        //Implementing the merged list 
        List<String> MergedList = new ArrayList<String>();

        //prints lists elements
        System.out.println("List 1 contains: " + list1);
        System.out.println("List 2 contains: " + list2);

        //implements the iterator
        Iterator iterator = list1.iterator();

        while(iterator.hasNext())
        {
            //Prints the elements of list 1
            System.out.print(iterator.next()+ " ");
        }

    }
        
}
