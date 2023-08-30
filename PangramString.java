//Java program that checks if a sentence is a pangram (a sentence with every letter in the alphabet)
public class PangramString 
{
    static int size = 26;
    public static void main(String[] args) 
    {
        String str = "a quick brown fox jumps over the lazy dog";
        

        int n = str.length();

        if(allLetter(str, n))
        {
            System.out.println("Yes");

        }else
        System.out.println("No");
        
    }
    static boolean isLetter(char ch)
    {
        if(!Character.isLetter(ch))
        {
            return false;
        }
        else
        return true;
    }

    static boolean allLetter(String str, int n)
    {
        str = str.toLowerCase();

        boolean[] present = new boolean[size];

        for(int i = 0; i < n; i++)
        {
            if(isLetter(str.charAt(i)))
            {
                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }

        }
        for(int i = 0; i < size; i++)
        {
            if(!present[i])
            {
                return false;
            }
        }
        return true;
    }

}
