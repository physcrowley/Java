package heritage;

import heritage.Person;

public class Student extends Person 
{
    double moyenne;

    Student(String n, int a, String o, double m)
    {
        super(n, a, o); 
            // utiliser le constructeur du niveau supérieur dans la hiérarchie
            // voir aussi : https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        this.moyenne = m;
    }

    public void study()
    {
        System.out.println("Can't work, need to study");
    }

}
