//Fernando Romo CSC 300-02
import java.lang.Math;

public class RandUniqueNumbers 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[20];
        
        for(int i = 0; i < 20; i++)
        {
            //Storing random numbers in range [0,19]
            arr[i] = (int)(Math.random()*20);

            for(int j = 0; j < i; j++)
            {
                //if arr[i] and arr[j] have the same value, remove and run again
                if(arr[i] == arr[j])
                {
                    i--;
                    break;
                }
            }
        }
        //Print array
        for(int i = 0; i < 20; i++)
        {
            System.out.print(arr[i]+ ",");
        }
    }

}
