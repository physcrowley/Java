package edu.djc.interfaces.objects;

import edu.djc.interfaces.behaviours.*;

public class Retiree extends Person 
{
    public Retiree()
    {
        super();
        this.age = 65; // par défaut, l'age de la retraite
        this.occupation = new Retire();
    }
    
    public Retiree(String n, int a)
    {
        super(n, a);
        this.occupation = new Retire();
    }

    public Retiree(String n, int a, Working o)
    {
        super(n, a, o);
    }
    
}