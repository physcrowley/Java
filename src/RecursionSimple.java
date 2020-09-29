import java.util.Scanner;

public class RecursionSimple 
{
    /**
	 * Afficher un texte d'invitation et tenter de saisir un entier. Capter les
	 * entrées invalides et se répéter de façon recursive.
	 * 
	 * @param in - le Scanner déclaré dans la méthode main 
	 * @param prompt - le texte d'invitation
	 * @return c - une valeur entiére		
	 */
	static int getChoice(Scanner in, String prompt)
	{
		System.out.println(prompt);
		int c;
		try
		{
			c = Integer.parseInt(in.nextLine());
		}
		catch (Exception e)
		{
			System.out.println("Pas un nombre entier valide : " + e);
			c = getChoice(in, prompt); // recursivité
		}
		return c;
	}
    
    /**
     * Script du programme
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(final String[] args) 
    {
        Scanner stdin = new Scanner(System.in);

        String msg = "Entrer un nombre entier bizarre";
        int num = getChoice(stdin, msg);
        System.out.println(num);

        stdin.close();
    }
    
}
