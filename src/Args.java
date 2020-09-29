/**
 * Simple command line program for converting hexadecimal
 * to decimal.
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
class Args
{
    /**
     * Program script
     * @param args expects a single argument representing 
     *             a hexadecimal number
     */
    public static void main(final String[] args) 
    {
        int num = Integer.parseInt(args[0], 16);
        System.out.println(num);
    }
}