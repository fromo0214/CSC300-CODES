import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

    public static void show()
        {
            Collection<String> collection = new ArrayList();
            // collection.add("a");
            // collection.add("b");
            // collection.add("c");
            
            //COLLECTIONS---ADDALL()
            Collections.addAll(collection, "a", "b", "c");
            //collection.size() ----> 3
            //collection.remove("a");
            //System.out.println(collection); ---> [b,c]

            // var containsA = collection.contains("a");
            // System.out.println(containsA); ---> false
            
            //list.add("a")
            //list.add("b")
            //list.add("c")
            //list(0, "I") ---> [I,a,b,c]
            //list.get(0) --> I

            //[a,b,c]
            //list.sel(0, "a+") ---> [a+,b,c]
            //list.remove(0) ---> [b,c,b,b]
            //list.indexOf("b") --> 0
            //list.indexOf("s") --> -1
            //lastIndexOf

            //[a,b,c,d]
            //list.subList(0,3) ---> 0 : inclusive, 1 : exclusive [a,b,c]


            for(var item: collection)
                System.out.println(item);
            //soul(collection)
        }
    
    
}
