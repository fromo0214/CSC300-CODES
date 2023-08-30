public class Distance3D 
{
    static void distance(float x1, float y1,
    float z1, float x2,
    float y2, float z2)
    {
        double d = Math.pow(Math.pow(x2 - x1, 2) +
        Math.pow(y2 - y1, 2) +
        Math.pow(z2 - z1, 2) , 0.5);
        
        System.out.println("Distance is "+ d);
        return;
    } 
    
    public static void main(String[] args) 
    {
        float x1 = 2;
        float y1 = -5;
        float z1 = 7;
        float x2 = 3;
        float y2 = 4;
        float z2 = 5; 
        
        //function call for distance
        distance(x1, y1, z1, x2, y2, z2);
    }
}
