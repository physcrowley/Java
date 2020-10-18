package edu.djc.interfaces.objets;

import edu.djc.interfaces.behaviours.*;

public class Student extends Person 
{
    Student()
    {
        this.occupation = new Study();
    }
    
    Student(String n, int a)
    {
        super(n, a);
        this.occupation = new Study();
    }
    
    Student(String n, int a, Working o)
    {
        super(n, a, o);
    }
}