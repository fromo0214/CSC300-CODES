public class CharFrequencies 
{
    public static void main(String[] args) {
        String str = "saharconceptincomputerscience";
        int strLength = str.length();

    

        for(int i = 0; i < strLength; i++)
        {
            if(str.contains("a"))
            {
                aCount++;
            }
        }
        System.out.print(aCount);
        
    }    
}
