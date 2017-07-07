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

.. inginious:: CH6Q1

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

.. inginious:: CH6Q2

    /* code a completer */

Question 3 : Multiplication de matrices
---------------------------------------

Dans cette question, on s'intéresse à l'écriture d'une fonction dont le but est de renvoyer la matrice résultat de la multiplication de deux matrices ``l`` et ``m``. Ces deux matrices sont stockées chaqu'une dans un tableau de tableau, passées en paramètres de la fonction à implémenter.

En programation défensive, écrivez ici le corps de la fonction ``multiplication`` qui retourne le résultat de la multiplication.

.. code-block:: java

    /**
     * @pre: l et m sont de dimensions compatibles pour être multipliées
     * @post: retourne le résultat de l.m
     */
    public static int[][] multiplication(int l[][], int m[][]){
        /* Code a complèter */
    }

.. inginious:: CH6Q3

    /* code a completer */

Question 4 : Mélange d''un tableau
----------------------------------

Dans cette question, on s'intéresse à l'écriture d'une méthode dont le but est de mélanger les éléments de manière aléatoire d'un tableau passé en paramètre.

Par exemple ``[1 2 3 4]`` peut devenir ``[2 3 4 1]``.

En programmation défensive, écrivez ici le corps de la méthode ``shuffle`` permettant d'inverser un tableau d'entier.

.. code-block:: java

    /**
     * @pre: tab != null
     * @post: le tableau tab est mélanger
     */
    public static void shuffle(int tab[]) {
        // code à completer
    }

.. inginious:: CH6Q4

    /* code a completer */

Question 5 : Question de Bilan Final
---------------------------------------

Dans cette question de bilan final, on va s'intéresser à l'écriture de méthodes dont le but est de modifier les éléments d'un tableau passé en paramètre. Le but de ces méthodes est de déplacer tous les éléments du tableau d'un certain nombre de cases vers la droite.

Commençons par la méthode ``shiftRightOne``. Elle va décaler tous les éléments du tableau passé en paramètre, d'une case vers la droite.

Ensuite, vous devez écrire une méthode ``shiftRight`` qui déplace tous les éléments d'un tableau, vers la droite, d'un certain nombre *n* de positions.

N'oubliez pas d'éviter la duplication de code, et d'éventuellement réutiliser l'une des deux méthodes dans l'autre.

Complétez ici le corps de la méthode ``shiftRightOne``.

.. code-block:: java

    /**
     * @pre tab != null
     * @post Le tableau tab a été modifié et tous ses éléments sont décalés
     *       d'une position vers la droite (le dernier élément revenant
     *       en première position)
     */
    public static void shiftRightOne (int[] tab) {
        /* Code a complèter */
    }

.. inginious:: CH6Q5

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

.. inginious:: CH6Q6

    /* code a completer */

.. author::

    Arnaud Gellens, Pablo Gonzalez Alvarez, Antoine Habran, François Michel
