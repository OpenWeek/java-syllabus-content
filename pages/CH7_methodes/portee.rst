.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Damien Raquet et François Duchêne

====================
Portee des variables
====================

Avant d'entamer cette dernière section, nous rappelons que nous considérons comme acquis la portée des variables à l'intérieur de la main.
Il est évident que la syntaxe d'un langage est la même à l'intérieur d'une méthode que dans la main, de ce fait tous les concepts de portée des variables est également le même.
Dans de cette section, nous allons simplement voir quels changements une méthode peut appliquer sur les variables qu'elle reçoit en argument.

Premièrement, vous serez peut-être tenté d'utiliser des variables déclarées dans la main, à l'intérieur de votre méthode.
Cela est impossible, et rendrait l'utilisation des arguments inutiles. Cependant, cela permet de réutiliser des noms de variables.
Dans le code ci-dessous, un entier "zero" est déclaré dans la main, mais il vous est tout à fait possible de renommer une variable "zero" dans chacune de vos méthodes auxiliaires.

.. code-block:: java

	public static void main(String []args) {
		int zero = 0; //On déclare une première fois une variable zero
	}
	public static int methodeUltraUtile() {
		int zero = 0; //On declare une seconde fois une variable locale zero, pas de problème
		return zero; 
	}

Ces variables sont dites **locales**, elles n'existent que dans le cadre de leur méthode. C'est ce que l'on appelle leur **portée**. Par exemple, le code suivant est incorrect.

.. code-block:: java

	public static void main(String []args) {
		MethodQuiNeMarchePas();
		zero = zero + 1; //Interdit, zero ne fais pas partie de la portée de main
       	}
        public static void methodeQuiNeMarchePas() {
                int zero = 0; //Portee de zero sur cette méthode
        }

Ainsi, si vous désirez utiliser cette valeur, il faut soit que la méthode retourne la valeur, soit que l'on utilise une variable dite **globale**.
C'est une variable qui est directement écrite dans le corps de la classe Java, et non pas dans une méthode. On pourrait l'écrire :

.. code-block:: java

	class nombre {
		public static int zero = 0;
	}

La variable globale zero est donc visible dans l'ensemble de la classe nombre. Attention. Bien que ça a l'air terriblement tentant, il est impératif d'utiliser le moins de variables globales possibles. Cela demande beaucoup plus de ressources à l'ordinateur que des variables locales.

Deuxièmement, les variables passées en argument à une méthode transmettent uniquement une valeur. Un argument a une portée locale sur la méthode. Si on change a valeur de cet argument, on ne change que la valeur de la variable locale à cette méthode.

.. code-block:: java

        public static void main(String []args) {
                int zero = 0;
        	int retour = methodeMegaUtile(zero)
	}
	public static int methodeMegaUtile(int n) {
                //n vaut 0 lors de son appel par main
		n = 2; 
		//n vaut maintenant 2 mais zero vaudra toujours 0
		return n;
        }

Nous avons traité ici du cas des types primitifs. Le cas des Objets est encore différent de celui-ci.
