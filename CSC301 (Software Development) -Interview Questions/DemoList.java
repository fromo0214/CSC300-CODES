import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoList 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");

        System.out.println(list); //[!, a, b, c]

        Collections.addAll(list, "a", "b" ,"c");
        System.out.println(list.get(0)); //prints out !

        list.set(0, "a+"); //sets index of 0 and replaces it with a+

        System.out.println(list);

        list.remove(0);

        System.out.println(list); //removes a+

        System.out.println(list.indexOf("b")); //1
        System.out.println(list.indexOf("s")); //-1
        System.out.println(list.lastIndexOf("b"));

        System.out.println(list.subList(0, 2)); //[a,b]
    }    
}
