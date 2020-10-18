package edu.djc.interfaces.objets;

import edu.djc.interfaces.behaviours.*;

public class Teacher extends Person 
{
    Teacher()
    {
        this.occupation = new Teach();
    }
    
    Teacher(String n, int a)
    {
        super(n, a);
        this.occupation = new Teach();
    }

    Teacher(String n, int a, Working o)
    {
        super(n, a, o);
    }
}