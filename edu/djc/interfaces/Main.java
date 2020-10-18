package edu.djc.interfaces;

import edu.djc.interfaces.behaviours.*;
import edu.djc.interfaces.objects.*;

public class Main {
    public static void main(final String[] args) 
    {
        Person[] persons = 
        {
            new Student("Sebastian", 17),
            new Employee("Janette", 32), 
            new Retiree("Roger", 72),
            new Teacher("David", 39)
        }; // polymorphism

        persons[1].setOccupation(new Retire());
        //System.out.println(persons[2].name); // tester le mot clé "protected"
            // si protected protège correctement, cette ligne devrait générer une erreur

        for (Person p : persons)
        {
            System.out.print(p.getName() + " : ");
            p.goToWork();
        }
        
        System.out.println(persons[0].getName());
        System.out.println(persons[3]);
        System.out.println(Person.getPeople());
    }
}
