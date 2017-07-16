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

Question 1 - Tableaux ordonnés
-------------------------------

Laquelle des suites d'instructions ci-dessous est une implémentation correcte de la spécification suivante :

.. code-block:: java

 /**
  * @pre  t est un tableau contenant au moins un élément
  * @post retourne true si les données du tableau t sont en ordre
  *       décroissant, false sinon
  */
  public static boolean decroissant(double[] t)
  {
    // corps à inclure
  }

.. class:: positive-multiple

    -
            .. code-block:: java

               if(t.length==1) {
                   return true;
               }
               for(int i=1;i<t.length;i++) {
                 if (t[i-1] <= t[i]) {
                       return false;
                 }
               }
               return true;

    -
            .. code-block:: java

               if(t.length==1) {
                   return true;
               }
               for(int i=t.length-1;i>=1;i=i-1) {
                 if (t[i-1] <= t[i]) {
                       return false;
                 }
               }
               return true;

.. class:: negative-multiple

    -
        .. code-block:: java

           if(t.length==1) {
               return true;
           }
           for(int i=0;i<t.length;i++) {
             if (t[i-1] <= t[i]) {
                   return false;
             }
           }
           return true;
        .. class:: comment-feedback

            Que se passe-t-il lors du premier passage dans la boucle ``for`` avec un tableau ``t`` contenant ``{ 1.0, 2.0 }`` ? ``i`` vaut ``0``, quel est la valeur de ``t[0-1]`` ?

    -
        .. code-block:: java

           if(t.length==1) {
               return true;
           }
           for(int i=t.length;i>=1;i=i-1) {
             if (t[i-1] <= t[i]) {
                   return false;
             }
           }
           return true;

        .. class:: comment-feedback

            Que se passe-t-il lors du premier passage dans la boucle ``for`` avec un tableau ``t`` contenant ``{ 1.0, 2.0 }`` ? ``i`` vaut ``t.length``, quel est la valeur de ``t[i]`` ?

    -
        .. code-block:: java

           if(t.length==1) {
               return true;
           }
           for(int i=1;i<t.length;i++) {
             if (t[i-1] <= t[i]) {
                return false;
             }
             else  {
               return true;
             }
           }
           return true;

        .. class:: comment-feedback

            Cette méthode teste-t-elle vraiment l'entièreté du tableau ? Combien de fois passe-t-elle dans la boucle ``for`` ?

    -
        .. code-block:: java

           if(t.length==1) {
               return true;
           }
           for(int i=t.length-1;i>=1;i=i-1) {
             if (t[i-1] <= t[i]) {
                return false;
             }
             else {
                return true;
             }
           }
           return true;

        .. class:: comment-feedback

            Cette méthode teste-t-elle vraiment l'entièreté du tableau ? Combien de fois passe-t-elle dans la boucle ``for`` ?


Question 2 - Somme des éléments d'un tableau
---------------------------------------------

Laquelle des implémentations suivantes est-elle une implémentation correcte de la méthode ``sumTab`` dont la spécification est reprise ci-dessous :

.. code-block:: java


  /*
   * @pre tableau contenant au moins un élément
   * @post retourne la somme des valeurs stockées dans le tableau
   */
  public static double sumTab(double[] t)

.. class:: positive-multiple

    -

        .. code-block:: java

          double sum=0.0;
          for(int i=0;i<t.length;i++) {
            sum=sum+t[i];
          }
          return sum;
    -

        .. code-block:: java

          double sum=0.0;
          for(int i=t.length-1;i>=0;i=i-1) {
            sum=sum+t[i];
          }
          return sum;

.. class:: negative-multiple

    -
        .. code-block:: java

          double sum=0.0;
          for(int i=0;i<t.length;i++) {
           for(int j=0;j<t[i].length;j++) {
            sum=sum+t[i];
           }
          }
          return sum;

        .. class:: comment-feedback

            Ce code est utilisable pour calculer la somme des éléments d'un tableau à deux dimensions, mais le tableau ``t`` qui est passé comme paramètre effectif à la méthode est un tableau à une seule dimension. Ce code ne compilera pas dans la méthode ``sumTab``.
    -
        .. code-block:: java

          double sum=0.0;
          for(int i=t.length-1;i>=0;i=i-1) {
           for(int j=0;j<t[i].length;j++) {
            sum=sum+t[i];
           }
          }
          return sum;

        .. class:: comment-feedback

            Ce code est utilisable pour calculer la somme des éléments d'un tableau à deux dimensions, mais le tableau ``t`` qui est passé comme paramètre effectif à la méthode est un tableau à une seule dimension. Ce code ne compilera pas dans la méthode ``sumTab``.
    -
        .. code-block:: java

           double sum=0.0;
           for(int i=0;i<=t.length;i++) {
             sum=sum+t[i];
           }
           return sum;
        .. class:: comment-feedback

            Ce code provoquera une erreur à l'exécution. Il n'y a pas d'élément dans le tableau ``t`` à l'indice ``t.length``. L'indice le plus élevé du tableau est ``t.length-1``.

.. This line include the "check your answer" button that gives a note to the student and mark questions with the
    correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez
