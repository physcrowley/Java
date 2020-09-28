package encapsulation;
/**
 * Simple encapsulation example
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
public class Main
{
    /**
     * To create and use UnObjet instance, showing encapsulation
     * of the name field
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