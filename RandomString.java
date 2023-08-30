//java program that prints random chars into strings
import java.util.Random;

public class RandomString 
{
    public static void main(String[] args) 
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        //Length of random string
        int length = 8;
        Random rand = new Random();
        
        // i = 0 and goes down the length which is 8
        for(int i =0; i < length; i++)
        {
            //setting index to a random integer in the alphabet length
            int index = rand.nextInt(alphabet.length());
            //Setting the random char in the alphabet using index as the random pick
            char randomChar = alphabet.charAt(index);

            //String builder appends adds the chars together
            sb.append(randomChar);
        }
        
        String randomString = sb.toString();
        System.out.print(randomString);
            
    }    
}
