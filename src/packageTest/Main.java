package packageTest;

/*
Arguments à la ligne de commande pour compiler et exécuter le package
(à partir du projet):

javac -d bin src\PackageTest\helpers\Helper.java src\PackageTest\Main.java

java -cp bin packageTest.Main
*/

import packageTest.helpers.Helper;

/**
 * Un script simple pour utiliser un objet défini dans un
 * sous-dossier (sous-package).
 * @author David Crowley, crowlda@ecolecatholique.ca
 */
class Main
{
    public static void main(final String[] args) 
    {
        Helper h = new Helper();
        System.out.println(h.name);
    }
}