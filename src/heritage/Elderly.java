package heritage;

import heritage.Person;

public class Elderly extends Person
{
    String retirementActivity;

    Elderly(String n, int a, String o, String A)
    {
        super(n, a, o);
        this.occupation = "retired";
        this.retirementActivity = A;
    }

    public void retired()
    {
        System.out.println("I am retired and enjoying my " + this. retirementActivity);
    }
}
