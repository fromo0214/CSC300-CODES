//java program to find the slope between 4 points
public class Slope 
{
    public static void main(String[] args) 
    {
        float x1 = 4;
        float x2 = 2;

        float y1 = 2;
        float y2 = 5;

        System.out.println(findSlope(x1, y1, x2, y2));

    }

    static float findSlope(float x1, float y1, float x2, float y2)
    {
        return (y2-y1) / (x2-x1);
    }
}
