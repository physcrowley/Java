public class Strings 
{
    public static void main(final String[] args) 
    {
        String myString = "3,4,5,,6,7,8,9 10";
        System.out.println(myString);
        String[] halves = myString.split(","); // break into bits using a separator character
        System.out.println("Substrings separated by ,");
        for(String st : halves)
        {
            System.out.println(st);
        }

        
        String[] subs = recursiveStrSplitter(myString, ",; ");
        System.out.println("Substrings separated by , ; and <space> recursively");
        for(String st : subs)
        {
            System.out.println(st);
        }
        System.out.println("=========");
        

        System.out.println(myString.length()); // number of characters

        System.out.println(myString.substring(3)); // from index 3 (4th character) to the end
        System.out.println(myString.substring(myString.length()-1)); // the last 1 character of the String
        System.out.println(myString.substring(2, 5)); // the 3rd to the 5th characters; the sixth (@ index 5) is excluded

        System.out.println(myString.indexOf("8")); // returns first index of substring matching the reference String
        System.out.println(myString.indexOf("8,9 10")); // returns first index of substring matching the reference String 
        System.out.println(myString.indexOf("A")); // not there, returns -1


    }

    /**
     * Recursively split a String using all the characters provided in a separator String
     * as individual separators.
     * <p>
     * Treats consecutive splitter characters as indivual splits to be made, according to 
     * the behaviour of the java.lang.String.split() method.
     * @param s the String to be split
     * @param sep the String including all the characters to be used as separators
     * @return an array of the String bits from the final .split() operation
     */
    static String[] recursiveStrSplitter(String s, String sep)
    {
        if (sep.length() == 1) return s.split(sep); // split only once there is a single character as separator

        // otherwise...
        String currentSep = sep.substring(0, 1); // use first character as reference
        String currentString = s.replaceAll(currentSep, sep.substring(1, 2)); 
            // replace all of the 1st separator character in the String with the 2nd separator character
        return recursiveStrSplitter(currentString, sep.substring(1)); 
            // repeat using the currentString and the shortened separator String (excluding the 1st character)
    }

}
