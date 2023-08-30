import java.util.Random;

public class RandomString 
{
    public static void main(String[] args)
    {
    //Create a string of all characters
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuilder sb = new StringBuilder();

    Random rand = new Random();

    //specify length of random string
    int length = 7;

    for(int i = 0; i < length; i++)
    {
        //generate a random index number
        int index = rand.nextInt(alphabet.length());

        //get character specefied by index
        //from the string
        char randomChar = alphabet.charAt(index);

        //append the character to string builder
        sb.append(randomChar);
    }
    String randomString = sb.toString(); //represent any object as string
    System.out.println("Random string is: " + randomString);
}
}
