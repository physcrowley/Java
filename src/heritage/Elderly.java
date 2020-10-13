package heritage;

import heritage.Person;

public class Elderly extends Person
{
    String retirementActivity;

    Elderly(String n, int a, String A)
    {
        super(n, a, "retired"); 
            // donner par défaut la valeur "retired" pour l'occupation
        this.retirementActivity = A;
    }

    public void retired()
    {
        System.out.println("I am retired and enjoying my " + this. retirementActivity);
    }
}
