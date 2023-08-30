import java.util.Random;
import java.util.Scanner;
public class RandomNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Input number of dice: ");

            int numOfDice = sc.nextInt();

            Random rand = new Random();

            int randomNumber = 0;
            int total = 0;

            for(int i = 0; i < numOfDice; i++)
            {
                randomNumber = rand.nextInt(6) + 1;
                total = total + randomNumber;
                System.out.println(randomNumber);


            }
            System.out.println("");
            System.out.println("Total : " + total);
        }


    
    
    public static void getRandNumber()
    {
        Random rand = new Random();
        for(int i =0; i < 1; i++)
        {
            int randomNum1 = rand.nextInt(6);
            int randNum2 = rand.nextInt(6);
            System.out.print(randomNum1 + "+" + randNum2 + "=" + (randomNum1+randNum2));
        }

    }

}
