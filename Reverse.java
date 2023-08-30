public class Reverse
{

public static void main(String[] args)
{  

    char[] s = {'H', 'e','l', 'l', 'o'};
    String reverse = "Object Oriented";

    printReverse(reverse);
    
    reverseString(s);

}
//Reverse String 2 pointer method 
public static void reverseString(char[] s){
    for(int i = 0, j = s.length - 1; i < s.length/2; i++, j--){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;

            System.out.println(s);
    }

}


public static void printReverse(String input)
{
    System.out.println("");
    for(int i = input.length() - 1; i > -1; i--)
    {
        System.out.print(input.charAt(i));
    }
    
}

}