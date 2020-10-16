package interfaces;

import java.util.HashMap;

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

        persons[3].occupation = new Retiring();

        for (Person p : persons)
        {
            System.out.print(p.name + " : ");
            p.goToWork();
        }
        
        System.out.println(persons[0].getName());

        
    }
    
}
