package interfaces;

public abstract class Person 
{
    protected String name = "";
    protected int age = 0;
    protected Working occupation = new WorkingHard();

    static protected int people = 0; // variable de class (pas d'instance)


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

    /** Exécute la méthode {@code work()} définit par l'implémentation de l'interface
     *  {@link Working} associée avec l'instance de {@link Person}.
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
    public int getPeople()
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

    public String getOccupation()
    {
        return String.valueOf(this.occupation.getClass());
    }
}
