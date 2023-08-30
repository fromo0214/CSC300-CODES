//Common Interview Question
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");

//% = modulus and the zeroes in the code below mean that there is no remainder so 0 remains meaning they
// are divisible.

        int number = sc.nextInt();
        //If number is divisible by 5 and 3
        if(number%5 == 0 && number%3 == 0)
        System.out.println("FizzBuzz");
        
        //If number is divisible by 5
        else if (number%5 == 0)
        System.out.println("Fizz");
        
        //If number is divisible by 3
        else if(number%3 == 0)
        System.out.print("Buzz");
        else
        System.out.println(number);

        System.out.println(FizzBuzzList(number));        
    }
    
    //https://leetcode.com/problems/fizz-buzz/submissions/
    //How to answer this problem using lists
    public static List<String> FizzBuzzList(int n){
        List<String> list = new ArrayList<>();
        for(int i =1; i <=n; i++){
            //If number is divisible by 5 and 3
        if(i%5 == 0 && i%3 == 0)
        list.add("FizzBuzz");
        
        //If number is divisible by 5
        else if (i%5 == 0)
        list.add("Fizz");
        
        //If number is divisible by 3
        else if(i%3 == 0)
        list.add("Buzz");
        else
        list.add(String.valueOf(i));
        }

        return list;
    }

    // public static List<String> FizzBuzzerList(int n){
    //     List<String> list1 = new ArrayList<>();
    //     for(int i = 1; i <= n; i++){
    //         if(i % 5 == 0 && i % 3== 0){
    //             list1.add("FizzBuzz");
    //         }
    //         else if(i%5==0){
    //             list1.add("Fizz");
    //         }
    //         else if(i%3==0){
    //             list1.add("Buzz");
    //         }
    //         else
    //         {
    //             list1.add(String.valueOf(i));
    //         }
    //     }


    //     return list1;
    // }

}
