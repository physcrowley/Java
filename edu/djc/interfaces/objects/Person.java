package edu.djc.interfaces.objects;

import edu.djc.interfaces.behaviours.*;

public abstract class Person 
{
    // (par défaut > PACKAGE-PRIVATE)
    // champs et constructeurs accessibles seulement à l'intérieur du package
    // notamment par les classes filles

    /////////////////// Champs /////////////////////

    String name = "";
    int age = 0;
    Working occupation = new Work();

    private static int people = 0; // variable de class > les instances n'auront pas ce champs


    /////////////////// Constructeurs /////////////////////

    /** Constructeur par défaut */
    Person()
    {
        people++; // compte le nombre d'instances de Person
    }
    
    
    /** Constructeur avec avec champs name et age.
     * Pour chaque enfant instanciable de Person, l'occupation est définie par défaut.
     * @param n le nom de la Person
     * @param a l'age de la Person
     */
    Person(String n, int a)
    {
        people++; // compte le nombre d'instances de Person
        this.name = n;
        this.age = a;
    }


    /** Constructeur avec tous les paramètres
     * @param n le nom de la Person
     * @param a l'age de la Person
     * @param o l'occupation de la Person
     */
    Person(String n, int a, Working o)
    {
        people++; // compte le nombre d'instances de Person
        this.name = n;
        this.age = a;
        this.occupation = o;
    }


    // PUBLIC
    // accessible par tout le monde dans tous les packages
    // notamment par la classe du programme qui inclut la
    // méthode {@code main}


    /** Exécute la méthode {@code work()} définit par l'implémentation de l'interface
     *  {@link Working} associée avec l'instance de {@link Person}.
     * <p>
     * C'est l'application du Strategy Pattern.
     */
    public void goToWork()
    {
        occupation.work();
    }


    /////////////////// Mutateurs /////////////////////
    public void setName(String n)
    {
        this.name = n;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public void setOccupation(Working o)
    {
        this.occupation = o;
    }

    
    /////////////////// Accesseurs /////////////////////
    public static int getPeople()
    {
        return people;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public Working getOccupation()
    {
        return this.occupation;
    }

    /**
     * For easier, cleaner printing of Person object data
     */
    @Override
    public String toString() 
    {
        String oc = String.valueOf(this.occupation.getClass()); // "class pack.age.s.to.ClassName"
        oc = oc.substring(oc.lastIndexOf(".") + 1); // get everything after the last dot

        return "Name: " + this.name + ", Age: " + this.age + ", Occupation: " + oc;
    }
}
