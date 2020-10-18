package edu.djc.interfaces.objects;

import edu.djc.interfaces.behaviours.*;

public class Student extends Person 
{
    public Student()
    {
        super();
        this.occupation = new Study();
    }
    
    public Student(String n, int a)
    {   
        super(n, a);
        this.occupation = new Study();
    }
    
    public Student(String n, int a, Working o)
    { 
        super(n, a, o);
    }
}