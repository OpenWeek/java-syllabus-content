.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

.. author::

    Alexandre Fiset et Jean-Martin Vlaeminck

=================================
Les boucles : Exercices Inginious
=================================

---------------------
Question 1 : Launch !
---------------------

La NASA a besoin de vous pour créer un compte à rebour décomptant par 2 de 10 à 0.
Remplissez le code ci-dessous pour réaliser cela.

.. code-block:: java

	int i = 10;
	//utilisez System.out.println(i) pour afficher le contenu de la variable i.

.. inginious:: CH4Q4_ex1

	//a remplir

------------------------
Question 2 : Factorielle
------------------------

Il vous est demandé de réaliser une fonction qui retourne n!. Pour rappel, n! = n * (n-1) * ... * 2 * 1. Vous avez accès à la variable ``n``, dont il faut calculer la factorielle, et le résultat devra être mis dans la variable ``factorial``.

.. code-block:: java

	// int n = 10; // le nombre dont on veut calculer la factorielle.
        // int factorial; // La factorielle de ce nombre, calculée par vos soins.
        /* Votre code */

.. inginious:: CH4Q5_ex2

	//a remplir

------------------------------
Question 3 : Initiales de mots
------------------------------

Ecrivez une boucle ``for`` qui extrait et affiche la première lettre de chaque mot contenu dans une chaine de caractères (``String``) nommée ``input``. Ici, on considère qu'un mot est délimité par des espaces. Par exemple, pour la chaine de caractères "Jean-Didier Legat", le programme affichera "JDL" ; pour la chaine de caractères "J'aime la programmation", il affichera "Jlp". Pour vous aider, vous aurez besoin d'une variable permettant de savoir si vous êtres au début d'un mot (par exemple après avoir rencontré un espace juste avant...). Pour rappel, étant donné une chaine de caractères ``String s = 3bonjour"``, si vous souhaitez accéder à la 3ième lettre de la chaine (ici, 'n') et la mettre dans la variable ``char c``, vous devez écrire ``c = s.charAt(3)``. Pour récupérer la longueur d'une chaine de caractères, vous pouvez utiliser ``int longueur = s.length()``. Utilisez ``System.out.print(c)`` pour afficher un unique caractère ``c`` sans retour à la ligne.

.. inginious:: CH4Q7_initiales

        // Ecrivez ici votre programme.

-------------------------
Question 4 : Additionneur
-------------------------

On vous propose de coder un petit programme qui additionne entre eux les nombres entiers entrés par l'utilisateur sur l'entrée standard. L'utilisateur rentre en premier lieu un nombre entier positif ``n``, le nombre d'entiers qu'il va rentrer dans le programme ; après avoir lu ``n`` entiers, le programme affiche sur la sortie standard (avec ``System.out.println``) la somme de tous les nombres (sauf ``n``) et s'arrête. Pour vous aider, vous pouvez récupérer le nombre entier suivant rentré par l'utilisateur dans la variable ``int i`` comme suit :

.. code-block:: java

        int i = nextInt(); // Ceci est une fonction.

Plusieurs réponses étant possibles (une par type de boucle), tentez de résoudre l'exercice avec les 3 types de boucles vues : ``while``, ``do...while`` et ``for``.

.. inginious:: CH4Q8_adder

        // Ecrivez ici votre programme

---------------------------
Question 5 : Multiplicateur
---------------------------

Après avoir fait un additionneur, pouvez-vous faire un multiplicateur, qui multiplie les nombres rentrés par l'utilisateur ? Cette fois, celui-ci l'entre pas le nombre ``n`` de nombres entiers qu'il va rentrer ; il va plutôt rentrer le nombre 0 quand il aura terminé. Votre programme devra alors afficher le produit de tous les nombres rentrés (sauf zéro) sur la sortie standard. Vous avez toujours accès à la fonction ``nextInt`` de l'exercice précédent.

.. inginious:: CH4Q9_multiplier

        // Ecrivez ici votre programme

-------------------------
Question 6 : Un petit jeu
-------------------------

Il vous est demandé de créer un algorithme de recherche de porte.

Déroulement :
	-À l'aide des données fournies sur l'entrée standard, nous vous demandons de trouver le numéro de porte où se trouve Charlie.

	-Vous pouvez tester si la porte ``n`` est la bonne en utilisant la fonction ``isDoor(n)`` où ``n`` est le numéro de la porte candidate .Cette fonction retourne un caractère (``char``) valant 'r' si la porte se trouve à droite de la porte candidate et 'l' si la porte se trouve à gauche de la porte candidate.

Règles :
	-La variable ``nDoors`` contient le nombre de portes.

	-Vous avez un nombre limité de réponse avant que Charlie ne s'enfuit.

	-Le caractère '!' sera renvoyé une fois Charlie trouvé et votre code devra mettre le numéro de la porte où vous pensez trouver Charlie dans la variable ``candidateDoor``.

	-Les portes sont numérotées de gauche à droite, de ``0`` à ``n-1`` inclus.

Pour vous aider vous pouvez vous documenter sur la recherche par bissection (https://www.youtube.com/watch?v=HfFbNcIp25s).

Cet exercice est plus dur que les précédents ; n'hésitez pas à y revenir plus tard, pour ne pas ralentir votre découverte de la programmation.

.. code-block:: java

	// int nDoors = 40; // le nombre de portes, pas nécessairement égal à 40.
        // int candidateDoor = -42; // la porte derrière laquelle vous pensez que Charlie se trouve.
        /* Votre code */

.. inginious:: CH4Q6_ex3

	// Insérez votre code ici.


