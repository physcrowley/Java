package edu.djc.interfaces.objets;

import edu.djc.interfaces.behaviours.*;

public class Retiree extends Person 
{
    Retiree()
    {
        super();
        this.age = 65; // par défaut, l'age de la retraite
        this.occupation = new Retiring();
    }
    
    Retiree(String n, int a)
    {
        super(n, a);
        this.occupation = new Retiring();
    }

    Retiree(String n, int a, Working o)
    {
        super(n, a, o);
    }
    
}