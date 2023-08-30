public class InsertString 
{
    public static String insertString(String originalString, String stringInsert, int index)
    {
        //Create a new string
        String newString = new String();

        for(int i = 0; i < originalString.length(); i++)
        {
            //Insert the original string character
            //into the new string
            newString += originalString.charAt(i);
            if(i == index)
            {
                //Insert the string to be inserted
                //into the new sttring
                newString += stringInsert;
            }
        }
        //return the modified String
        return newString;
    }
    
    public static void main(String[] args) 
    {
        //Get the Strings
        String originalString = "JavaCourse";
        String stringInsert = "Programming";
        int index = 3;
        
        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringInsert);
        System.out.println("String to be inserted at index: " + index);

        //Insert the string
        System.out.println("Modified String: " + insertString(originalString, stringInsert, index));

        
    }
}
