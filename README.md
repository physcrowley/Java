# Fichiers pour le cours ICS4U
Ce dossier contient les exemples de code partagés avec les élèves.

Le but est de synchroniser les changements aux fichiers de référence avec les documents partagés sur le [site du cours](https://sites.google.com/a/ecolecatholique.ca/crowley/ic4u) sans avoir à modifier les liens aux documents.

## Notes sur les divers fichiers

### Fichiers .cmd
Ces fichiers servent comme remplacement aux commandes javac, java, javadoc, etc. quand les variables PATH sur les postes de l'école ne sont pas configurées correctement.

### Fichiers sans extension, compile-... et run-...
Ces fichiers agissent comme la configuration de la compilation et de l'exécution des programmes Java. Ils incluent des arguments pour les programmes javac.exe et java.exe.

Ex. : On écrit à la ligne de commande :

`javac @compile-recursion`

Le fichier `compile-recursion` inclut les lignes suivantes, chaque ligne étant un argument pour le programme javac.exe :
```
-d bin
recursion\Categories.java
recursion\Category.java
recursion\BookStore.java
```
Si d'autres packages ou classes sont ajoutés au projet, ils peuvent être ajoutés au fichier `compile-recursion` sans changer l'appel à la ligne de commande.

Finalement, on peut écrire à la ligne de commande :
`java @run-recursion`

Le fichier `run-recursion` incluant les arguments suivants pour le programme java.exe :
```
-cp bin
recursion.BookStore
```
où la classe `recursion.BookStore` définit la méthode `main` pour le programme.

**Pourquoi?** Travailler avec ces fichiers de configuration "maison" aidera les élèves à comprendre la raison d'être des fichiers de configuration plus complexes utilisés dans Eclipse, dans des projets Maven, etc. lorsqu'ils passent au développement logiciel avec les EDI.

### Classes et packages
Parce que le code source est souvent un exemple pour expliquer un seul concept, la plupart des classes sont indépendantes et se trouvent directment à la racine de l'espace de travail.

Par contre, lorsqu'un exemple nécessite plusieurs classes - comme lors de discussions de méthodes et de la programmation orienté objet - ou plusieurs ressources - comme des images ou sons, l'exemple au complet est placé dans un package.

### Fichiers Python
Parfois l'aspect conceptuel est dense et je veux réduire les considérations syntaxiques alors je présente l'exemple avec un script Python au lieu d'une classe Java.

## Auteur
 David Crowley, EAO
 
 crowlda@ecolecatholique.ca