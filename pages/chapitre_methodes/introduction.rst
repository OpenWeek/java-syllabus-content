.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)
.. auteurs : Damien Raquet et François Duchêne
===============
Introduction
===============

Ce chapitre porte sur la création de nouvelles méthodes.
Afin de comprendre complètement ce chapitre, nous vous recommendons d'avoir une bonne maîtrise des types d'éléments en java,
sinon, vous risquez d'avoir des difficultés à comprendre certaines parties.

Comment fonctionne une méthode? En java, les méthodes sont des bouts de code implémenté pour simplifier et aérér le code.
Une méthode va effectuer une série d'instructions qui vous permet soit de modifier un élément, soit de récupérer une donnée que vous rechercher.
Il est à noter que chaque langage de programation utilise son propre vocabulaire. Ainsi, ce qui est appellé "méthode" en java, se nomme "fonction" en c par exemple.
On appelle la donnée que renvoie une méthode la "valeur de retour".
Pour récupérer et utiliser ladite valeur de retour, il suffit de déclarer une variable du même type que celle que renvoie la méthode et d'y stocker la valeur retournée.

Par exemple, cette méthode renvoie "false" et cette valeur est stockée dans la variable 'boolean'.

.. code-block:: java
	
	public static void main (String[] args) {
	  boolean windows;
	  windows = Non();
	  System.out.println("Windows est-il un bon logiciel ? " + windows);
	}
	public static boolean Non() {
		return false;
	}


*Windows est-il un bon logiciel ? false*

D'un point de vue technique, il est tout à fait possible de tout coder directement dans la main (cela s'appele faire du hard-code),
mais cela mène assez facilement à des codes illisibles, mal indentés et très difficiles à corriger, même si vous en êtes l'auteur.
Par exemple, imaginez un bout de code qui calcule le plus petit élément d'un tableau. Vous devez effectuer cette recherche sur plusieurs tableaux.
Vous pouvez tout à fait copiez-collez le code, mais vous vous rendrez compte que cela amène à des codes illisibles et impossible à maintenir à jour.
Si vous devez changer la méthode, vous devrez le faire à chaque fois, de même que le nom des variables.
A l'inverse, si vous définnissez une méthode, ces longues répétitions de code seront simplifiées, et il suffira de changer le code une fois,
et sans vous préoccuper du nom des variables ailleurs dans le code.

.. code-block:: java

	public static void main (String[] args) {
		int [5] tab1 = {1,2,3,4,5};
		int [3]	tab2 = {1,2,3};
		int [4]	tab3 = {2,5,8,7};
		int min1 = Integer.MAX_VALUE;
		int min2 = min1;
		int min3 = min1;
		for(int i=0, i<tab1.length(), i++){
			if(tab1[i]<min1){
				min1=tab1[i];
			}
		}
		for(int i=0, i<tab2.length(), i++){
			if(tab2[i]<min1){
				min2=tab2[i];
			}
		}
		for(int i=0, i<tab3.length(), i++){
			if(tab3[i]<min1){
				min3=tab3[i];
			}
		}
	}

Comme vous pouvez le constater, le code devient déjà ridiculement long, sans compter qu'il augmente le risque d'erreurs,
ne serait-ce que si vous oubliez de changer ou vous vous trompez dans le nom de l'une des variables de votre 'copier-collage'.

Voici le même code, mais avec l'utilisation d'une méthode.

.. code-block:: java

	public static void main (String[] args) {
		int [5] tab1 = {1,2,3,4,5};
		int [3]	tab2 = {1,2,3};
		int [4]	tab3 = {2,5,8,7};
		int min1, min2, min3;
		min1=FindLowerElement(tab1);
		min2=FindLowerElement(tab2);
		min3=FindLowerElement(tab3);
	}
	public static int FindLowerElement(int [] tab){
	  int min=Integer.MAX_VALUE;
	  for(int i=0, i<tab.length(), i++){
			if(tab[i]<min){
				min=tab[i];
			}
		}
	  return min;
	}

Il est tout à fait possible pour une méthode, d'utiliser d'autres méthodes déjà créées, voire de s'utiliser elle-même.
Cela peut paraître un peu farfelu, mais cela permet de faire des améliorations de performances non négligeables.
Cependant nous n'entrerons pas dans les détails ici, cette partie de matière fera l'objet dun chapitre à part entière.

Comme vous avez pu le constater, en programation, il y a beaucoup de conventions. Et bien la création de méthode n'échappe pas à la règle.
Voici un exemple de méthode assez mal documentée.

.. code-block:: java

	public static int FindMaxInt (int tab, String trol, double random, char p) {
	  p='r';
	  for (int i=5, i<tab, i++){
	    tab=i+tab-trol.length();
	  }
	  int ozef = (tab * 6)/6
	  return ozef;
	}

Il est assez difficile de comprendre ce que cette méthode remplit comme fonction, et elle est assez courte.
Imaginez si les développeurs devaient passer 15 minutes sur chaque méthode dès qu'ils s'échangent du code.
Afin de palier à ce problème, deux conventions ont été proposées.

- Premièrement, comme pour les noms de variables, il est recommander de nommer des méthodes selon les rôles qu'elles remplissent. Par exemple, notre fonction plus haut servant à trouver le plus petit élément d'un tableau pourrait s'appeler "findLowerElement".

- La seconde convention est de présenter votre méthode à l'aide de conditions et d'un petit texte de présentation. Les conditions se nomment les "pre" et "post" conditions et décrivent respectivement l'état des données avant et après l'exécution de la méthode. Tandis que le texte de présentation décris la fonction que remplit la méthode.

En reprenant notre méthode de findLowerElement, une présentation correcte pourrait donner ceci.

.. code-block:: java

	/*
	*   Cette méthode prends en argument un tableau d'entier non null, et retourne
	*   le plus petit entier trouvé dans ce tableau
	*
	*   pre: tab != null
	*   post: tab est inchangé, renvoie le minimum du tableau	
	*/
	public static int FindLowerElement(int [] tab) {
		int min=Integer.MAX_VALUE;
		for(int i=0, i<tab3.length(), i++){
			if(tab[i]<min){
				min=tab[i];
			}
		}
		return min;
	}
