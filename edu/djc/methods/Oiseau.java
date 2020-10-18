package edu.djc.methods;

/**
 * Un objet qui fait "pi pi pi!!!" quand il parle
 */
public class Oiseau 
{
    // champs
    String couleur;
    int age;

    // méthodes
    public void parler()
    {
        System.out.println("pi pi pi!!!");
    }

    public String toString()
    {
        return String.format("Je suis un oiseau %s de %d ans.", this.couleur, this.age);
    }
}
