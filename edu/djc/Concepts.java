package edu.djc;
// les commentaires en Java sont désignés par -> //

// Pour compiler ce fichier via le console (dans Code, cliquer Ctrl + Shift + ` pour ouvrir le console) :
//    javac Concepts.java
//    s'il n'y a aucune erreur de compilation, rien ne s'affiche
// Maintenant, pour exécuter la classe via le console :
//    java Concepts


import java.util.Scanner; // importer la définition d'un Scanner


// ce qui suit s'appelle de la documentation -> /** ... */
// on inclut un commentaire de ce type devant chaque class et définition de fonction/méthode

/**
 * Un programme simple pour revisiter les concepts de base en
 * programmation
 * <p>
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class Concepts
{
    /**
     * Main est le script principal du programme. Tout programme Java doit
     * inclure la définition de cette fonction, commençant exactement comme écrit 
     * à la prochaine ligne de code.
     *
     * @param args paramètres optionnels passés à la ligne de commande (s.o. pour le moment)
     */
    public static void main(final String[] args)
    {
        final Scanner input = new Scanner(System.in);
        
        // on peut créer des commentaires multi-lignes avec -> /* ... */
        // ATTENTION - ne pas créer accidentellement de la documentation (/**... */)
        /*
        VARIABLES
        Il faut spécifier le type et le nom. On peut également assigner
        une valeur lors de la déclaration, ce qui s'appelle "l'initialisation". 
        Les trois types les plus utilisés sont les suivants :
        */
        int num = 0; // valeur entière --> USAGE : compter
        String texte = "David"; // chaîne de caractères --> USAGE : générale
        double valeur = 2.98; // valeur décimale --> USAGE : calculer

        System.out.println(num + "\n" + texte + "\n" + valeur); // sortie au console
        
        /*
        OPÉRATEURS
        Mathématiques : + - / * , class Math
        Comparaison : > < >= <= == !=
        Logique : && (et), || (ou), ! (not)
        */
        System.out.println(3 == 1); // false
        System.out.println(3 != 1); // true
        System.out.println(!(3 == 1)); // true
        System.out.println(Math.random() * 10);

        /*
        CONDITIONS
        if, else if, else --> USAGE : générale
        switch-case --> USAGE : comparer avec une liste de choix fixe
        */

        /* STRUCTURE if / else if / else
        <mot-clé> (<condition entre parenthèses>)
        {
            <déclarations>;
        }
        */
        int A = 1;
        int B = 3;
        if (A == B)
        {
            System.out.println("A est égale à B");
        } 
        else if (A < B)
        {
            System.out.println("A est moins grand que B");
        } 
        else 
        {
            System.out.println("A est plus grand que B");
        }

        /* STRUCTURE switch-case
        switch (<variable>)
        {
            case <valeur1> : <déclarations>;
            case <valeur2> : <déclarations>;
            default : <déclarations>;
        }

        */

        String couleur = "vert";
        switch (couleur)
        {
            case "rouge": 
                System.out.println("la couleur est rouge"); 
                break;
            case "vert" : 
                System.out.println("la couleur est vert");
                break;
            case "bleu": 
            case "mauve":
                System.out.println("une couleur haute fréquence");
                break;
            default: 
                System.out.println("ta couleur n'est pas dans la liste");
        }
        // voir aussi https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        /*
        BOUCLES
        for --> USAGE : générale quand on connaît la quantité de répétitions
        "for each" --> USAGE : pour lire les structures de données comme les tableaux et les listes
        while --> USAGE : répétition générale (fin inconnue)
        
        */

        // FOR
        // Structure :
        // for (int i = <début>; i <condition de fin>; <opération pour changer i>) {}
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
        /* Sortie
        0
        1
        2
        3
        4
        */


        // FOR EACH
        int[] nums = {1, 1, 2, 3, 5, 8, 13, 21}; // fibonacci
        for (int e : nums)
        {
            System.out.print(e + " ");
        }
        System.out.println();
        /* Sortie
        1 1 2 3 5 8 13 21 

        */


        // WHILE
        double test = 0.0;
        // afficher tous les nombres aléatoires jusqu'à temps d'en avoir un >= 0.8
        while (test < 0.8)
        {
            test = Math.random(); //un opérateur de la classe Math
            System.out.print(test + ", ");
        }
        System.out.println(); //une nouvelle ligne

        /*
        SCANNER
        c'est comment on saisit les informations de l'utilisateur via le console

        1- on importe la définition d'un Scanner à la première ligne -> import java.util.Scanner;
        2- un objet Scanner est créé à la 1e ligne de main() et fermé à la dernière ligne de main
        */
        System.out.println("Entrer un nombre entier");
        int answer; // variable déclarée sans "l'initaliser" (sans lui donner de valeur)
        
        // méthode 1
        //answer = input.nextInt(); // pour saisir le texte et le convertir en entier
        //input.nextLine(); // pour prendre le reste de la ligne ("\n") et commencer à écouter la prochaine

        // méthode 2
        answer = Integer.parseInt(input.nextLine()); 
            // pour d'abord saisir toute la ligne "... \n" et commencer à écouter la prochaine -> input.nextLine()
            // et ensuite convertir le texte capté en entier -> Integer.parseInt()

        if (answer > 5) System.out.println("c'est assez grand");
        else System.out.println("pas assez grand");

        input.close();
    }
}