import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo
{
public static void main(String[] args) 
{
    Collection<String> collection = new ArrayList<String>();

    collection.add("a");
    collection.add("b");
    collection.add("c");

    for(var items: collection)
    {
        System.out.println(items);
    }

    System.out.print(collection);
}
}