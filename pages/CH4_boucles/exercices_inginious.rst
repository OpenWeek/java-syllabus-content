.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

.. author::

    Alexandre Fiset et Jean-Martin Vlaeminck

====================================
La boucle while : Exercice Inginious
====================================

--------------------
Question 1. Launch.
--------------------

La NASA a besoin de vous pour créer un compte à rebour décomptant par 2 de 10 à 0.
Rempliser le code si dessous pour réaliser cela.

.. code-block:: console
	
	int i = 10;
	//utilisez System.out.println(i) pour afficher le contenu de la variable i.

.. inginious:: syllabus-while-ex-Q1

	//a remplir

----------------------
Question 2. Factoriel.
----------------------

Il vous est demandé de réaliser une fonction qui retourne n!. Pour rappel n! = n+(n-1)+...+2+1. 

.. code-block:: console
	
	public int fact(int n)
	{
	//utilisez return n pour retourner la valeur de n.
	//a remplir
	}
.. inginious:: syllabus-while-ex-Q2

	//a remplir



-----------------------
Question 3. Petit jeux.
-----------------------

Il vous est demandé de crée un algorithme de recherche de porte.

Déroulement :
	-À l'aide des données fournies sur l'entrée standart, nous vous demandons de trouver le numéro de porte où se trouve Charlie.

	-Pour tester si la porte est la bonne vous avez le droit à la fonction isDoor(n) où n est le numéro de la porte candidate .Cette fonction vous donnera une indication 'r' si la porte se trouve à droite de la porte candidate et 'l' si la porte se trouve à gauche de la porte candidate.

Règle :
	-La variable n contient le nombre de porte.

	-Vous avez un nombre limité de réponse avant que Charlie ne s'enfuit.

	-Le caractère '!' serra renvoyé une fois Charlie trouvé et votre code doit renvoyé le numéro de la porte.

	-Les portes sont numérotées de gauche à droite et le numéro de portes est comprit entre 0 et n-1 inclut.

Pour vous aider vous pouvez vous documenter sur la recherche par bissection.(https://www.youtube.com/watch?v=HfFbNcIp25s)

.. code-block:: console
	
	public int jeux(int n)
	{
	//a remplir.
	}
.. inginious:: syllabus-ex-while-Q3

	//remplissez votre code ici


