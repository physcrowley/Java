package heritage;

import heritage.Person;

public class Student extends Person 
{
    double moyenne;

    Student(String n, int a, String o, double m)
    {
        super(n, a, o); 
            // super > utiliser le constructeur du niveau supérieur dans la hiérarchie
            // dans ce cas-ci, on utilise le constructeur de Person pour initialiser
            // les valeurs de name, age et occupation.
            // voir aussi : https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        this.moyenne = m; // et on intitialise spécifiquement pour Student la moyenne
    }

    public void study()
    {
        System.out.println("Can't work, need to study");
    }

}
