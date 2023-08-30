//Java program that reverses an integer
public class ReverseNumber
{
    public static void main(String[] args) 
    {
        int num = 1234;
       reverseNum(num);
    }


    public static void reverseNum(int number)
    { 
        int reversed = 0;
        while(number != 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }
}