.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez, Antoine Habran

============
Les Tableaux
============
---------
Exercices
---------


Question 1 : Sommes des éléments d'un tableau
---------------------------------------------

On vous donne le tableau tab en argument, et on vous demande de compléter la fonction ``Sum(int[]tab)`` qui a pour but de retourner un nouveau tableau contenant à l'indice i la somme des éléments 1 à i. **Vous ne pouvez utiliser qu'une seule boucle iterative pour mener a bien cette question**

Exemple :

* ``Sum([1,2,3,4,5])`` retourne ``[1,3,6,10,15]``
* ``Sum([6,2,8,3])`` retourne ``[6,8,16,19]``

Ecrivez le corps de la fonction ``SumTab(int[] tab)``
(pensez aux cas limites) :

.. code-block:: java

    /* pre : tab un tableau d'entier
     * post: renvoie un nouveau tableau d'entier tel qu'a
     * l'indice i, il y ait la somme des éléments 1 a i de tab.
     * si tab est null, renvoie null,
     * si tab est vide, renvoie un tableau vide
     */
    public static int[] Sum(int[] tab) {
        /* code a completer */
    }

.. inginious:: ch6q1

    /* code a completer */
