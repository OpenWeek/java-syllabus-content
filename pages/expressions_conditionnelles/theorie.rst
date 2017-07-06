.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)


============
Introduction
============

Dans ce chapitre et les suivants, nous allons introduires des **structures de contrôle** basiques.
Une structure de contrôle permet de contrôler l'exécution d'un bloc de lignes de code.

Ce chapitre abordera les structures de contrôle **conditionnelles**,
qui vont exécuter un bloc de code si une certaine condition booléenne est remplie.

*Remarque : dans les exemples de code ci-dessous, on considère que la fonction* **print()** *permet d'afficher du texte.*

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

Par exemple, le programme suivant affiche "42", car la condition **cond** est **true**.

.. code-block:: java

    boolean cond = true;
    if(cond) {
        print("42"); //est affiché
    }

Vous remarquerez que l'instruction à l'intérieur du Bloc est décallée sur la droite.
Cette ligne de code est **indentée**, ce qui permet de distinguer clairement le code à l'intérieur de la boucle du code à l'extérieur.

L'exemple ci-dessous n'affiche rien du tout, car la condition **cond** est **false**,
les instructions situées à l'intérieur du **if** ne seront tout simplement **pas** exécutées !

.. code-block:: java

    boolean cond = false;
    if(cond) {
        print("42"); //n'est pas affiché
    }

Pour résumer, lorsque l'ordinateur exécute une instruction **if**, il évalue sa **condition**.
Si elle est vraie, il exécute le bloc de code séquentiellement, puis quitte le bloc pour exécuter la suite du programme.
Si la condition est fausse, l'ordinateur ignore le bloc de code et passe directement à la suite du programme.

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
    print(tickets);

Dans cet exemple, la cliente achète 1 ticket.

Conditions
----------

La condition "fournie" à l'instruction **if** peut être n'importe quelle expression booléenne,
comme par exemple les comparaisons et égalités arithmétiques.

Dans les exemples suivants, les conditions sont toutes vraies, et les phrases sont affichées par le "print" :

.. code-block:: java

    int age = 20;
    if( age >= 18 ) {
        print("Vous êtes majeur !"); //est affiché
    }

    int age = 20;
    if( age == 20 ) {
        print("Vous avez 20 ans !"); //est affiché
    }


Exercice
--------

.. inginious:: syllabus-Cond01

    /* Insert your code here */


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
    if( chauve && age == 20 ) {
        print("Vous êtes un chauve de 20 ans !"); //est affiché
    }

La condition du bloc ci-dessus est composée de deux expressions logiques : **chauve** d'un côté et **age == 20** de l'autre.
Si **chauve** vaut true et que **age == 20** vaut true, alors la condition du **if** est équivalente à **true && true**.


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
        print("42"); //n'est pas affiché
    }
    else {
        print("43"); //est affiché
    }

Exercice
--------

=======
else if
=======

L'instruction **else if** permet de tester plusieurs conditions, l'une après l'autre, dans une même structure de contrôle.
Les conditions sont testées dans l'ordre, jusqu'à ce qu'une soit vraie, ou qu'on atteigne le **else**.

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
        print("Vous êtes trop petit pour entrer !"); //n'est pas affiché
    }
    else if( taille < 190 ) {
        print("Maintenant c'est bon"); //est affiché
    }
    else if( taille < 200 ) {
        print("Ne vous cognez pas la tête !"); //n'est pas affiché, même si la condition est vraie
    }
    else {
        print("Vous êtes trop grand !"); //n'est pas affiché
    }

Exercice
--------


=========
Exercices
=========

.. inginious:: syllabus-test

  /*
   * Test
   */
   public static void main(string[] args) {
       /*test*/
   }


.. raw:: html

 <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
 <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
 <script type="text/javascript" src="static/js/rst-form.js"></script>
 <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

 <script type="text/javascript">$nmbr_prop = 3</script>

Structures de contrôle : QCM
----------------------------
