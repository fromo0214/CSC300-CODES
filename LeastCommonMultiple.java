//Java program to compute the least common multiple between 72 and 120.
public class LeastCommonMultiple 
{
    public static void main(String[] args) 
    {
        int gcd = 1;
        int a = 72;
        int b = 120;

        for(int i = 1; i <= a && i <= b; ++i)
        {   
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
            

        }
        int lcm = (a*b/gcd); 
        System.out.println(lcm);
    }
    
}
