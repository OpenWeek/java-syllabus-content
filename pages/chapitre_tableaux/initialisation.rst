.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez

=============
Tableaux Java
=============
-------------------------
Initialiser un tableau
-------------------------
Un tableau est une structure de données que l'on peut representer par un nombre
de cases. Chaque case peut contenir des données de types primitifs
(``boolean``, ``int``, ...) ou des objets. Par exemple on peut
stocker des entiers dans un tableau de ``int`` :


Un tableau est caractérisée par sa taille, qui est le nombre de cases pouvant
contenir chacune une donnée, et par le type de données qu'elles contiennent.
En Java, un tableau contient que des éléments du même type.


Voici la syntaxe pour initialiser un tableau vide contenant des données de
type TYPE et ayant une taille TAILLE :


.. code-block:: Java

  TYPE nom[] = new TYPE[TAILLE];

Pour remplir ce tableau de données, nous utilisons l'indice de la donnée
Il est également possible d'initialiser un tableau non-vide de taille n, contenant un ensemble d'éléments de type TYPE E0,E1,...,En :


.. code-block:: Java

  TYPE nom[] = {E0,E1,...,En};

Les deux exemples suivants sont donc équivalents :


.. code-block:: Java

  int tab[] = {11, 12, 13}; // le tableau tab est un tableau de 3 éléments, le premier est 11, le deuxième est 12, le troisième est 13


.. code-block:: Java

  int tab[]=new int[3];
  tab[0]=11 // le premier élément du tableau tab devient 11
  tab[1]=12 // le deuxième élément du tableau tab devient 12
  tab[3]=13 // le troisième élément du tableau tab devient 13


.. code-block:: Java

        /*
         * Un programme qui initialise un tableau vide de 5 entiers
         */
         public class Tableau {
             public static void main (String[] args) {
                 // affiche à l’écran
                 int[] tab = new int[5];
             } // fin de main
         } // fin de la classe Tableau

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez
