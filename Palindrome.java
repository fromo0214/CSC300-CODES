public class Palindrome
{
    public static void main(String[] args)
    {
        String palindrome = "madam";
        String nonPalindrome = "test";

        palindrome = palindrome.toLowerCase();
        nonPalindrome = nonPalindrome.toLowerCase();

        boolean a = checkPalindrome(palindrome);
        boolean b = checkPalindrome(nonPalindrome);
       
        System.out.println(a);
        System.out.println(b);
    }

    public static boolean checkPalindrome(String test)
    {
        boolean status = false;
        String str = " ";

        for(int i = test.length() - 1; i >= 0; i--)
        {
            str = str + test.charAt(i);
        }

        if(test.equals(str))
        {
            status = true;
        }
        return status;


    }


}