public class NeonNumber 
{
    public static boolean checkNeon(int n)
    {
        int square = n * n;

        int sum = 0;

        while(square > 0)
        {
            int r = square % 10;

            sum += r;

            square = square / 10;
        }
    }

}
