public class Employee 
{

    private int baseSalary;            
    private int hourlyRate;
    public static int numberOfEmployees;

    //Constructor
    public Employee(int baseSalary)
    {
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate)
    {
        
    } 

    //Set the wage 
    public void setBaseSalary(int baseSalary)
    {
        if(baseSalary <= 0){
        throw new IllegalArgumentException("Salary cannot be less than 0");
        }
        this.baseSalary = baseSalary;
    }
    
    
    //Return the value of the wage
    public int getBaseSalary()
    {
        return baseSalary;
    }


    public void setHoourlyRate(int hourlyRate)
    {
        if(hourlyRate<0)
        {
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        }
        this.hourlyRate= hourlyRate;
    }

    public String getHourlyRate()
    {
   
    }


    //toString method
    public String toString()
    {
        return "Position: " + position + "\n" + "Wage: " + wage;
    }

}


