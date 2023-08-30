public class Slope 
{
    static float slope(float x1, float y1, float x2, float y2)
    {
        return (y2-y1)/(x2-x1);
    }    

    public static void main(String[] args) 
    {
        float x1 =4, y1 = 4;
        float x2 = 2, y2 = 5;
        
        System.out.println("Slope is: " + slope(x1, y1, x2, y2));
    }
}
