package encapsulation;

/**
 * Exemple d'encapsulation simple
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class Main
{
    /**
     * Script pour créer et utiliser une instance d'objet
     * de type UnObjet et montrer la mécanique des accesseurs
     * et mutateurs publics.
     * @param args
     */
    public static void main(String[] args) 
    {
        UnObjet o = new UnObjet();
        
        System.out.println("nom : " + o.getName());
        o.setName("Joseph");
        System.out.println("nom : " + o.getName());
    }
}