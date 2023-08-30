import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
public class CollectionDemo2 
{
    public static void main(String[] args) 
    {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
        collection.remove("a"); //removes a and leaves [b,c]

        System.out.println(collection);

        System.out.println(collection.size()); //prints 2 since there are 2 elements in the collection

        var containsA = collection.contains("a");
        System.out.println(containsA); //prints false

        collection.clear();
        System.out.println(collection.isEmpty());//true

        System.out.println(collection);
    }    
}
