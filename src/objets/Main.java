package objets;

/**
 * Pour séparer le script de la définition de l'objet Personne
 */
public class Main 
{
    /**
     * Script pour mon programme
     * @param args arguments pour la ligne de commande (pas utilisé)
     */
    public static void main(final String[] args) {
        final Personne adam = new Personne();
        System.out.println(adam);
        for (int i = 0; i < 32; i++)  adam.grandir();
        adam.nommer("Adam");
        System.out.println(adam);
        System.out.println(adam.getAge());
        System.out.println(adam.getNom());
    }
}
