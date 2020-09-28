package encapsulation;

public class UnObjet 
{
    // champ privé
    private String name = "Un objet";


    // méthodes publiques pour obtenir et modifier le champ
    public String getName()
    {
        return this.name;
    }

    public void setName(final String newName)
    {
        this.name = newName;
    }
}
