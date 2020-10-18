# Fichiers pour le cours ICS4U
Ce dossier contient les exemples de code partagés avec les élèves. Tout le code source (les fichiers .java) sous-dossier `edu/djc`.

Le but est de synchroniser les changements aux fichiers de référence avec les documents partagés sur le [site du cours](https://sites.google.com/a/ecolecatholique.ca/crowley/ic4u) sans avoir à modifier les liens aux documents.

## 🗃️ Structure
Ce dossier a le structure de projet suivant :
```
Java
├─edu
│  └─djc
│      ├─<projet>
│      │  ├─Main.java (package edu.djc.<projet>;)
│      │  ├─README.md
│      │  └─sousPackage
│      │      └AutresClassesInterfacesEtc.java (package edu.djc.<projet.sousPackage>;)
│      │
│      ├─<autres projets>
│      │  ├─...
│      │  └─...
│      │
│      └─<ExempleSolitaire>.java 
│    
├─bin (fichiers .class -> ignoré par git, donc pas sur GitHub)
│  
├─assets
│  └─(images, sons, etc.)
│
├─.gitignore
├─README.md
├─java-c.cmd
├─java-r.cmd
├─compile-<projet>
└─run-<projet>

```

### Code source
Tout le code source se trouve dans le package racine `edu/djc`.

Parce que le code source est souvent un exemple pour expliquer un seul concept, la plupart des classes sont indépendantes et se trouvent directment à la racine du code source.

Par contre, lorsqu'un exemple nécessite plusieurs classes - comme lors de discussions de méthodes et de la programmation orienté objet, l'exemple au complet est placé dans un sous-package approprié d'`edu/djc`. Dans ces cas, la structure du sous-package est la suivante :
```
├─<projet>
│  ├─Main.java (package edu.djc.<projet>; import edu.djc.<projet>.<sousPackage>.*;)
│  ├─README.md
│  └─sousPackage
│      └AutresClassesInterfacesEtc.java (package edu.djc.<projet.sousPackage>;)
```
La classe qui contient la méthode `main` est placée à la racine du sous-package avec (optionnellement) un fichier explicatif `README.md`. Tous les autres fichiers `.java` sont placés dans un sous-package additionnel afin de gérer les accès plus efficacement avec le mot-clé protected

Les programmes utilisant les modules de JavaFX se trouvent dans un répertoire séparé avec la même structure mais incluant également des dossiers `images` et `sons` pour ces ressources.

### Séquence de travail
La séquence de travail est optimisée pour un éditeur de texte et la ligne de commande utilisant le dossier `Java` comme dossier racine.

Tous les fichiers de configuration pour la compilation et l'exécution sont alors écrites avec des références relatives à la racine et doivent être utilisés avec le console ouvert au dossier `Java`.

## 📄Fichiers

### `.java`
Le code source.

### `README.md`
Explique le but du projet et donne des informations de base sur sa structure.

D'autres fichiers de type `.md` sont utilisés pour des notes spécifiques sur un sujet, mais la plupart des notes se trouvent comme commentaires et documentation dans le code source.

### `java-c.cmd` et `java-r.cmd`
Ces fichiers servent comme remplacement aux commandes `javac`, `java`, `javadoc`, etc. quand les variables PATH sur les postes de l'école ne sont pas configurées correctement. P.ex. le fichier `java-c.cmd` contient ce que normalement on aurait comme variable PATH, soit `%JAVA_HOME%\bin` plus la commande `%*`  qui accepte les arguments typiques pour la compilation qui suivent sur la ligne.

Voici le contenu du fichier `java-c.cmd` : `@"C:/Program Files/Java/jdk-11/bin/javac.exe" %*`. Voici comment l'utiliser avec un des fichiers de configuration :
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

### `compile-<package>` et `run-<package>`
Ces fichiers textes sans extension sont pour **configurer** la compilation et l'exécution des programmes Java. Ils incluent des arguments pour les programmes `javac.exe` et `java.exe`. Cela nous permet de spécifier manuellement des choses qui sont fait automatiquement par un EDI comme Eclipse ou IntelliJ. Le but est de mieux comprendre comment ça fonctionne quand, éventuellemement, on utilise ces EDI comme outil principal.

#### Utilisation

Ex. : On écrit à la ligne de commande :

`javac @compile-recursion`

Le fichier `compile-recursion` inclut les lignes suivantes, chaque ligne étant un argument pour le programme `javac.exe` :
```
-d bin
src/recursion/Categories.java
src/recursion/Category.java
src/recursion/BookStore.java
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

### Fichiers Python
Parfois l'aspect conceptuel est dense et je veux réduire les considérations syntaxiques alors je présente l'exemple avec un script Python au lieu d'une classe Java. Ces fichiers se trouvent dans le package `edu/djc` avec le reste du code source.

## Classes et packages




## Auteur
 David Crowley, EAO
 
 crowlda@ecolecatholique.ca
