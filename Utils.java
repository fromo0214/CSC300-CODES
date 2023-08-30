public class Utils 
{
    public static <T extends Comparable> T max (T first, T second)
    {
        //? boolean variable 
        return (first.compareTo(second)<0)?second:first;
    }    
}
