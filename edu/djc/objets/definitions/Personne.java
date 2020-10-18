package edu.djc.objets.definitions;

/**
 * Un exemple pour montrer les champs et méthodes d'un objet
 */
public class Personne
{
    // attributs de l'objet (ses "champs")
    // Personne.age, Personne.nom
    private int age = 0;
    private String nom;

    // comportements de l'objet (ses "méthodes")
    // Personne.grandir(), Personne.nommer(String n)
    /**
     * Faire progresser l'age de la personne d'une année
     */
    public void grandir()
    {
        this.age++;
    }

    /**
     * Donner un nom à la personne
     * @param n le String fourni pour le nom
     */
    public void nommer(final String n)
    {
        this.nom = n;
    }

    public int getAge() 
    {
        return this.age;
    }

    public String getNom() 
    {
        return this.nom;
    }

    public String toString()
    {
        return String.format("Je m'appelle %s et j'ai %d ans.", this.nom, this.age);
    }
}