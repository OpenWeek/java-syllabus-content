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
---------------------------
Tableaux multidimensionnels
---------------------------

Un tableau multidimensionnel est un tableau avec au moins un autre tableau dedans. Par exemple, un tableau vide à 2 dimensions s'initialise comme ceci :

.. code-block:: Java

  TYPE[][] nom = new TYPE[HAUTEUR][LARGEUR];

Un tableau à 2 dimensions est en fait un tableau dans lequel chaque case est un tableau. Ce qui donne le schéma suivant :

.. raw:: html

    <div align="center">
    <img  src="data:image/png;base64,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" alt="Représentation d'un tableau à deux dimensions" title = "Représentation d'un tableau à deux dimensions"/>
    </div>
    <br>

QCM
---

Question 1 - Tableaux à plusieurs dimensions
---------------------------------------------

Outre les tableaux à une dimension, Java supporte également des tableaux à plusieurs dimensions. Laquelle des déclarations ci-dessous est-elle un tableau à plusieurs dimensions qui permet de stocker exactement 24 nombres entiers ?


.. class:: positive-multiple

    -

        .. code-block:: java

           int[][] t = new int[4][6];

        .. class:: comment-feedback

            Ce tableau à deux dimensions comprend 4 lignes et 6 colonnes.

    -
        .. code-block:: java

               int[][] t = new int[3][8];

        .. class:: comment-feedback

            Ce tableau à deux dimensions comprend 3 lignes et 8 colonnes.

.. class:: negative-multiple

    -
        .. code-block:: java

               int[][] t = new int[2][4];

        .. class:: comment-feedback

            Ce tableau à deux dimensions comprend 2 lignes et 4 colonnes.
    -
        .. code-block:: java

               int[][] t = new int[24];

        .. class:: comment-feedback

            Cette ligne est erronée. La référence déclarée à gauche est vers un tableau de tableaux alors que seul un tableau d'entiers est créé dans le membre de droite.
    -
        .. code-block:: java

               int[] t = new int[3][8];

        .. class:: comment-feedback


            Cette ligne est erronée. La référence déclarée à gauche est vers un tableau alors qu'un tableau de tableaux d'entiers est créé dans le membre de droite.

    -
        .. code-block:: java

               int[][] t = new int[2][4];

        .. class:: comment-feedback

            Le tableau créé a deux lignes et 4 colonnes. Il ne permet donc pas de stocker 24 nombres entiers.

Question 2 - Initialisation de tableaux à deux dimensions
----------------------------------------------------------

Considérons un tableau à deux dimensions initialisé comme suit :

.. code-block:: java

 int[][] tab = { {1,2,3},
                 {4,5}
                };

Laquelle des expressions booléennes ci-dessous est-elle vraie ?

.. class:: positive-multiple

    -
        .. code-block:: java

            (tab[0].length==3) && (tab[1][1]==5)

    -
        .. code-block:: java

            (tab.length==2) && (tab[0][2]==3)

.. class:: negative-multiple

    -
        .. code-block:: java

               (tab.length==1) && (tab[1][1]==4)

        .. class:: comment-feedback


            ``tab.length`` est le nombre de lignes du tableau ``tab``, c'est-à-dire ``2``.

    -
        .. code-block:: java

               (tab[1].length==3) && (tab[0][1]==2)

        .. class:: comment-feedback


                ``tab[1].length`` est le nombre de colonnes de la ligne ``1`` du tableau, c'est-à-dire ``2``.

    -
        .. code-block:: java

                (tab[0][2]==2) && (tab[1][0]==4)

        .. class:: comment-feedback

                L'élément ``tab[0][2]`` a comme valeur ``3`` et non ``2``.

Question 3 - Manipulation de tableau à deux dimensions
-------------------------------------------------------

Considérons la matrice ``m`` de ``li`` lignes et ``c`` colonnes qui a été initialisée par les instructions ci-dessous :

.. code-block:: java


       double m[][] = new double[li][c];
       int count =1;
       for(int i=0;i<li;i++) {
         for(int j=0; j<c; j++) {
             m[i][j]=count;
         count++;
         }
       }

Laquelle des expressions booléennes ci-dessous est-elle vraie ?

.. class:: positive-multiple

-

        .. code-block:: java

            ( m[li-1][0]==((li-1)*c)+1) && (m[0][c-1]==c)
-

        .. code-block:: java

            ( m[0][0]==1) && (m[li-1][c-1]==1+li*ci)

.. class:: negative-multiple

-

    .. code-block:: java

        ( m[0][c-1]==c-1)

    .. class:: comment-feedback

        Cet élément de la matrice vaut ``c`` et car ``count`` est incrémentée à chaque passage dans la boucle ``for j<c``.

-
    .. code-block:: java

        ( m[li][c]==li*ci)

    .. class:: comment-feedback


        Il n'existe pas d'élément ``m[li][c]`` dans la matrice ``m``.
-
    .. code-block:: java

        (m[0][0]==0) && (m[0][c-1]==c)

    .. class:: comment-feedback


        ``count`` étant initialisé à ``1``, l'élément ``m[0][0]`` est initialisé à la valeur ``1``.
-
    .. code-block:: java

         ( m[0][1]==1) && (m[0][c-1]==c)

    .. class:: comment-feedback


        ``m[0][1]`` vaut ``2``

.. This line include the "check your answer" button that gives a note to the student and mark questions with the
    correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez, Antoine Habran
