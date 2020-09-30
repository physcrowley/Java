# Fichiers pour le cours ICS4U
Ce dossier contient les exemples de code partagés avec les élèves. Tout le code source (les fichiers .java) sont dans le dossier `src`.

Le but est de synchroniser les changements aux fichiers de référence avec les documents partagés sur le [site du cours](https://sites.google.com/a/ecolecatholique.ca/crowley/ic4u) sans avoir à modifier les liens aux documents.

## Notes sur les divers fichiers

### Fichiers sans extension, compile-\<package\> et run-\<package\>
Ces fichiers sont pour **configurer** la compilation et l'exécution des programmes Java. Ils incluent des arguments pour les programmes `javac.exe` et `java.exe`.

Ex. : On écrit à la ligne de commande :

`javac @compile-recursion`

Le fichier `compile-recursion` inclut les lignes suivantes, chaque ligne étant un argument pour le programme `javac.exe` :
```
-d bin
src\recursion\Categories.java
src\recursion\Category.java
src\recursion\BookStore.java
```
Si d'autres packages ou classes sont ajoutés au projet, ils peuvent être ajoutés au fichier `compile-recursion` sans changer l'appel à la ligne de commande.

Finalement, on peut écrire à la ligne de commande :
`java @run-recursion`

Le fichier `run-recursion` inclut les arguments suivants pour le programme `java.exe` :
```
-cp bin
recursion.BookStore
```
où la classe `recursion.BookStore` définit la méthode `main` pour le programme.

**Pourquoi?** Travailler avec ces fichiers de configuration "maison" aidera les élèves à comprendre la raison d'être des fichiers de configuration plus complexes utilisés dans Eclipse, dans des projets Maven, etc. lorsqu'ils passent au développement logiciel avec les EDI.

### Fichiers .cmd
Ces fichiers servent comme remplacement aux commandes `javac`, `java`, `javadoc`, etc. quand les variables PATH sur les postes de l'école ne sont pas configurées correctement. P.ex. le fichier `java-c.cmd` contient ce que normalement on aurait comme variable PATH, soit `%JAVA_HOME%\bin` plus la commande `%*`  qui accepte les arguments typiques pour la compilation qui suivent sur la ligne.

Voici le contenu du fichier `java-c.cmd` : `@"C:\Program Files\Java\jdk-11\bin\javac.exe" %*`. Voici comment l'utiliser avec un des fichiers de configuration :
```
java-c.cmd @compile-recursion
```
ou simplement :
```
java-c @compile-recursion
```

Voici comment l'utiliser avec un fichier qui est dans le même dossier que le fichier `java-c.cmd` :
```
java-c Classe.java
```

Le fichier `java-r.cmd` agit de façon similaire pour remplacer la commande `java`.

### Classes et packages
Parce que le code source est souvent un exemple pour expliquer un seul concept, la plupart des classes sont indépendantes et se trouvent directment à la racine du code source, soit directement dans le dossier `src`.

Par contre, lorsqu'un exemple nécessite plusieurs classes - comme lors de discussions de méthodes et de la programmation orienté objet - ou plusieurs ressources - comme des images ou sons, l'exemple au complet est placé dans un package à l'intérieur du dossier `src`.

### Fichiers Python
Parfois l'aspect conceptuel est dense et je veux réduire les considérations syntaxiques alors je présente l'exemple avec un script Python au lieu d'une classe Java.

## Auteur
 David Crowley, EAO
 
 crowlda@ecolecatholique.ca
