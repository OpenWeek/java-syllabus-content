.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. name: Viens faire un qcm!

.. This file is an example of MCQ.

.. These scripts are needed for executing the mcq

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

  <script type="text/javascript">$nmbr_prop = 3</script>


.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez

============
Les Tableaux
============
--------------
Théorie et QCM
--------------

Initialiser un tableau
----------------------

Un tableau est une structure de données que l'on peut représenter par un nombre
de cases. Chaque case peut contenir une donnée de type primitif
(``boolean``, ``int``, ...) ou un objet (vous verrez plus en détails les objets dans une section ultérieure). Par exemple on peut
stocker des entiers dans un tableau de ``int`` :


Un tableau est caractérisée par sa taille, qui est le nombre de cases pouvant
contenir chacune une donnée et par le type de données qu'elles contiennent.
En ``Java``, un tableau contient que des éléments du même type.


Voici la syntaxe pour initialiser un tableau vide contenant des données de
type ``TYPE`` et ayant une taille ``TAILLE`` :

.. raw:: html

    <div align="center">
    <img  src="data:image/png;base64,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" alt="Représentation d'un tableau" title = "hello"/>
    </div>

.. code-block:: Java

  TYPE[] nom = new TYPE[TAILLE];  // (1)

On peut aussi écrire l'initialisation comme :

.. code-block:: Java

  TYPE nom[] = new TYPE[TAILLE]; // (2)

Par simplicité, nous utiliserons que la syntaxe en (1).

Pour remplir ce tableau de données, nous utilisons l'indice de la case que l'on veut remplir.
L'indice d'une donnée est le numéro de la case du tableau qui contient cette donnée.
L'indice commence à 0 et va jusqu'à ``TAILLE``-1, c'est-à-dire que la première case est à l'indice 0, la deuxième à l'indice 1, ..., et la dernière à l'indice TAILLE-1.

.. code-block:: Java

  nom[INDICE] = VALEUR;

Il est également possible d'initialiser un tableau non-vide de taille ``n,`` contenant un ensemble d'éléments de type ``TYPE`` E0, E1, ..., En :


.. code-block:: Java

  TYPE[] nom = {E0, E1, ..., En};

Les deux exemples suivants sont donc équivalents :


.. code-block:: Java

  int[] tab = {11, 12, 13}; // le tableau tab est un tableau de 3 éléments, le premier est 11, le deuxième est 12, le troisième est 13


.. code-block:: Java

  int[] tab = new int[3];
  tab[0] = 11; // le premier élément du tableau tab devient 11
  tab[1] = 12; // le deuxième élément du tableau tab devient 12
  tab[3] = 13; // le troisième élément du tableau tab devient 13


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

Par défaut, si aucune valeur n'est assignée au cases d'un tableau, Java initialise les valeurs du tableau en fonction du type de données. Voici un tableau des valeurs par défaut en fonction de quelques type de données :

.. class:: center

    +-------------+--------------------+
    | Tableaux de | Valeurs par défaut |
    +=============+====================+
    | ``int``     | ``0``              |
    +-------------+--------------------+
    | ``float``   | ``0.0f``           |
    +-------------+--------------------+
    | ``boolean`` | ``false``          |
    +-------------+--------------------+
    | ``char``    | ``'\u0000'``       |
    +-------------+--------------------+
    | ``String``  | ``null``           |
    +-------------+--------------------+

Pour plus de détails, se référer à la Javadoc [1]_.

Tableaux multidimensionnels
---------------------------

Un tableau multidimensionnel est un tableau avec au moins un autre tableau dedans. Par exemple, un tableau vide à 2 dimensions s'initialise comme ceci :

.. code-block:: Java

  TYPE[][] nom = new TYPE[HAUTEUR][LARGEUR];

Tableaux et boucles
-------------------

.. [1] https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez
