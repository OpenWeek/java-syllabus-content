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

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez, Antoine Habran

============
Les Tableaux
============
----------------------
Initialiser un tableau
----------------------

Un tableau est une structure de données que l'on peut représenter par un nombre
de cases. Chaque case peut contenir une donnée de type primitif
(``boolean``, ``int``, ...) ou un objet (vous verrez plus en détails les objets dans une section ultérieure). Par exemple on peut
stocker des entiers dans un tableau de ``int``.


Un tableau est caractérisée par sa taille, qui est le nombre de cases pouvant
contenir chacune une donnée et par le type de données qu'elles contiennent. La taille d'un tableau ``A`` est donnée par ``A.length``. Cette taille ne pourra plus être changée après que le tableau est créé.
En ``Java``, un tableau contient que des éléments du même type.

.. raw:: html

    <div align="center">
    <img  src="data:image/png;base64,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 BjgiIiKiifl/6vPQl48ZKncAAAAASUVORK5CYII=" alt="Représentation d'un tableau" title = "Représentation d'un tableau"/>
    </div>
    <br>

Voici la syntaxe pour initialiser un tableau vide contenant des données de
type ``TYPE`` et ayant une taille ``TAILLE`` :

.. code-block:: Java

  TYPE[] nom = new TYPE[TAILLE];  // (1)

On peut aussi écrire l'initialisation comme :

.. code-block:: Java

  TYPE nom[] = new TYPE[TAILLE]; // (2)

Par simplicité, on utilisera par la suite la syntaxe en (1).

Pour remplir ce tableau de données, on utilise l'indice de la case que l'on veut remplir.
L'indice d'une donnée est le numéro de la case du tableau qui contient cette donnée.
L'indice commence à 0 et va jusqu'à ``TAILLE-1``, c'est-à-dire que la première case est à l'indice 0, la deuxième à l'indice 1, ..., et la dernière à l'indice ``TAILLE-1``.

.. code-block:: Java

  nom[INDICE] = VALEUR;

Il est également possible d'initialiser un tableau non-vide de taille ``n`` contenant un ensemble d'éléments de type ``TYPE`` E0, E1, ..., En :


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


Modifie le code suivant pour créer un tableau vide de taille 10 :

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

Par défaut, si aucune valeur n'est assignée au cases d'un tableau, Java initialise les valeurs du tableau en fonction du type de données. On dira que le tableau est vide. Voici un tableau des valeurs par défaut en fonction de quelques type de données :

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

.. [1] https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5

QCM
---

Question 1 - Définition d'un tableau Java
------------------------------------------

Un tableau ``Java`` est :

.. class:: positive-multiple

    - Une structure de données indexée

    .. class:: comment-feedback

        *Good job!*

.. class:: negative-multiple

    - Un tableau blanc sur lequel on dessine des cases au feutre

    .. class:: comment-feedback

        *Donner une définition plus précise.*

    - Un tableau noir sur lequel on dessine des cases à la craie

    .. class:: comment-feedback

        *Donner une définition plus précise.*


Question 2 - Initialiser un tableau Java
-----------------------------------------

Cocher les cases correctes :

.. class:: positive-multiple

    -
        .. code-block:: Java

            int[] tab = new int[100];

        .. class:: comment-feedback

            *Good job!*

    -
        .. code-block:: Java

            int tab[] = new int[100];

        .. class:: comment-feedback

            *Good job!*

.. class:: negative-multiple

    -
        .. code-block:: Java

            int[] tab = new int[100]

        .. class:: comment-feedback

            *il manque un ``;``*

    -
        .. code-block:: Java

            int[] tab = int[100];

        .. class:: comment-feedback

            *il manque le mot-clef ``new``*

    -
        .. code-block:: Java

            int tab = int[100];

        .. class:: comment-feedback

            *il manque des crochets*

    -
        .. code-block:: Java

            int []tab = new int[100];

        .. class:: comment-feedback

            *Les crochets sont mal placés*

    -
        .. code-block:: Java

            int tab[] = new int[100]

        .. class:: comment-feedback

            *il manque un ``;``*

    -
        .. code-block:: Java

            int tab[] = int[100];

        .. class:: comment-feedback

            *il manque le mot-clef ``new``*


Question 3 - Index dans un tableau Java
----------------------------------------

On initialise le tableau suivant :

.. code-block:: Java

    String tab[] = {1, 2, 3}

Quelle elle la valeur de ``tab[0]``?

.. class:: positive

    - Aucune des autres valeurs proposées

    .. class:: comment-feedback

        Good job!

.. class:: negative

    - 0
    - 1
    - 2
    - 3

    .. class:: comment-feedback

        Il manque un ``;``

Question 4 - Déclaration de tableaux
-------------------------------------

Parmi les déclarations suivantes, quelle est celle qui permet de déclarer correctement un tableau dont la référence est dénommée ``tab`` et qui peut contenir 5 nombres entiers ?

.. class:: positive-multiple

        -
            .. code-block:: java

                   int[] tab = new int[5];

            .. class:: comment-feedback

                C'est la déclaration la plus courante pour un tableau d'entiers. Notez que cette ligne combine une déclaration (``int[] tab`` et la création du tableau correspondant permettant de stocker 5 éléments de type ``int``.

        -
            .. code-block:: java

                   int[] tab;
                   tab = new int[5];

            .. class:: comment-feedback

                La première ligne déclare que ``tab`` est une référence vers un tableau d'entiers. La deuxième ligne associe cette référence à un tableau permettant de stocker 5 entiers.

.. class:: negative-multiple

        -
            .. code-block:: java

                    tab = int [5];

            .. class:: comment-feedback

                Cette ligne est incorrecte. ``tab`` n'a pas été déclaré préalablement et il faut utiliser le mot clé ``new`` pour initialiser un tableau.
        -
            .. code-block:: java

                    tab = new int[5];

            .. class:: comment-feedback

                Cette ligne est incorrecte. ``tab`` n'a pas été déclaré préalablement. Il faut faire précéder cette ligne d'une déclaration de ``tab``.

        -
            .. code-block:: java

                    int[] tab = new int[];

            .. class:: comment-feedback

                Cette ligne est incorrecte. Lorsque l'on initialise un tableau, il faut spécifier le nombre d'éléments du tableau entre [] dans le membre de droite. En Java, les tableaux ont une taille fixe qui est définie à leur création.

        -
            .. code-block:: java

                    int[5] tab = new int[];

            .. class:: comment-feedback

                Cette ligne est incorrecte. Lorsque l'on initialise un tableau, il faut spécifier le nombre d'éléments du tableau entre [] dans le membre de droite. En Java, les tableaux ont une taille fixe qui est définie à leur création.

        -
            .. code-block:: java

                    int tab[5] = new int[];

            .. class:: comment-feedback

                Cette ligne est incorrecte. Lorsque l'on initialise un tableau, il faut spécifier le nombre d'éléments du tableau entre [] dans le membre de droite.

Question 5 - Initialisation de tableaux
----------------------------------------

Laquelle des lignes ci-dessous déclare un tableau contenant trois nombres réels et l'initialise avec les valeurs ``-1.0``, ``0.0`` et ``1.0``.

.. class:: positive-multiple

        -
            .. code-block:: java

                    double[] t = new double[] {-1.0, 0.0, 1.0};

            .. class:: comment-feedback

                Cette ligne est correcte. Le livre la préfère à la ligne ``double[] t = { -1.0, 0.0, 1.0};`` même si les deux sont équivalentes pour Java.

        -
            .. code-block:: java

                    double[] t = {-1.0, 0.0, 1.0};

            .. class:: comment-feedback

                Cette ligne est correcte. Le livre préfère la ligne ``double[] t = new double[] { -1.0, 0.0, 1.0};`` qui est plus explicite même si les deux sont équivalentes pour Java.

.. class:: negative-multiple

        -
            .. code-block:: java

                   double[3] t = {-1.0, 0.0, 1.0};

            .. class:: comment-feedback

                En Java, il n'existe pas de type ``double[3]`` pouvant être mis dans une déclaration.

        -
            .. code-block:: java

                   double t = {-1.0, 0.0, 1.0};

            .. class:: comment-feedback

                En Java, ``double t`` déclare un réel et non un tableau de réels.

        -
            .. code-block:: java

                   double[] t = new double[-1.0, 0.0,1.0];

            .. class:: comment-feedback


                Cette ligne n'est pas syntaxiquement correct.

        -
            .. code-block:: java

                   double[] t = new double{-1.0,0.0,1.0};

            .. class:: comment-feedback


                Cette ligne n'est pas syntaxiquement correcte.

        -
            .. code-block:: java

                   double[] t = [-1.0, 0.0, 1.0];

            .. class:: comment-feedback


                Cette ligne n'est pas syntaxiquement correcte. Ne confondez pas ``{`` et ``[``.


Question 6 - Initialisation de tableaux
----------------------------------------

Une fois qu'un tableau a été déclaré et initialisé, il faut parfois pouvoir connaître le nombre d'éléments se trouvant dans le tableau. Lequel des codes ci-dessous affiche-t-il le nombre d'entiers dans le tableau ``tab`` déclaré via ``int[] tab = new int[]{1,2,7,9,3,99,-12,78,119}`` ?

.. class:: positive-multiple

    -

            .. code-block:: java

               System.out.println(tab.length);

.. class:: negative-multiple

    -
        .. code-block:: java

               System.out.println(tab.length());

        .. class:: comment-feedback

            En Java, la syntaxe ``tab.length()`` correspond à l'exécution de la méthode ``length()`` sur l'objet dont la référence est ``tab``. Les tableaux Java ne sont pas des objets ayant des méthodes que l'on peut appeler.

    -
        .. code-block:: java

               System.out.println(tab.size);

        .. class:: comment-feedback

            ``tab.size`` n'existe pas.

    -
        .. code-block:: java

               System.out.println(tab[0]);

        .. class:: comment-feedback

            ``tab[0]`` est le premier élément du tableau ``tab`` et non le nombre d'éléments présents dans le tableau.

    -
        .. code-block:: java

               System.out.println(tab.[length]);

        .. class:: comment-feedback

            Cette ligne est syntaxiquement incorrecte.

.. This line include the "check your answer" button that gives a note to the student and mark questions with the
    correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Marie-Marie van der Beek, Pablo Gonzalez Alvarez
