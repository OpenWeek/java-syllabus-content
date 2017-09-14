.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)


.. author::

    Alexandre Fiset et Jean-Martin Vlaeminck

=========================
La boucle while : théorie
=========================

Utilité de la boucle while
===========================

Il vous est à présent possible avec votre background en java de réaliser des calculs ainsi que des comparaisons élémentaires. Néanmoins, il vous est pour le moment impossible de réaliser ce pour quoi les ordinateurs ont été créés, répéter des opérations simples en boucle.


Ceci nous amène donc à l'utilisation de la boucle la plus simple en java, la boucle **while**.



Sémantique de la boucle while et do...while
===========================================

.. code-block:: java

	//while
	while(condition)
	{
		/*code a executer en boucle.*/
	}

	//do...while
	do
	{
		/*code a executer en boucle.*/
	}while(condition); //faire attention a ce point virgule !!!

Dans les deux schémas ci-dessus, ``condition`` est à remplacer par une condition booléenne telle que vu dans les chapitres précédents. Tant que la condition est vraie, l'ordinateur exécutera le code entre accolades. Pour comprendre la différence entre les deux utilisations de la boucle while, il nous faut comprendre comment un ordinateur exécutera ces deux types de boucle.


.. raw:: html

	<p align="center">
	<img src="data:image/png;base64,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
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAICe+f+22Os7HEpP/wAAAABJRU5ErkJggg==" alt="boucle" title="boucle"/>
	</p>

Dans ce shéma, les flèches correspondent à l'ordre d'exécution du processus. Alors que, les couleurs des flèches indiquent l'ordre d'éxécution du processus suivant la valeur de retour de la condition (vert si la condition est ``true``, rouge si elle vaut ``false``). Maintenant il est facile de voir la différence entre les deux boucles, elle se situe au niveau du test de la condition. C'est pourquoi il est important de remarquer que dans une boucle ``do...while``, le code sera exécuté au moins une fois avant de tester la condition alors que pas forcément dans une boucle ``while``.


Question 1. Analyse de code.
----------------------------

Quelles boucles ``while`` sont valides sémantiquement si les variables a et b sont correctement initialisées?

.. code-block:: java

    /*1*/
	while( a = a )
	{
		a = a + 1;
	}

	/*2*/
	while(true){/*do code*/}

	/*3*/
	while( !a )
	{
		b = false;
		a = true;
	}

	/*4*/
	do
	{
		a = a + b;
	}

	/*5*/
	do
	{
		a = a - 1;
	}while(a > b)

	/*6*/
	do
	{
		a = a + 5;
	}while(a <= b);

.. class:: negative

    - 1,2,3,6

.. class:: negative

    - 2,3,4,6

.. class:: negative

    - 2,3,5,6

.. class:: positive

    - 2,3,6

.. à changer pour plus de une réponse.

Avantages et désavantages entre les deux boucles.
=================================================

Pour comprendre quels sont les avantages et désavantages entres les deux boucles, il est plus facile de travailler avec du pseudo-code. Imaginons un informaticien qui boit du café dans une tasse remplie. Un pseudo-code pour représenter la fonction qui fait boire l'informaticien pourrait être implémentée comme ci-dessous.

.. code-block:: java

	/*
	*pseudo-code faisant boire un informaticien utilisant une boucle while.
	*/
	while(tasse_non_vide())
	{
        System.out.println("L'informaticien boit.");
        System.out.println("La tasse se vide.");
	}

	/*
	*pseudo-code faisant boire un informaticien utilisant une boucle do...while.
	*/
	do
	{
        System.out.println("L'informaticien boit.");
        System.out.println("La tasse se vide.");
	}while(tasse_non_vide());

Nous pouvons remarquer que dans la boucle version ``do...while`` un problème se pose. En effet, un informaticien pourrait boire dans la tasse de café alors qu'elle est vide. Pour remédier à cela, nous pourrions protéger notre boucle avec une condition comme cela :

.. code-block:: java

	/*
	*pseudo-code faisant boire un informaticien utilisant une boucle do...while sans erreur.
	*/
	if(tasse_non_vide())
	{
		do
		{
            System.out.println("L'informaticien boit.");
            System.out.println("La tasse se vide.");
		}while(tasse_non_vide());
	}

Ce qui revient exactement à faire une boucle ``while`` et donc une utilisation de la boucle ``do...while`` n'est pas judicieuse dans notre problème.

Par contre, un pseudo-code qui permettrait a notre informaticien de travailler s'il a reçu une tasse de café pourrait être implémentée comme ci-dessous.

.. code-block:: java

	/*
	*pseudo-code faisant demander une tasse de café pour l'informaticien utilisant une boucle while.
	*/
	while(pas_de_tasse_de_cafe())
	{
        System.out.println("L'informaticien demande une tasse de café.");
	}
    System.out.println("L'informaticien travaille (ou pas).");

	/*
	*pseudo-code faisant demander une tasse de café pour l'informaticien utilisant une boucle do...while.
	*/
	do
	{
        System.out.println("L'informaticien demande une tasse de café.");
	}while(pas_de_tasse_de_cafe());
    System.out.println("L'informaticien travaille (ou pas).");


Si le programme ne sait pas si l'informaticien a une tasse de café ou non (typiquement une variable non initialisé), alors notre programme ne saura pas quoi faire au moment de tester la condition dans la boucle ``while`` (Java vous renverra une erreur). Pour remédier à cette erreur nous pouvons réécrire le code comme suit.

.. code-block:: java

	/*
	*pseudo-code faisant demander une tasse de café pour l'informaticien utilisant une boucle while sans erreur.
	*/

    System.out.println("L'informaticien demande une tasse de café.");
	while(pas_de_tasse_de_cafe())
	{
        System.out.println("L'informaticien demande une tasse de café.");
	}
    System.out.println("L'informaticien travaille (ou pas).");

Ce bout de code correspond exactement à une boucle ``do...while`` au niveau de l'enchainement du bloc condition/code à exécuter. Et donc le choix judicieux pour résoudre ce problème est l'utilisation d'une boucle ``do...while``.


Une possible implémentation des deux choix les plus judicieux pourrait être.

.. code-block:: java

	/*
	*code faisant boire un informaticien.
	*/

	int tasse = 100 //pourcentage de remplissage de la tasse.
	int ennergie = 0 //pourcentage d'ennergie de l'informaticien.
	while(tasse>0)
	{
		tasse = tasse - 10;
		energie = energie + 1;
	}

	/*
	*code faisant demander une tasse de café pour l'informaticien utilisant une boucle do...while.
	*/
	boolean tasse;
	do
	{
		tasse = demandeTasse();
	}while(tasse == false);
	travaille();

Dans ce code ``demandeTasse()`` et ``travaille()`` sont des appels de fonction que vous verrez dans le chapitre sur les méthodes.

Question 2. Analyse de situation.
---------------------------------

Quel(s) problème(s) utilise(nt) une boucle ``do...while`` par rapport à une boucle ``while`` pour avoir une meilleure implémentation ?

.. class:: positive

    - Demande d'un burrito avant de partir.

.. class:: negative

    - Remplissage d'un reservoir de voiture.

.. class:: negative

    - Décompte de 10 à 0.



La boucle infinie.
==================

Le problème de la boucle infinie est sans doute le problème le plus important lors de la création d'une boucle. Elle survient quand la condition de la boucle ``while`` ne passe jamais à ``false``. Un bel exemple de boucle infinie peut être illustré avec l'exemple ci-dessous.

.. code-block:: console

	/*
	*boucle infinie
	*/

	int i = 0;
	while(i < 10)
	{
		i = 1;
	}



Dans ce code le programmeur a oublié d'incrémenter ``i``, et donc la condition sera toujours vraie puisque la variable ``i`` restera à la valeur ``1``. Même si dans certains codes il est utile de créer des boucles infinies, celles-ci ne sont pas à utiliser dans la plupart des cas car elles utilisent intensément le processeur de votre ordinateur.

Question 3. Stop me.
--------------------

Modifiez le code à l'intérieur de la boucle ``while`` a l'aide d'une incrémentation de 1 afin de ne pas créer une boucle infinie.

.. code-block:: java

	int i = 0;
	while(i < 10)
	{
		//a remplir
	}


.. inginious:: CH4Q1_while_infinite

	//a remplir





Il est aussi fréquent qu'un programmeur oublie d'incrémenter la variable de boucle après avoir écrit le code à l'intérieur de la boucle.


.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>
