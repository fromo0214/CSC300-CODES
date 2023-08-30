public class Armstrong 
{
    public static void main(String[] args) 
    {
        int n1 = 50;
        int n2 = 500;

        checkArmstrong(n1, n2);
        System.out.println();
        
    }
    //Function to print Armstrong numbers between two integers

    static void checkArmstrong(int l, int h)
    {
        for(int j = l; j <= h; ++j)
        {
            // calculating number of digits
            int y = j;
            int N = 0;
            while(y != 0)
            {
                y /= 10;
                ++N; 
            }
            //Calculating the sum of nth, power of all the digits
            int sum_power = 0;
            y = j;
            while (y != 0)
            {
                int d = y % 10;
                sum_power += Math.pow(d, N);
                y /= 10;
            }
            //checking if the current number i is equal to the sum of nth power of all the digits
            if(sum_power == j)
            {
                System.out.print(j + " ");
            }
        }
    }
}
