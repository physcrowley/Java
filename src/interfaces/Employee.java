package interfaces;

import interfaces.Person;

public class Employee extends Person 
{
    Employee()
    {
        super(); // occupation is already WorkingHard
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

