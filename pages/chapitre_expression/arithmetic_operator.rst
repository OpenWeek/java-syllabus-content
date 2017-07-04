============
Introduction
============

Ce chapitre traite des expressions. Un expression est un morceau de code qui représente ou calcule une valeur.
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
donne le premier entier inférieur au résultat réel (dans notre exemple , 3.5 est le résultat réel et 3 et le premier entier inférieur à 3.5).

Java possède également un opérateur qui permet d'obtenir le reste de la division entre deux **int**
Cet opérateur est noté "%" (à ne pas confondre avec l'opérateur division "/") et est appelé "modulo".
Si A et B sont deux entiers, A % B représente le reste de la division de A par B. Par exemple, 7%2 donnera 1
et 340 % 100 donnera 40. L'opérateur modulo permet, entre autres, de déterminer la parité d'un nombre. Si N est pair, N % 2 donnera 0
et si N est impair N % 2 donnera 1.

Enfin, il est a noté que l'opérateur de la soustraction peut aussi être utilisé avec un seul nombre pour obtenir le négatif de ce nombre.

Les deux lignes suivantes sont équivalentes :

.. code-block :: java

  int a = 0 - 12;
  int b = -12;
