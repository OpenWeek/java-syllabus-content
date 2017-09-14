.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)


============
Introduction
============

Dans ce chapitre et les suivants, nous allons introduire des **structures de contrôle** basiques.
Une structure de contrôle permet de contrôler l'exécution d'un bloc de lignes de code.
Ce chapitre abordera les structures de contrôle **conditionnelles**,
qui vont exécuter un bloc de code si une certaine condition booléenne est remplie.

==
if
==
Introduction
------------

L'instruction **if** est la structure de contrôle conditionnelle la plus basique,
qui va exécuter un bloc de code si une condition est vérifiée, c'est à dire si
l'expression booléenne entre ses parenthèses vaut `true`.

.. code-block:: java

    if( condition ) {
        // Séquence d'instructions
    }

La condition est une expression logique qui sera soit **true**, soit **false**.

Par exemple, le programme suivant affiche "42", car la condition **cond** est **true**.

.. inginious:: execute_java

    boolean cond = true;
    if(cond) {
        System.out.println("cond vaut true !"); //est affiché si cond vaut true
    }
    System.out.println("Toujours affiché");  // est toujours affiché, quelle que soit la valeur de cond

N'hésitez pas à modifier le code ci-dessus et à l'exécuter. Essayer par exemple
que seul ``"Toujours affiché"`` soit affiché lors de l'exécution du programme.


Vous remarquerez que l'instruction à l'intérieur du Bloc est décallée sur la droite.
Cette ligne de code est **indentée**, ce qui permet de distinguer clairement le code à l'intérieur de la boucle du code à l'extérieur.

L'exemple ci-dessous n'affiche rien du tout, car la condition **cond** est **false**,
les instructions situées à l'intérieur du **if** ne seront tout simplement **pas** exécutées !

.. inginious:: execute_java

    boolean cond = false;
    if(cond) {
        System.out.println(42); //n'est pas affiché
    }

Pour résumer, lorsque l'ordinateur exécute une instruction **if**, il évalue sa **condition**.
Si elle est vraie (``true``), il exécute le bloc de code séquentiellement, puis quitte le bloc pour exécuter la suite du programme.
Si la condition est fausse, l'ordinateur ignore le bloc de code et passe directement à la suite du programme.

Conditions
----------

La condition dans les parenthèses de l'instruction **if** peut être n'importe quelle expression booléenne,
comme par exemple les comparaisons et égalités arithmétiques.

Dans les exemples suivants, les conditions sont toutes vraies, et les phrases sont affichées par le ``System.out.println()`` :

.. inginious:: execute_java

    int age = 20;
    if( age >= 18 ) {
        System.out.println("Vous êtes majeur !"); //est affiché
    }

    int age = 20;
    if( 20 == age ) {
        System.out.println("Vous avez 20 ans !"); //est affiché
    }

Vous noterez les opérateurs ``==`` et ``>=`` qui sont des opérateurs dont le résultat est une valeur booléenne, c'est à dire une valeur de type ``boolean``. L'opérateur ``==`` donne la valeur ``true`` si ses opérandes (les valeurs à sa gauche et à sa droite) sont égales. Il donne la valeur ``false`` sinon. Par exemple, ``1 == 1`` donne la valeur ``true`` comme résultat, alors que le résultat de ``1 == 2`` est ``false``, car 1 n'est pas égal à 2.

Voici différents opérateurs que vous pouvez utiliser dans les parenthèses d'une insctruction ``if`` :

- ``==`` qui vaut ``true`` lorsque ses deux opérandes sont égales, ``false`` sinon.
- ``!=`` qui vaut ``true`` lorsque ses deux opérandes sont différentes, ``false`` sinon.
- ``>`` qui vaut ``true`` lorsque l'opérande de gauche est plus grande que l'opérande de droite, ``false`` sinon.
- ``>=`` qui vaut ``true`` lorsque l'opérande de gauche est plus grande ou égale à l'opérande de droite, ``false``
- ``<`` qui vaut ``true`` lorsque l'opérande de gauche est plus petite que l'opérande de droite, ``false`` sinon.
- ``<=`` qui vaut ``true`` lorsque l'opérande de gauche est plus petite ou égale à l'opérande de droite, ``false`` sinon.

Voici un exemple plus complet combinant ces nouveaux opérateurs et les opérateurs arithmétiques ``+``, ``-``, ``*`` et ``/`` que vous connaissez déjà :

.. inginious:: execute_java

    double litresDEssence = 49.5; // quantité d'essence actuellement dans mon réservoir
    int capaciteReservoir = 60;   // mon réservoir peut contenir jusque 60 litres d'essence

    if(litresDEssence == 0){
      System.out.println("Le réservoir est vide ! :-(");
    }

    if(litresDEssence < capaciteReservoir/4){
      System.out.println("Le réservoir contient moins d'un quart d'essence ! :-(");
    }

    if(litresDEssence <= capaciteReservoir/2){
      System.out.println("Le réservoir au moins à moitié vide ! :-(");
    }

    if(litresDEssence > capaciteReservoir/2){
      System.out.println("Le réservoir est plus d'à moitié plein ! :-)");
    }

    if(litresDEssence > 3.0/4*capaciteReservoir){
      System.out.println("Le réservoir est remplis de plus de trois quarts ! :-)");
    }



Exercice
--------

Modifiez la condition du code suivant pour que la variable booléenne **majeur** soit mise à la valeur **true**
uniquement si la variable int **age** est **plus grande ou égale à 18**.

.. inginious:: CH3Q1_condition

    if( age < 13 ) {
        majeur = true;
    }

If multiples
------------
Comme vous l'avez vu dans l'example avec le réservoir d'essence ci-dessus, il est possible d'avoir plusieurs **if** qui se suivent. Ils seront tous évalués les uns après les autres au fil du programme. Pour illustrer cela,
calculons le nombre de tickets d'entrée achetés par une cliente, selon le prix du ticket.
Si le prix est inférieur à 10, la cliente achète deux tickets. Par contre,
si le prix du ticket est supérieur ou égal à 10, la cliente n'en achète qu'un seul.

.. inginious:: execute_java

    int prix = 10;
    int tickets = 0;

    if (prix < 10) {
        tickets = 2;
    }
    if (prix >= 10) {
        tickets = 1;
    }
    System.out.println(tickets);

Dans cet exemple, la cliente achète 1 ticket. Lorsque plusieurs **if** sont utilisés, il faut veiller
à ce que toutes les conditions possibles soient testées. Prenons par exemple le code suivant :

.. inginious:: execute_java

    int age = 5; /* un entier entre 0 et 100 */
    boolean majeur;

    if (age < 18) {
        System.out.println("l'age est inférieur à 18");
        majeur = true;
    }
    if (age > 18) {
        System.out.println("l'age est supérieur à 18");
        majeur = false;
    }

Ce code comporte une erreur. En effet, il y a une valeur pour la variable **age** qui n'est pas testée, laquelle ? Répondez dans le cadre ci-dessous. Pour vous aider, vous pouvez modifier la valeur de la variable ``age`` dans le cadre ci-dessus et regarder ce que le programme affiche.

.. inginious:: CH3Q3_value_non_tested


Conditions complexes
--------------------

Les opérateurs booléens permettent de comparer deux variables booléennes. Il y en a trois :

-  l'opérateur AND, noté **&&** en java. Son résultat vaut ``true`` **si ses deux opérandes valent** ``true``. Son résultat vaut ``false`` sinon.
-  l'opérateur OR, noté **||** en java. Son résultat vaut ``true`` **au moins une de ses deux opérandes valent** ``true``. Son résultat vaut ``false`` sinon.
-  l'opérateur NOT, noté **!** en java. Il ne s'applique que sur une seule opérande et retourne sa négation. Par exemple, ``!false`` vaut ``true`` et ``!true`` vaut ``false``.

Ces opérateurs permettent de construire des conditions de ``if`` complexes,
en combinant plusieurs expressions booléennes.

.. inginious:: execute_java

    boolean chauve = true;
    int age = 20;
    if( chauve && 20 == age ) {
        System.out.println("Vous êtes un chauve de 20 ans !"); //est affiché
    }

La condition du bloc ci-dessus est composée de deux expressions logiques : **chauve** d'un côté et **20 == age** de l'autre.
Si ``chauve`` vaut ``true`` et que ``20 == age`` vaut ``true``, alors la condition du ``if`` est équivalente à ``true && true``. De par la définition de l'opérateur ``&&``, on sait que le résultat de ``true && true`` vaut ``true`` et que le programme rentrera donc dans le if et exécutera le code dans le bloc du ``if``.


====
else
====

l'instruction ``else`` est utilisée conjointement avec le ``if``,
elle exécutera son code si la condition "fournie" au ``if`` est ``false``.

.. code-block:: java

    if( condition ) {
        // Séquence d'instructions
    }
    else {
        // Séquence d'instructions
    }

C'est l'équivalent de dire que si la condition est vraie, alors le premier bloc de code est exécuté,
sinon c'est le deuxième bloc qui est exécuté. **Les deux blocs ne seront donc jamais exécutés conjointement, c'est soit l'un soit l'autre.**

.. inginious:: execute_java

    boolean cond = false;
    if(cond) {
        System.out.println("42"); //n'est pas affiché
    }
    else {
        System.out.println("43"); //est affiché
    }

Exercice
--------

Aux USA, on peut boire de l'alcool légalement à partir de 21 ans.  **Modifiez** donc condition du code suivant pour que la variable booléenne ``majeur`` soit mise à la valeur ``true``
uniquement si la variable ``age`` de type ``int`` est plus grande ou égale à 21, et ``false`` dans le cas contraire.

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

**Seul un bloc est exécuté**, ce qui veut dire que **si les conditions 1 et 2 sont vraies, seul le bloc 1 sera exécuté**.

.. inginious:: execute_java

    int taille = 185;
    if( taille < 130 ) {
        System.out.println("Vous êtes trop petit pour entrer !"); //n'est pas affiché
    }
    else if( taille < 190 ) {
        System.out.println("Maintenant c'est bon"); //est affiché
    }
    else if( taille < 200 ) {
        System.out.println("Ne vous cognez pas la tête !"); //n'est pas affiché, même si la condition est vraie
    }
    else {
        System.out.println("Vous êtes trop grand !"); //n'est pas affiché
    }
