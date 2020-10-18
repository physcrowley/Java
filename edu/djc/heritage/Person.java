package edu.djc.heritage;

public abstract class Person
{
    // champs
    String name;
    int age;
    String occupation;

    // constructeurs
    Person()
    {
        this.name = "";
        this.age = 0;
        this.occupation = "";
    }

    Person(String n, int a, String o)
    // surcharge de méthode > même nom avec 
    //      * différents paramètres ou 
    //      * comportements de retour
    {
        this.name = n;
        this.age = a;
        this.occupation = o;
    }

    // méthodes
    public void growUp()
    {
        this.age ++;
    }

    public void work()
    {
        System.out.println("I am doing my " + this.occupation + " work.");
    }

}