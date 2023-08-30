//java program that replaces char in string
public class ReplaceCharAtIndex 
{
    public static void main(String[] args) 
    {
        String str = "JavaProgramming";
        char ch = 'A';
        int index = 4;
        str = str.substring(0, index)+ //JavaA 
        ch + str.substring(index + 1);

        System.out.println(str);

    
    }   
    
}
