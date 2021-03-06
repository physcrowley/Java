package edu.djc;
import java.util.HashMap;
import java.util.Scanner;

public class HashMaps 
{
    public static void main(final String[] args) 
    {
        Scanner in = new Scanner(System.in);
        /* Les clés sont les noms, 
        les valeurs sont les numéros de téléphone */
        //HashMap<Type pour la clé, Type pour les valeurs>
        //HashMap<K,V>
        // les types doivent être des objet (Integer au lieu de int)
        HashMap<String, Integer> favNumbers = new HashMap<String, Integer>();

        String[] answers = new String[2];
        String name = "";
        int favNum = 0;
        boolean getfavNumbers = true;
        while(getfavNumbers)
        {
            System.out.println("Enter a name and favourite number, separated by a comma");
            answers = in.nextLine().split(",");
            name = answers[0];
            favNum = Integer.parseInt(answers[1].strip());
            if (favNumbers.containsKey(name)) System.out.println("Name already exists"); // message d'erreur
            else // ajouter le nom et le nombre
            {
                favNumbers.put(name, favNum);
                System.out.println("Entry added to database");
            }
            
            System.out.println("Enter a new set? (Y/N)");
            if (!in.nextLine().toLowerCase().equals("y")) 
            {
                getfavNumbers = false;
                System.out.println("End of data entry\n============================");
            }

        }
        /*
        favNumbers.put("David", 9);
        favNumbers.put("Joseph", 3);
        favNumbers.put("Joseph", 6); // remplace la valeur 3 avec 6
        */

        System.out.println(favNumbers.get("Joseph"));

        in.close();
    }
}
