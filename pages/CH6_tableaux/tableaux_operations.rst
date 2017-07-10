.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez

============
Les Tableaux
============
-------------------------
Opérations sur un tableau
-------------------------

Afin d'effectuer des opérations sur un tableau, on utilise généralement des boucles.

Par exemple, pour imprimer le contenu d'un tableau ``tab``, il suffit d'utiliser une boucle *for* :

.. code-block:: Java

    for (int i = 0; i < tab.length; i++) {  (3)
        System.out.println( tab[i] );
    }

À la ligne (3), on remarque deux choses :

* on commencer l'index ``i`` à 0 ;
* la condition sur ``i`` est bien ``< tab.length`` et pas ``<= tab.length``.

Ceci est du au fait que l'index d'un tableau commence toujours à 0 et se termine à ``tab.length - 1``.

Une autre manière est d'utiliser une boucle *for-each* :

.. code-block:: Java

    for (int i : tab) {          // (4)
        System.out.println( i );
    }

La ligne (4) peut-être lue comme : «pour chaque entier i dans le tableau tab faire ceci».

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez
