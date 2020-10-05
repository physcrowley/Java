public class Tableaux 
{
    public static void main(final String[] args) 
    {
        // les tableaux sont de taille fixe. On spécifie la taille au moment
        // d'initier la variable
        int[] ages = new int[8]; // créer un tableau vide avec 8 éléments
        int[] nums = {1,1,3,5,8,13,21,34,55}; 
            //créer un tableau en spécifiant les valeurs directement entre {}
            //la taille du tableau est fixé par le nombre de valeurs inscrites ici


        System.out.println(nums.length); // attribut important des tableaux
        System.out.println(nums); // pas un affichage très utile
        

        for (int n : nums) // boucle la plus efficace pour OBSERVER les valeurs
        {
            System.out.print(n + ", "); //séparés par ", "
        }
        System.out.println(); // retour de ligne
        System.out.println(nums[3]); // 4e élément
        
        for (int i = 0; i < nums.length; i++) 
            // boucle la plus utile pour MODIFIER SUR PLACE les valeurs du tableau
        {
            nums[i] += 100; //en utilisant les références par indice
        }
        System.out.println(nums[3]); // 4e élément modifié
    }
}
