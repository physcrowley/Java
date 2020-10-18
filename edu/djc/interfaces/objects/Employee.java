package edu.djc.interfaces.objects;

import edu.djc.interfaces.behaviours.*;

/** This is the prototype of the Person class - all default values */
public class Employee extends Person 
{
    public Employee()
    {
        super();
    }
    
    public Employee(String n, int a)
    {
        super(n, a);
    }
    
    public Employee(String n, int a, Working o)
    {
        super(n, a, o);
    }
}

