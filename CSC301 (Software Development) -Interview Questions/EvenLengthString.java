public class EvenLengthString 
{
    public static void printWords(String s)
    {
        //Splits str into all possible tokens
        for(String word : s.split(" "))
        {
            //if length is even
            if(word.length() % 2 == 0)
            {
                //Print the word
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) 
    {
        String s = "I am a computer Scientist";
        printWords(s);
    }    
}
