public class ReverseNumber 
{
public static void main(String[] args) 
{
    int num = 1234, reversed = 0;
    System.out.println("Original number: " + num);
    
    //run loop until num becomes 0
    while(num != 0)
    {
        // get last digit from num
        int digit = num % 10;
        reversed = reversed * 10 + digit;

        num /= 10;
    }
    System.out.print("Reversed Number: " + reversed);
}    
}
