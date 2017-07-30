.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Maxime Mulamba
    Antoine Lambot

============
Introduction
============

Dans ce chapitre et les suivants, nous allons introduires des **structures de contrôle** basiques.
Une structure de contrôle permet de contrôler l'exécution d'un bloc de lignes de code.
Ce chapitre abordera les structures de contrôle **conditionnelles**,
qui vont exécuter un bloc de code si une certaine condition booléenne est remplie.

*Remarque : dans les exemples de code ci-dessous, on considère que la fonction* **afficher()** *permet d'afficher du texte.*

==
if
==
Introduction
------------

L'instruction **if** est la structure de contrôle conditionnelle la plus basique,
qui va exécuter un bloc de code si une condition est vérifiée.

.. code-block:: java

    if( condition ) {
        // Séquence d'instructions
    }

La condition est une expression logique qui sera soit **true**, soit **false**.

Par exemple, le programme suivant affiche "42", car la condition **cond** est **true**.

.. code-block:: java

    boolean cond = true;
    if(cond) {
        afficher("42"); //est affiché
    }

Vous remarquerez que l'instruction à l'intérieur du Bloc est décallée sur la droite.
Cette ligne de code est **indentée**, ce qui permet de distinguer clairement le code à l'intérieur de la boucle du code à l'extérieur.

L'exemple ci-dessous n'affiche rien du tout, car la condition **cond** est **false**,
les instructions situées à l'intérieur du **if** ne seront tout simplement **pas** exécutées !

.. code-block:: java

    boolean cond = false;
    if(cond) {
        afficher("42"); //n'est pas affiché
    }

Pour résumer, lorsque l'ordinateur exécute une instruction **if**, il évalue sa **condition**.
Si elle est vraie, il exécute le bloc de code séquentiellement, puis quitte le bloc pour exécuter la suite du programme.
Si la condition est fausse, l'ordinateur ignore le bloc de code et passe directement à la suite du programme.

Conditions
----------

La condition "fournie" à l'instruction **if** peut être n'importe quelle expression booléenne,
comme par exemple les comparaisons et égalités arithmétiques.

Dans les exemples suivants, les conditions sont toutes vraies, et les phrases sont affichées par le "**afficher**" :

.. code-block:: java

    int age = 20;
    if( age >= 18 ) {
        afficher("Vous êtes majeur !"); //est affiché
    }

    int age = 20;
    if( 20 == age ) {
        afficher("Vous avez 20 ans !"); //est affiché
    }


Exercice
--------

Modifiez la condition du code suivant pour que la variable booléenne **majeur** soit mise à la valeur **true**
uniquement si la variable int **age** est plus grande ou égale à 21.

.. inginious:: CH3Q1_condition

    if( age < 13 ) {
        majeur = true;
    }

If multiples
------------
Il est possible d'avoir plusieurs **if** qui se suivent. Pour illustrer cela,
calculons le nombre de tickets d'entrée achetés par une cliente, selon le prix du ticket.
Si le prix est inférieur à 10, la cliente achète deux tickets. Par contre,
si le prix du ticket est supérieur ou égal à 10, la cliente n'en achète qu'un seul.

.. code-block:: java

    int prix = 10
    int tickets = 0;

    if (prix < 10) {
        tickets = 2;
    }
    if (prix >= 10) {
        tickets = 1;
    }
    afficher(tickets);

Dans cet exemple, la cliente achète 1 ticket. Lorsque plusieurs **if** sont utilisés, il faut veiller
à ce que toutes les conditions possibles soient testées. Prenons par exemple le code suivant :

.. code-block:: java

    int age = /* un entier entre 0 et 100 */
    boolean majeur;

    if (age < 18) {
        majeur = true;
    }
    if (age > 18) {
        majeur = false;
    }

Ce code comporte une erreur. En effet, il y a une valeur pour la variable **age** qui n'est pas testée, laquelle ?

.. inginious:: CH3Q3_value_non_tested


Conditions complexes
--------------------

Les opérateurs booléens permettent de comparer deux variables booléennes. Il y en a trois :

-  l'opérateur AND, noté **&&** en java
-  l'opérateur OR, noté **||** en java
-  l'opérateur NOT, noté **!** en java

Ces opérateurs permettent de construire des conditions de if complexes,
en combinant plusieurs expressions booléennes.

.. code-block:: java

    boolean chauve = true;
    int age = 20;
    if( chauve && 20 == age ) {
        print("Vous êtes un chauve de 20 ans !"); //est affiché
    }

La condition du bloc ci-dessus est composée de deux expressions logiques : **chauve** d'un côté et **20 == age** de l'autre.
Si **chauve** vaut true et que **20 == age** vaut true, alors la condition du **if** est équivalente à **true && true**.


====
else
====

l'instruction **else** est utilisée conjointement avec le **if**,
elle exécutera son code si la condition "fournie" au **if** est **false**.

.. code-block:: java

    if( condition ) {
        // Séquence d'instructions
    }
    else {
        // Séquence d'instructions
    }

C'est l'équivalent de dire que si la condition est vraie, alors le premier code est exécuté,
sinon c'est le deuxième code qui est exécuté.

.. code-block:: java

    boolean cond = false;
    if(cond) {
        afficher("42"); //n'est pas affiché
    }
    else {
        afficher("43"); //est affiché
    }

Exercice
--------

Modifiez la condition du code suivant pour que la variable booléenne **majeur** soit mise à la valeur **true**
uniquement si la variable int **age** est plus grande ou égale à 18, et **false** dans le cas contraire.

.. inginious:: CH3Q2_else

    if( 10 > age ) {
        majeur = true;
    }
    else {
        majeur = false;
    }

=======
else if
=======

L'instruction **else if** permet de tester plusieurs conditions, l'une après l'autre, dans une même structure de contrôle.
Les conditions sont testées dans l'ordre, jusqu'à ce qu'une soit vraie, ou qu'on atteigne le **else**.
Si aucune des conditions n'est vraie, alors c'est le code du bloc "**else**" qui sera exécuté.

.. code-block:: java

    if( condition1 ) {
        // Bloc 1
    }
    else if( condition2 ) {
        // Bloc 2
    }
    else if( condition3 ) {
        // Bloc 3
    }
    else {
        // Bloc 4
    }

Seul un bloc est exécuté, ce qui veut dire que si les conditions 1 et 2 sont vraies, seul le bloc 1 sera exécuté.

.. code-block:: java

    int taille = 185;
    if( taille < 130 ) {
        afficher("Vous êtes trop petit pour entrer !"); //n'est pas affiché
    }
    else if( taille < 190 ) {
        afficher("Maintenant c'est bon"); //est affiché
    }
    else if( taille < 200 ) {
        afficher("Ne vous cognez pas la tête !"); //n'est pas affiché, même si la condition est vraie
    }
    else {
        afficher("Vous êtes trop grand !"); //n'est pas affiché
    }
