package edu.djc.encapsulation;

/**
 * Exemple pour démontrer l'encapsulation de base au moyen
 * d'accesseurs et de mutateurs publics pour un champ privé.
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class UnObjet 
{
    // champ privé
    private String name = "Un objet par défaut";


    // méthodes publiques pour obtenir et modifier le champ
    
    /** Accesseur publique pour le champ name */
    public String getName()
    {
        return this.name;
    }

    /** Mutateur public pour le champ name 
     * @param newName du texte 
     */
    public void setName(final String newName)
    {
        this.name = newName;
    }
}
