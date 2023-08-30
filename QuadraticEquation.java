import java.util.Scanner;

public class QuadraticEquation 
{ 
//CSC401 Algorithms Class Sahar Hooshmand

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input for a: ");
        double a = sc.nextDouble();
        
        System.out.println("Enter input for b: ");
        double b = sc.nextDouble();
        
        System.out.println("Enter input for c: ");
        double c = sc.nextDouble();
    
        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant < 0)
        {
            double real = -b/(2*a);
            double imaginary = Math.sqrt(Math.abs(discriminant))/(2*a);
            System.out.println("First root = " + real + " + " + imaginary +"i.");
            System.out.println("Second root = "+real+" - "+ imaginary +"i.");

        }else{
            double r1 = (-b + Math.sqrt(discriminant))/(2*a);
            double r2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The roots to your quadratic are " + r1 + " and " + r2 + ".");

        }

    
    }

}
