import java.util.*;
//Java program to convert decimal numbers to binary numbers
public class DecimalToBinary
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number to convert into binary: ");
        int user_input = sc.nextInt();

        System.out.println("Decimal: " + user_input);

        System.out.print("Binary: ");
        convertToBinary(user_input);


    }


    public static void convertToBinary(int input)
    {
        //Array to store binary number
        int[] binaryNum = new int[1000];

        //Counter for binary array
        int i = 0;

        while(input > 0)
        {
            //storing remainder in binary array
            binaryNum[i] = input % 2;
            input = input / 2;
            i++;
        }

        //printing binary array in reverse order
        for(int j = i - 1; j>= 0; j--)
        {
            System.out.print(binaryNum[j]);
        }
    }



}