# Structure des dossiers 

Tout espace de travail devrait avoir ces trois groupes de dossiers à la racine :
* `src` 
    * tous les packages et le code source (fichiers .java)
* `bin`/`out`
    * tous les fichiers compilés (.class, binaires) avec la structure des packages dans le dossier src
    * séparés pour un éventuel emballage pour partager le programme (.jar)
* `assets` 
    * images et sons, etc. nécessaires pour différentes parties du programme 


Le code source dans le dossier `src` est organisé en **packages**.

--> Idée principale : en Java un package == un dossier <--

## Exemple
```
Workspace
├src
│  ├projet1
│  │  ├Main.java (1e ligne > package projet1;)
│  │  ├UnObjet.java (1e ligne > package projet1;)
│  │  └UnAutreObjet.java (1e ligne > package projet1;)
│  └projet2
│     ├Main.java (1e ligne > package projet2;)
│     └sousPackage
│         ├UnObjet.java (1e ligne > package projet2.sousPackage;)
│         └UnAutreObjet.java (1e ligne > package projet2.sousPackage;)
├bin (structure interne générée automatiquement lors de la compilation)
│  ├projet1
│  │  ├Main.class
│  │  ├UnObjet.class
│  │  └UnAutreObjet.class
│  └projet2
│     ├Main.class
│     └sousPackage
│         ├UnObjet.class
│         └UnAutreObjet.class
└assets
```

# Comment compiler et exécuter tout ça?

## Cas simple sans structure interne
```
ProjetSimple
└Main.java
```

LIGNE DE COMMANDE (pour compiler) :

`~ProjetSimple> javac Main.java`

RÉSULTAT:
```
ProjetSimple
├Main.class
└Main.java
```

LIGNE DE COMMANDE (pour exécuter) :

`~ProjetSimple> java Main`

## Cas simple **avec** structure interne

STRUCTURE DU PROJET
```
ProjetReel
├src
│  └projetSimple
│     └Main.java (package projetSimple;)
└bin
```

COMMANDES JAVA UTILES

Quand on a une structure avec des packages, on utilise les arguments `-d` et `-cp` pour mieux contrôler où vont les fichiers et où chercher les fichiers

`javac`

`-d` > indique le **D**ossier où on veut mettre les fichiers compilés

`java`

`-cp` > indique le chemin pour touver les classes, soit la **C**lass**P**ath

LIGNE DE COMMANDE (pour compiler) :

`~ProjetReel> javac -d bin src\projetSimple\Main.java`

RÉSULTAT:
```
ProjetReel
├src
│  └projetSimple
│     └Main.java (package projetSimple;)
└bin
   └projetSimple
      └Main.class
```

LIGNE DE COMMANDE (pour exécuter) :

`~ProjetReel> java Main` > erreur - ne trouve pas la classe Main

`~ProjetReel> java -cp bin Main` > erreur - ne trouve pas la classe Main (bonne classpath, mais mauvais package)

`~ProjetReel> java -cp bin projetSimple.Main` 


## Cas avec **plusieurs** fichiers .java et/ou packages

STRUCTURE DU PROJET
```
ProjetReel
├src
│  └projetObjets
│     ├Main.java (package projetSimple;)
│     ├UnObjet.java
│     ├UnAutreObjet.java
│     └UnTroisiemeObjet.java
└bin
```
LIGNE DE COMMANDE (pour compiler) :

*Option manuel* :
 

`~ProjetReel> javac -d bin src\projetObjets\UnObjet.java src\projetObjets\UnAutreObjet.java src\projetObjets\Main.java` 

(Wow! Essaye de ne pas faire d'erreur!)

*Option fichier de configuration* :

Dans un fichier qui s'appelle `compile-projetObjets` >

```
-d bin
src\projetObjets\UnObjet.java
src\projetObjets\UnAutreObjet.java
src\projetObjets\UnTroisiemeObjet.java
src\projetObjets\Main.java
```

À la ligne de commande :

`~ProjetReel> javac @compile-projetObjets`


RÉSULTAT:

* *structure dans `src` reproduit dans `bin` avec les fichiers `.class`*

LIGNE DE COMMANDE (pour exécuter) :

*Manuellement* :

`~ProjetReel> java -cp bin projetObjets.Main`

*Avec fichier de configuration* :

Dans un fichier qui s'appelle `run-projetObjets` >
```
-cp bin
projetObjets.Main
```

À la ligne de commande :

`~ProjetReel> java @run-projetObjets`