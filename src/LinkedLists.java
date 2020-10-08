import java.util.LinkedList;

public class LinkedLists 
{
    public static void main(final String[] args) 
    {
        /* 
        // On peut le déclarer sans spécifier les types d'éléments, 
        // mais c'est déconseillé
        LinkedList liste = new LinkedList();
        liste.add(3);
        liste.add("bruh");
        System.out.println(liste.get(0));
        System.out.println(liste.get(1));
        */

        // utilisé ici comme un tableau d'int de taille variable
        LinkedList<Integer> numberList = new LinkedList<Integer>();
        numberList.add(3);
        numberList.add(2);
        System.out.println(numberList.get(0));
    }
}
