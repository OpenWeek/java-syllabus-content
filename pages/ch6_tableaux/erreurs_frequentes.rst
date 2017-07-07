.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez

============
Les Tableaux
============
------------------
Erreurs fréquentes
------------------


Les erreurs suivantes sont récurrentes lors de l'utilisation de boucles ``for``
et ``while`` avec des listes et de tableaux :

* Les indexes d'un tableau commencent à 0 et pas à 1 (e.g. pour ``tab = {1, 2, 3}``, ``tab[0]`` est ``'1'``)

* Le dernier index d'un tableau de length ``n`` est ``n - 1`` et pas ``n`` (c'est la fameuse exception ``ArrayOutOfBoundsException``)

* Les conditions de terminaisons dans une boucle while

* Les conditions limites

.. QCM
    ---


.. Misconceptions, unfamiliarity, and difficulties with lists and arrays are magnified in a loop environment. Common errors are related to indexing and include

    Indexing starting at 0 versus 1 (e.g., for mystr = ‘123’,  mystr[0] is ‘1’ and mystr[1] is ‘2’)
    Incorrect use or not understanding the termination condition in while loops.
    Mistakes in the boundary conditions. This includes not properly handling cases where inputs are negative or zero, lists, arrays, or empty strings.
    Fencepost Errors. If we build a straight fence 30 meters long with posts spaced 3 meters apart, how many posts do we need? The intuitive answer of 10 is wrong. The fence has 10 sections, but 11 posts.  These types of “fencepost errors” are common when using arrays or lists in loops. Counting things rather than the spaces between them, or vice versa, or neglecting to consider whether one should count one or both ends of a row leads to execution errors or incorrect results. Test fence post conditions explicitly to ensure correctness.

.. Material covered in the data structure videos provide additional examples and situations students should master.
