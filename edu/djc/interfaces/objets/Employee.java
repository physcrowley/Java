package edu.djc.interfaces.objets;

import edu.djc.interfaces.behaviours.*;
import edu.djc.interfaces.objets.Person;

/** This is the prototype of the Person class - all default values */
public class Employee extends Person 
{
    Employee()
    {
        super();
    }
    
    Employee(String n, int a)
    {
        super(n, a);
    }
    
    Employee(String n, int a, Working o)
    {
        super(n, a, o);
    }
}

