//java program that prints the strings that are even in length
public class EvenLengthString 
{
    public static void main(String[] args) 
    {
        String str = "I am a computer Scientist";
        
        printWord(str);
       
    }
    
    public static void printWords(String s)
    {
        for(String word: s.split(" "))
        {
            if(word.length() % 2 == 0)
            {
                System.out.println(word);
            }
        }
    }

    // public static void printWord(String word){
    //     for(String input: word.split(" ")){
    //         if(input.length()% 2 ==0){
    //             System.out.println(input);
    //         }
    //     }

    // }
}
