import java.util.*;

public class MergeElementWise 
{
    public static void main(String[] args) 
    {
        List<String> list1 = new ArrayList<String>();
        
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("G");
        list1.add("H");

        List<String> list2 = new ArrayList<String>();

        list2.add("B");
        list2.add("D");
        list2.add("F");

        System.out.println("List 1 contains; " +list1);
        Iterator iterator = list1.iterator();

        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");

        System.out.println("List 2 contains; " +list2);

        iterator = list2.iterator();

        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

        int i = 0;
        int j = 0;

        List<String> merged_list = new ArrayList<String>();

       //iterating over both the lists until the elements 
       //of shorter List are exhausted   
       
       while(i < list1.size() && j < list2.size())
       {
            //step1: adding list 1 element
            merged_list.add(list1.get(i));

            //step2: adding list 2 element
            merged_list.add(list2.get(j));

            i++;
            j++;
       }

       while(i < list1.size())
       {
        merged_list.add(list1.get(i));

        i++;
       }

       while(i < list2.size())
       {
        merged_list.add(list2.get(j));

        j++;
       }

       System.out.println(" ");

       System.out.println("Merged list contains: ");

       iterator = merged_list.iterator();

       //Iterating over merged list using hasNext() method which
       //holds true till there is single element remaining

       while(iterator.hasNext())
       {
        System.out.print(iterator.next()+ " ");
       }
    }
}
