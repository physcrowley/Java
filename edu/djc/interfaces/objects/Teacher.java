package edu.djc.interfaces.objects;

import edu.djc.interfaces.behaviours.*;

public class Teacher extends Person 
{
    public Teacher()
    {
        super();
        this.occupation = new Teach();
    }
    
    public Teacher(String n, int a)
    {
        super(n, a);
        this.occupation = new Teach();
    }

    public Teacher(String n, int a, Working o)
    {
        super(n, a, o);
    }
}