package edu.djc;
/**
 * Un programme simple pour montrer les règles de syntaxe en Java
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class Syntaxe 
{
    /**
     * Script pour le programme
     * @param args arguments à la ligne de commande
     */
    public static void main(String[] args) 
    {
        // le code suivant n'est pas structuré avec les espaces blancs
        // mais respecte les ; et les {} et il s'exécute sans erreurs
        
        for              (int i = 0; 	i < 
10; i++)							{
			if							(i < 
  4) 
{ 		System  .  out  .  println(i                           )
;}
 	       else { 	System.out.println		(i 
* i
)
; 					}				}
    }
}
