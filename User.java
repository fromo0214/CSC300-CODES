public class User implements Comparable <User>
{
    private int points;

    public User(int points)
    {
        this.points = points;
    }

    @Override
    public int compareTo(User o) 
    {
        return points-o.points;

        // if(points < o.points)
        // {
        // return -1;
        // }
        // if (points == 0)
        // {
        // return 0;
        // }

        // return 1;
    }
    
    public String toString()
    {
        return "Points: " + points ;
    }


}
//if current user object < other user object, return negative value, if the same return 0, if greater than return positive value