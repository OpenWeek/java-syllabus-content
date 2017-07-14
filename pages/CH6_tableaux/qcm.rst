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

    Pablo Gonzalez Alvarez

============
Les Tableaux
============
---
QCM
---

Question 01 - Définition d'un tableau Java
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


Question 02 - Initialiser un tableau Java
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


Question 03 - Index dans un tableau Java
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

Question 04 - Déclaration de tableaux
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

Question 05 - Initialisation de tableaux
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


Question 06 - Initialisation de tableaux
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

Question 07 - Tableaux à plusieurs dimensions
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

Question 08 - Tableaux ordonnés
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

Question 09 - Initialisation de tableaux à deux dimensions
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

Question 10 - Manipulation de tableau à deux dimensions
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

Question 11 - Somme des éléments d'un tableau
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

Question 12 - Assertions
------------------------

En Java, les assertions peuvent être utilisées pour vérifier explicitement les préconditions et les postconditions d'une méthode. En programmation défensive, on utilise des ``assert`` pour vérifier explicitement les préconditions de chaque méthode. Considérons la méthode dont la spécification est reprise ci-dessous :

.. code-block:: java

 /**
  * @pre a>0, b>2*a et b est pair
  * @post ....
  */
 private void methode(int a, int b)

Laquelle des séquences d'instructions ci-dessous vérifie explicitement les préconditions de cette méthode ?

.. class:: positive-multiple

-

    .. code-block:: java

       assert a>0 : "a doit être strictement positif";
       assert ( (b>2*a) && (b%2)==0 ) : "b invalide";
    .. class:: comment-feedback

        Notez qu'en Java l'expression ``(b%2)`` est une expression entière. Elle peut donc apparaître à gauche d'un signe ``==``. Il est intéressant d'utiliser des commentaires pour indiquer quelle précondition n'est pas vérifiée.
-

    .. code-block:: java

       assert a>0 : "a doit être strictement positif";
       assert (b>2*a) : "b trop petit";
       int reste=b%2;
       assert reste==0 : "b n'est pas pair";

    .. class:: comment-feedback

        Il est intéressant d'utiliser des commentaires pour indiquer quelle précondition n'est pas vérifiée.

.. class:: negative-multiple

-
    .. code-block:: java

       assert a<=0;
       assert ( (b>2*a) && (b%2)==0 ) : "b invalide";
    .. class:: comment-feedback

        La première assertion est incorrecte. Elle est vraie lorsque ``a<=0`` or la précondition de la méthode est ``a>0``.
-
    .. code-block:: java

       int reste=b%2;
       assert a<=0 : "a doit être strictement positif";
       assert reste!=0 : "b n'est pas pair";
       assert (b<=2*a) : "b trop petit";

    .. class:: comment-feedback


        En Java, ``assert`` permet de vérifier qu'une précondition est remplie. Si c'est le cas, l'instruction ``assert`` n'a aucun effet. Sinon, l'instruction ``assert`` affiche le message qui suit ``:`` et provoque une erreur. Lorsque l'on utilise ``assert`` pour vérifier les préconditions, on souhaite que l'exécution du programme s'arrête et que le message d'erreur soit afficher lorsqu'une précondition n'est pas vérifiée. Pour cela, l'expression booléenne contenu dans l'assertion doit être la précondition à vérifier.
-
    .. code-block:: java

       assert a<=0 : "a doit être strictement positif";
       assert ( (b<=2*a) && (b%2)!=0 ) : "b invalide";

    .. class:: comment-feedback

        Notez qu'en Java l'expression ``(b%2)`` est une expression entière. Elle peut donc apparaître à gauche d'un signe ``==``. En Java, ``assert`` permet de vérifier qu'une précondition est remplie. Si c'est le cas, l'instruction ``assert`` n'a aucun effet. Sinon, l'instruction ``assert`` affiche le message qui suit ``:`` et provoque une erreur. Lorsque l'on utilise ``assert`` pour vérifier les préconditions, on souhaite que l'exécution du programme s'arrête et que le message d'erreur soit afficher lorsqu'une précondition n'est pas vérifiée. Pour cela, l'expression booléenne contenu dans l'assertion doit être la précondition à vérifier.

Question 13 - Somme de vecteurs
-------------------------------

Considérons les tableaux ``a``, ``b`` et ``s`` déclarés comme indiqués ci-dessous :

.. code-block:: java

  int[] a= newint[20];
  int[] b= new int[20];
  int[] s= new int[20];


Supposons que ces tableaux servent à stocker des vecteurs (au sens mathématique du terme). Laquelle des séquences d'instructions ci-dessous place-t-elle dans le vecteur ``s`` la somme des vecteurs ``a`` et ``b``?

.. class:: positive-multiple

    -
        .. code-block:: java

            for(int i=0; i<a.length;i++) {
             s[i]=a[i]+b[i];
            }
    -
        .. code-block:: java

            for(int i=0; i<b.length;i++) {
             s[i]=a[i]+b[i];
            }

    -
        .. code-block:: java

            for(int i=s.length-1; i>=0;i=i-1) {
             s[i]=a[i]+b[i];
            }

.. class:: negative-multiple

    -
        .. code-block:: java

            s[]=a[]+b[];

        .. class:: comment-feedback

            Cette instruction est invalide en Java. Il est nécessaire d'utiliser une boucle pour calculer cette somme.

    -
        .. code-block:: java

            for(int i=0; i<=a.length;i++) {
             s[i]=a[i]+b[i];
            }

        .. class:: comment-feedback


        Cette boucle va provoquer une erreur à l'exécution lorsque ``i`` vaut ``a.length``. Voyez-vous pourquoi ?

    -
        .. code-block:: java

            for(int i=0; i<=b.length;i++) {
             s[i]=a[i]+b[i];
            }

        .. class:: comment-feedback

            Cette boucle va provoquer une erreur à l'exécution lorsque ``i`` vaut ``b.length``. Voyez-vous pourquoi ?

    -
        .. code-block:: java

            for(int i=s.length-1; i>0;i=i-1) {
             s[i]=a[i]+b[i];
            }

        .. class:: comment-feedback

            Cette boucle ne calculera pas la valeur de ``s[0]``. Voyez-vous pourquoi ?

    -
        .. code-block:: java

            for(int i=s.length; i>=0;i=i-1) {
             s[i]=a[i]+b[i];
            }

        .. class:: comment-feedback


            Cette boucle va provoquer une erreur à l'exécution lorsque ``i`` vaut ``s.length``. Voyez-vous pourquoi ?


Question 14 - Tableaux de caractères
------------------------------------

La semaine passée, vous avez écrit une méthode ``count`` permettant de déterminer le nombre d'occurences d'un caractère dans un ``String``. Lequel des corps ci-dessous est une implémentation correcte de la méthode ``isIn`` dont la spécification est

.. code-block:: java

 /*
  * @pre chaîne s non vide
  * @post retourne true si le caractère c est présent dans la chaîne s
  *       et false sinon
  */
 public static boolean isIn(char c, char[] s)


.. class:: positive-multiple

    -
        .. code-block:: java

           for(int i=0;i<s.length;i++) {
             if(s[i]==c) {
                return true;
             }
           }
           return false;
    -

        .. code-block:: java

           for(int i=s.length-1;i>=0;i=i-1) {
             if(s[i]==c) {
                return true;
             }
           }
           return false;

.. class:: negative-multiple

    -
        .. code-block:: java

           for(int i=0;i<s.length();i++) {
             if(s[i]==c) {
                return true;
             }
           }
           return false;

        .. class:: comment-feedback

            Le nombre d'éléments dans le tableau de caractère ``s`` est ``s.length`` et non le résultat de l'application d'une méthode ``length()`` qui ne prend pas de paramètre.

    -
        .. code-block:: java

           for(int i=0;i<=s.length;i++) {
             if(s[i]==c) {
                return true;
             }
           }
           return false;
        .. class:: comment-feedback

            Nok

    -
        .. code-block:: java

           for(int i=0;i<s.length();i++) {
             if(s[i]==c) {
                return true;
             }
             else {
                return false;
             }
           }
        .. class:: comment-feedback

            Que fait cette méthode après avoir comparé ``c`` avec l'élément ``s[0]`` ?

Question 15 - toCharArray
-------------------------

La classe ``String`` contient une méthode baptisée `toCharArray() <https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toCharArray-->`_ qui permet de convertir un ``String`` en un tableau de caractères. Une méthode statique équivalent pourrait avoir les spécification et signature suivantes :

.. code-block:: java

     /*
      * @pre chaîne s non vide
      * @post retourne un tableau de caractères ayant le même contenu que
      *       que String passé en paramètre
      */
     public static char[] toCharArray(String s)

Laquelle des séquences ci-dessous est une implémentation correcte de cette méthode ?

.. class:: positive-multiple

    -
        .. code-block:: java

           char[] r = new char[s.length()];
           for(int i=0;i<s.length();i++) {
              r[i]=s.charAt(i);
           }
           return r;

        .. class:: comment-feedback

           Notez que la longueur d'une chaîne de caractères s'obtient en appliquant la méthode ``length()`` à une référence vers cette chaîne. La longueur du tableau de caractères ``r`` est ``r.length``.

    -
        .. code-block:: java

            char[] r = new char[s.length()];
            for(int i=s.length()-1;i>=0;i=i-1) {
              r[i]=s.charAt(i);
            }
            return r;

        .. class:: comment-feedback

            Notez que la longueur d'une chaîne de caractères s'obtient en appliquant la méthode ``length()`` à une référence vers cette chaîne. La longueur du tableau de caractères ``r`` est ``r.length``.

.. class:: negative-multiple

    -
        .. code-block:: java

          char[] r;
          for(int i=0;i<s.length();i++) {
              r[i]=s.charAt(i);
          }
          return r[];

        .. class:: comment-feedback

            Cette réponse contient deux erreurs. Tout d'abord, avant de pouvoir utiliser un tableau, il faut fixer sa longueur lors de son initialisation. Ensuite, pour retourner un tableau, il faut retourner une référence vers ce tableau. Si ``r`` est une référence de type ``char[]``, il suffit de

    -
        .. code-block:: java

          char[] r = s;
          return r;

        .. class:: comment-feedback

            En Java, ce genre de raccourci n'existe pas.

    -
        .. code-block:: java

          char[] r = new char[s.length];
          for(int i=0;i<s.length;i++) {
              r[i]=s.charAt(i);
          }
          return r;

        .. class:: comment-feedback

            En Java, la longueur d'une chaîne de caractères s'obtient via ``s.length()`` et non ``s.length``.

.. This line include the "check your answer" button that gives a note to the student and mark questions with the
    correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>


.. author::

    Pablo Gonzalez Alvarez
