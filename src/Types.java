class Types
{
    public static void main(final String[] args) 
    {
        boxing();
        tableaux();
    }

    public static void boxing()
    {
        System.out.println("\n======Boxing Method======\n");
        // Chaque type natif a un objet Java qui fourni des méthodes et champs
        // additionnels que les opérateurs de base possibles avec le type natif
        // seul.
        // Chaque objet est le nom au long, commençant avec une majuscule, p. ex.:
        //  Integer, Float
        // On reconnaît que String est un objet Java...

        System.out.println(Integer.SIZE);  
            // SIZE est un champs (valeur) pas une méthode

        String num = "23";
        int number = Integer.parseInt(num); //parseInt est une méthode de l'objet Integer
        Integer numberObject = number; //converti ("boxes") un int en objet Integer automatiquement
        
        System.out.printf("int : %d, Integer: %d\n", number, numberObject);
            // pour place l'Integer dans la chaîne de texte, il est converti ("deboxed")
            // en int automatiquement
        System.out.println(numberObject.getClass()); 
            // ont peut faire ça avec les objets mais pas les types natifs comme int
    }

    public static void tableaux()
    {
        System.out.println("\n======Tableaux Method======\n");
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