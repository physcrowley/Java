package interfaces;

public class Teacher extends Person 
{
    Teacher()
    {
        this.occupation = new Teaching();
    }
    
    Teacher(String n, int a)
    {
        super(n, a);
        this.occupation = new Teaching();
    }

    Teacher(String n, int a, Working o)
    {
        super(n, a, o);
    }
}