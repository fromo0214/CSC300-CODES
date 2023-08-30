import java.util.*;
//Check if a year is a leap year
//A year is a leap year if it is evenly divisible by 4
//Exceptions occur when the year is also evenly divisibly by 100
//In whcih case the year would not be a leap year unless it is evenly divisible by 400

public class LeapYear 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    int year;
    boolean result; //set to true if year is a leap year, false otherwise

    System.out.println("Enter a year: ");
    year = sc.nextInt();

    //Checks if year is not divisible by 4
    if(year %4 != 0)
    result = false;

    else
    { //In this caes a year is a leap year unless it is NOT, divisibly by 400, but it is divisible by 100
        if(year%100 == 0 && year%400 != 0)
        {
            result = false;
        }else {
            result = true;
        }

    }
    
    //Output results
    if(result)
    {
        System.out.println("The year " + year + " was a leap year.");
    }else
    System.out.println("The year " + year + " was not a leap year.");

}

}
