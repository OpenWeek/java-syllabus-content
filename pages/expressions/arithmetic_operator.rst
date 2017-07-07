============
Introduction
============

Ce chapitre traite des expressions. Une expression est un morceau de code qui représente ou calcule une valeur.
Une expression peut être un litéral, une variable, un appel de fonction ou un ensemble de ces choses
combinées avec des opérateurs tels que + et >. La valeur d'une expression peut être assignée à une variable,
utilisée comme paramètre d'une sous-fonction ou combinée avec d'autres valeurs dans une expression plus compliquée.

========================
Opérateurs arithmétiques
========================

Les opérateurs arithmétiques comprennent l'addition, la soustraction, la multiplication et la division notés "+,-,* et /".
Ces opérations peuvent être utilisées sur toutes les valeurs numériques (byte, short, int, long, float et double).
Lorsque l'ordinateur calcule une de ces opérations, les deux valeurs qu'il combine doivent être du même type. Si ce
n'est pas le cas il convertira une des deux valeurs dans le type de l'autre. Par exemple, pour calculer 37.4 + 10,
l'ordinateur va convertir l'entier 10 en le réel 10.0. Cela s'appelle la conversion de type.

Lorsque deux types numériques du même type sont combinés, le résultat sera du même type.
Par exemple, si on multiplie deux **int**, on obtient un int. Il intéressant de remarquer que, comme
la division de deux **int** donne un **int**, 7/2 ne donnera pas 3.5 mais 3. La division de deux entiers
donne le premier entier inférieur au résultat réel (dans notre exemple, 3.5 est le résultat réel et 3 et le premier entier inférieur à 3.5).

Quand on combine des variables numériques de types différents, comme des entiers et des réels,
l'entier sera converti automatiquement en réel.

.. code-block:: java

    int a = 5;
    double b = 2;

    double c = a/b; // c vaut 2.5

Java possède également un opérateur qui permet d'obtenir le reste de la division entre deux **int**
Cet opérateur est noté "%" (à ne pas confondre avec l'opérateur division "/") et est appelé "modulo".
Si A et B sont deux entiers, A % B représente le reste de la division de A par B. Par exemple, 7%2 donnera 1
et 340 % 100 donnera 40. L'opérateur modulo permet, entre autres, de déterminer la parité d'un nombre. Si N est pair, N % 2 donnera 0
et si N est impair N % 2 donnera 1.

Enfin, il est a noté que l'opérateur de la soustraction peut aussi être utilisé avec un seul nombre pour obtenir le négatif de ce nombre.
Les deux lignes suivantes sont équivalentes :

.. code-block:: java

  int a = 0 - 12;
  int b = -12;

==================
Conversion de type
==================

Nous avons vu que quand deux variables de types différents étaient combinées,
l'une d'entre elle était automatiquement convertie en l'autre type, pour peu que les types soient compatibles.
Par exemple, en combinant un entier et un réel, l'entier sera  automatiquement converti en réel, mais pas l'inverse.

Il est néanmoins possible de convertir une variable d'un type compatible à l'autre, cette opération porte le nom de **"type casting"**.
En pratique, cela consiste à mettre le type désiré de la variable entre parenthèses avant l'expression que l'on souhaite convertir.
Il est important de préciser que "caster" une expression ne modifie pas le type ou la valeur des variables qui la composent, mais uniquement son résultat.

Le code ci-dessous illustre quelques exemples de **cast** :

.. code-block:: java

    double a = 1.9;
    int b = (int) a; // b vaut 1, a vaut toujours 1.9
    // Caster un double en int revient à "enlever" les chiffres après la virgule, la variable a n'a pas été modifiée

    double c = 4.2;
    double d = (int) c; // d vaut 4.0
    // Ici, la valeur de c est castée en int et devient 4, puis est de nouveau castée automatiquement en double et devient 4.0

    double e = 2.5;
    int f = 4;
    int g = (int) ( e * f ); // g vaut 10, puisque le cast va arrondir le résultat de e * f, qui est déjà 10
    int h = ( (int) e ) * f; // h vaut 8, parce que e a été arrondi par le cast avant la multiplication avec f
    // Il est important de vérifier sur quelle partie de l'expression le cast est effectué

===================
Opérateurs logiques
===================



======================
Opérateurs d'itération
======================
