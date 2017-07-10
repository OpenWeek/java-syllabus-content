.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)
.. auteurs : François Duchêne et Damien Raquet
==========================
Définition d'une fonction
==========================
---------------------------------
Modificateurs et types de retour
---------------------------------

Vous l'avez sûrement déjà remarqué mais un bon nombre de mots se trouvent devant le nom d'une fonction. Ils forment la définition d'une fonction.

.. code-block:: java

	public static int exposant(int a, int b) {
		//code
	}

Tous les mots utilisés ici devant le nom de la fonction, c'est à dire "public static int", ont tous une signification précise. On peut les regrouper comme suis.

.. code-block:: java

	modificateurs type-de-retour nom-méthode (paramètres) {
		corp-de-fonction
	}

Il est un peu tôt dans ce cours pour aller plus en détail dans ces modificateurs, c'est-à-dire les mots private, public et static.
Tout cela est lié à la partie Orienté Objet de Java qui sera expliquée plus tard. Pour l'instant, écrivez toutes vos méthodes en commencant par "public static".

Le type de retour indique le type de donnée que la méthode renvoie. Une méthode peut renvoyer n'importe quelle valeur, que ce soit int, long, double, float, etc.
Elle peut également renvoyer des objets, des types de valeurs spéciales que nous verrons dans une partie consacrée, comme des String.

Il peut également arriver qu'une fonction ne renvoie rien du tout. Elle ne fait qu'exécuter les instructions qui se trouvent dans son corps. Pour ces fonctions, on utilise le mot-clé *void*, signifiant vide en anglais.
Il est tout à fait impératif qu'une méthode aie un type donné, elle ne peut pas ne pas en avoir.

Une fonction peut également avoir ou ne pas avoir de paramètres. Le nombre de paramètres est illimité et accepte tout type de données, des valeurs primitives aux tableaux en passant par les objets.

Les paramètres sont des données que l'ont passe par référence ou par valeur à la méthode. C'est lié à la gestion de la mémoire en Java.
* Les paramètres passés par valeur à la méthode sont tous les types primitifs (int, float, ...). C'est à dire qu'ils n'existent que dans le bloc de la méthode. Nous en reparlerons sur la page suivante.
* Les paramètres passés par référénce sont les objets et les tableaux entre autre. Sans entrer dans les détails, cela signifie que vous pouvez 'partager' la même donnée entre plusieurs méthodes.

Donc lorsque vous modifiez une donnée dans une méthode, la donnée est modifiée en mémoire pour toutes les méthodes.

Voici un exemple simple avec un String "Hello"

.. code-block:: java

	public static void main (String[] args){
	  String bonjour = "Hello";
	  world(bonjour);
	  System.out.println(bonjour);
	}
	public static void world(String bonjour) {
	  bonjour.append(" world !");
	}

La fonction main qui possède la référence de la String "Hello", affiche bien "Hello world !" après l'appel de la fonction "world".

Chaque méthode doit avoir un nom différent même s'ils ont un corps identique. Il est cependant possible d'écrire plusieurs fonctions avec le même nom mais avec des paramètres différents.
Tant que les paramètres sont différents, le reste des modificateurs et type de valeur de retour peuvent rester inchangé.

Par exemple :

.. code-block:: java

	public static int add() {
	  int a=1;
	  int b=2;
	  return a+b;
	}
	public static int add(int a) {
	  int b=2;
	  return a+b;
	}
	public static String add(String a) {
	  return a.append(" coucou ");
	}

Tous ces codes sont légaux. Java sait quelle méthode appeler à partir des paramètres qu'il reçoit.

En revanche,

.. code-block:: java

	public static String add(String a) {
	  return a.append("coucou");
	}
	public static int add(String a) {
	  return 2;
	}

est illégal. Java ne pourra en effet pas savoir quelle méthode appeler.

Vous avez peut-être remqarqué que la méthode main était différente des autres.
En fait, tout programme au moment de s'exécuter, recherche une méthode main. C'est toujours par cette fonction que le programme débute.
Elle ne renvoie rien et prend en paramètre un tableau de String nommé "args".
Ce tableau contient les différents arguments passés au programme lors son appel, par exemple lorsque vous l'appeler depuis un terminal.
Comme tout tableau, il commence à 0 et contient tous les mots placés après le nom du programme lors de l'appel.
