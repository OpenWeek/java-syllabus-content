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
-----------
QCM Avancés
-----------

Question 1 - Assertions
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

Question 2 - Somme de vecteurs
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


Question 3 - Tableaux de caractères
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

Question 4 - toCharArray
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
