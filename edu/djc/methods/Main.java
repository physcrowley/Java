package edu.djc.methods;
// le package indique dans quel dossier ta classe/fichier se trouve

class Main 
{
    /**
     * Script du programme
     * @param args arguments à la ligne de commande (pas utilisé)
     */
    public static void main(final String[] args) 
    {
        /*
        FONCTIONS
        une fonction a trois caractéristiques :
        1- il a un nom
        2- il prend 0 ou plus que 0 paramètres entre des ()
        3- il peut retourner une valeur au programme

        p. ex. main() est une fonction
        1- nom = main
        2- param = () -> String[] args
        3- returns = rien -> void
        */
        
        // un exemple de nos fonctions définies après main() ci-dessous
        int doubled = doubleInt( 72 );
        System.out.println(doubled);

        /*
        OBJETS
        Chaque class Java définit un objet.
        Les objets ont des attributs (valeurs) qu'on appelle des *champs*
        Ils ont aussi des comportements qu'on appelle des *méthodes*.

        Ce fichier Java, Main.java, inclut la méthode main() comme son
        comportement principal, mais définit aussi les comportements
        doubleInt() et printDoubleInt().

        Dans le même *package* (dossier) que notre objet Main, on a aussi définit
        un autre objet, Oiseau (dans Oiseau.java), qui a deux champs (couleur et age) 
        et deux méthodes : parler() et toString()... la méthode *toString()*
        fait partie du langage Java -> par défaut il retourne le type de 
        l'objet et son adresse en mémoire. C'est une bonne pratique de
        définir une meilleure description textuelle pour nos objets!
        */
        Oiseau jaie = new Oiseau(); 
            // on utilise la définition du type Oiseau (dans Oiseau.java)
            // pour créer des *instances* de ce type dans notre programme
            // avec les champs et méthodes d'un Oiseau.
            // on utilise le mot clé *new* et la notation de fonction sur
            // le nom de l'objet (Oiseau())pour créer chaque instance.
        System.out.println(jaie);
        jaie.age = 3;
        jaie.couleur = "bleu";
        System.out.println(jaie);
        jaie.parler();
    }

    /**
     * Simple fonction avec paramètre et valeur de retour
     * @param n un nombre entier
     * @return le double de la valeur n
     */
    public static int doubleInt(int n)
    {
        return n * 2;
    }

    /**
     * Simple fonction procédurale sans valeur de retour qui
     * imprime le double de la valeur passée en paramètre.
     * @param n un nombre entier
     */
    public static void printDoubleInt(int n)
    {
        System.out.println(n * 2);
    }
}