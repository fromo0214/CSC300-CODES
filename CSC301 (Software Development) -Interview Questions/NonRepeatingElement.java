//Fernando Romo CSC 300-02
public class NonRepeatingElement 
{
    public static void main(String[] args) 
    {
      
        int arr[] = {10, 8, 10, 6, 8, 4, 8};

        boolean status;
       
        //for loop to iterate through the size of the array
        for (int i = 0; i < arr.length; i++) 
        {
            status = true;

           //for loop that iterates through the size of array, for each value of i
            for (int j = 0; j < arr.length; j++) 
            {
                //if i and j are the same continue to iterate
                if (i == j)
                {
                    continue;
                }
              
                //if both arr[i] & arr[j] are the same set status to false and break
                if (arr[i] == arr[j]) 
                {
                    status = false;
                    break;
                }
            }
            //if the status is true, print out array and there should be no repeating elements
            if (status == true) 
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}