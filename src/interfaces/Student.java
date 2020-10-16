package interfaces;

import interfaces.Person;

public class Student extends Person 
{
    Student()
    {
        this.occupation = new Studying();
    }
    
    Student(String n, int a)
    {
        super(n, a);
        this.occupation = new Studying();
    }
    
    Student(String n, int a, Working o)
    {
        super(n, a, o);
    }
}