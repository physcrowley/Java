package encapsulation;

public class Main
{
    public static void main(String[] args) 
    {
        UnObjet o = new UnObjet();
        
        System.out.println("nom : " + o.getName());
        o.setName("Joseph");
        System.out.println("nom : " + o.getName());
    }
}