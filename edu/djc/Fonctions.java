package edu.djc;
// On veut cacher le mécanisme d'exécution derrière un seul nom

/**
 * Exemples de fonctions et de méthodes sur des objets
 *
 */

public class Fonctions
{
    /**
     * Script de notre programme
     * <p>
     * main est une fonction
     * @param args 
     */
    public static void main(String[] args)
    {
        System.out.println("bonjour"); // println() est une méthode sur l'objet console (System.out)

        pasDArgument();
        unArgument("coucou");
        int result = multiplierPar3(9);
        System.out.println(result);
        int result2 = multiplierDeuxValeurs(6, 7);
        System.out.println(result2);
    }

    static void pasDArgument()
    {
        System.out.println("Je suis une fonction sans arguments ni valeur de retour");
    }

    static void unArgument(String msg)
    {
        System.out.println("J'imprime le message passé en argument : " + msg);
    }

    static int multiplierPar3(int num)
    {
        return num * 3;
    }

    static int multiplierDeuxValeurs(int a, int b)
    {
        return a*b;
    }
}