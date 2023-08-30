//Java implementation of recursive binary search
public class BinarySearchArray 
{

    int binarySearch(int array[], int z, int r, int x)
    {
        if(r >= z)
        {
            int mid = z + (r - z) / 2;

            //If the element is present at the middle itself
            if(array[mid] ==x)
            {
                return mid;
            }
            //If the element is smaller than mid, then it can only be 
            //present in the left subarray
            if(array[mid] >x)
            {
                return binarySearch(array, z, mid - 1, x);
            }
            return binarySearch(array, mid + 1, r, x);
        }
    //Reach here when an element is not present in array
    return -1;
    }
    

public static void main(String[] args) 
{
    Main ob = new Main();

    int arr[] = {2, 3, 4, 10, 40};
    int n = arr.length;
    int x = 10;

    int result = ob.binarySearch(arr, 0, n - 1, x);

    if(result == -1)
    {
        System.out.println("Element is not present");
    }else{
        System.out.println("Element found at index: " + result);
    }
}


}
