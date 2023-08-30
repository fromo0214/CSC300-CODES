public class InsertString
{
    public static void main(String[] args) 
    {
        String str = "JavaCourse";
        String str2 = "Programming";
        int index = 3;

        System.out.print(addString(str, str2, index));
    }


    public static String addString(String str1, String str2, int index)
    {
        String newString = new String();
        
        for(int i = 0; i < str1.length(); i++)
        {
            newString += str1.charAt(i);
            
            if(i == index)
            {
                newString += str2;
            }
        }
        
        return newString;
    }

}