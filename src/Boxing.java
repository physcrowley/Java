class Boxing
{
    public static void main(final String[] args) 
    {
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
        Integer numberObject = number; 
            //converti ("boxes") un int en objet Integer automatiquement
        
        System.out.printf("int : %d, Integer: %d\n", number, numberObject);
            // pour placer l'Integer dans la chaîne de texte, il est converti ("deboxed")
            // en int automatiquement
        System.out.println(numberObject.getClass()); 
            // ont peut faire ça avec les objets mais pas les types natifs comme int
    }
}