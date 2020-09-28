package encapsulation;

/**
 * Example to demonstrate basic encapsulation using
 * public getters and setters for a private field.
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class UnObjet 
{
    // champ privé
    private String name = "Un objet";


    // méthodes publiques pour obtenir et modifier le champ
    /** Public getter for the name field */
    public String getName()
    {
        return this.name;
    }

    /** Public setter for the name field */
    public void setName(final String newName)
    {
        this.name = newName;
    }
}
