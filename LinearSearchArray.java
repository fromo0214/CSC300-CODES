import java.util.Scanner;
//Java code for lineraly search x in array[]
//Looks for location if not then return -1
public class LinearSearchArray 
{
    static int search(int[] array, int n, int x)
    {
        for(int i = 0; i <n; i++)
        {
        //Return the index of the element if the element is found
            if(array[i] == x)
            {
                return i;
            }
   
        }
        //return -1 if the element is not found
        return -1;
    }
    public static void main(String[] args) 
    {
        int [] arr = {3, 4 ,1, 7, 5};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter number to find in array: ");
        //Target to find in the array
        int x = sc.nextInt();
        
        int index = search(arr, n, x);
        
        if(index == -1)
        {
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element found at position " + index);
        }
    }

    static int searchArr(int[] array, int n, int x){
        for(int i =0; i < n; i++){
            if(array[i]== x){
                return i;
            }
        }
        return -1;

    }
}
