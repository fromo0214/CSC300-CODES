//Write a program to check if a number is divisible by 3
import java.util.*;

public class DivisibleByThree 
{
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to check if divisible by 3.");
        String str = sc.nextLine();
        
        System.out.println("This number is "+ check(str));
        
                
    }

    static boolean check(String str)
    {
        int n = str.length();
        int digitSum = 0;
        
        for(int i = 0; i < n; i++)
        {
            digitSum += (str.charAt(i)-'0');
        }

        return (digitSum % 3 == 0);
    }
}
