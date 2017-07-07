.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Arnaud Gellens, Pablo Gonzalez Alvarez, Antoine Habran, François Michel

============
Les Tableaux
============
---------
Exercices
---------


Question 1 : Sommes des éléments d'un tableau
---------------------------------------------

On vous donne le tableau tab en argument, et on vous demande de compléter la fonction ``Sum(int[]tab)`` qui a pour but de retourner un nouveau tableau contenant à l'indice ``i`` la somme des éléments ``1`` à ``i``. **Vous ne pouvez utiliser qu'une seule boucle itérative pour mener a bien cette question**

Exemple :

* ``Sum([1,2,3,4,5])`` retourne ``[1,3,6,10,15]``
* ``Sum([6,2,8,3])`` retourne ``[6,8,16,19]``

Écrivez le corps de la fonction ``SumTab(int[] tab)`` (pensez aux cas limites) :

.. code-block:: java

    /**
     * @pre : tab un tableau d'entier
     * @post: renvoie un nouveau tableau d'entier tel qu'a l'indice i, il y ait
     *        la somme des éléments 1 a i de tab.
     *        Si tab est null, renvoie null,
     *        si tab est vide, renvoie un tableau vide
     */
    public static int[] Sum(int[] tab) {
        /* code a completer */
    }

.. inginious:: ch6q1

    /* code a completer */

Question 2 : Inversion de tableau
---------------------------------

Dans cette question, on s'intéresse à l'écriture d'une méthode dont le but est d'inverser les éléments d'un tableau passé en paramètre, c'est-à-dire que le premier élement deviendra le dernier, le deuxième l'avant dernier, etc.

Par exemple ``[1 2 3 4]`` devient ``[4 3 2 1]``.

Écrivez ci-dessous le corps de la méthode ``inverse`` permettant d'inverser un tableau d'entier, en utilisant de la programation défensive.

.. code-block:: java

    /**
     * @pre: tab != null
     * @post: le tableau tab est inverse
     */
    public static void inverse(int tab[]) {
        /* Code à compléter */
    }

.. inginious:: ch6q2

    /* code a completer */

Question 3 :
---------------------------------------


.. inginious:: ch6q3

    /* code a completer */

Question 4 :
---------------------------------------


.. inginious:: ch6q4

    /* code a completer */

Question 5 :
---------------------------------------


.. inginious:: ch6q5

    /* code a completer */


Question 6 : Tableaux à deux dimensions
---------------------------------------

Un tableau à deux dimensions peut représenter l'équivalent d'une matrice en mathématiques.
On vous donne en argument le tableau ``tab`` qui est un tableau de ``int`` à deux dimensions. Ce tableau représente donc une matrice carrée (la longueur des sous-tableaux est égale à la longueur du tableau).
Vous devez compléter la fonction ``Transpos()` ` qui retourne dans un nouveau tableau la matrice de ``tab`` transposée.

Exemple :

* ``Transpos([[1,2],[3,4]])`` retourne ``[[1,3][2,4]]``.
* ``ranspos([[1,2,3],[4,5,6],[7,8,9]])`` retourne ``[[1,4,7],[2,5,8],[3,6,9]]``.

Écrivez le corps de la fonction ``Transpos(int[][] tab)`` :

.. code-block:: java

    /**
     * @pre : tab un tableau d'entier a deux dimensions dont
     *        la longueur de chaque sous tableau est egale a
     *        la longueur du tableau (pour tout i compris
     *        entre 0 et tab.length-1,
     *        tab.length = tab[i].length)
     * @post : retourne un tableau de dimensions egales a celles
     *         de tab, qui contient la matrice represente par
     *         tab, mais transposee
     *         si tab est null, renvoie null,
     *         si tab est vide, renvoie un tableau vide
     */
    public static int[][] Transpos (int[][] tab){
        /* code a completer */
    }

.. inginious:: ch6q6

    /* code a completer */

.. author::

    Arnaud Gellens, Pablo Gonzalez Alvarez, Antoine Habran, François Michel
