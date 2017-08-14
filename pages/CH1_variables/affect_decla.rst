======================================
Déclaration et affectation de variable
======================================


Les programmes de tous les jours utilisent constamment des **variables** stockées en mémoire. Une variable est un nom (chaîne de caractères) qui fait référence à une donnée stockée en mémoire.

La notion de variable est plutot subtile.
Pour mieux comprendre le fonctionnement des variables, il est nécessaire de distinguer trois notions élémentaires :

- le nom de la variable : nom qui permet de référencer un endroit où un contenu est stocké
- le contenu de la variable : l'information stockée. Le contenu d'une variable peut être modifié au cours de l'exécution d'un programme.
- le type de variable (notion expliquée dans la section suivante)

Pour déclarer une variable, nous utilisons une **déclaration de variable** qui suit la syntaxe suivante

.. code-block:: console

  <type> <nom>;


où ``<type>`` est un type comme expliqué dans la section suivante et ``<nom>`` est une chaîne de caractères qui respècte les règles définies dans la section précédente. Après la déclaration, il y a une variable de type ``<type>`` et référencée par le nom ``<nom>`` en mémoire.

Une fois la variable déclarée, il faut l'initialiser. Le seul moyen pour initialiser ou modifier le contenu d'une variable, est d'utiliser une **instruction d'affecation**.
L'initialisation correspond à la première affectation d'une variable.

L'affectation suit la syntaxe suivante :

.. code-block:: console

  <nom> = <expression>;

Nous verrons plus tard différentes expressions qui peuvent être assignées à une variable. Le cas le plus basique est lorsque l'on assigne à une variable une valeur comme nous le verrons dans les exemples qui suivent.

De plus, la déclaration et l'affectation peuvent s'effectuer en même temps en suivant la syntaxe suivante :

.. code-block:: console

  <type> <nom> = <expression>;


Pour les exemples suivant, il vous faut savoir que le type ``int`` est le type utilisé pour les nombre entiers et ``String`` pour les chaînes de caractères. Voici une illustration des différents concepts évoqués :


.. code-block:: java

        int value; // déclaration d'une variable

        value  = 5; // initialisation d'une variable

        int rate = 7; // déclaration et initialisation de 'rate'

        int calcul  = rate * value; // On peut affecter le résultat d'un calcul à une variable

        value  = 10; // modification d'une variable

        // Bien que la valeur de 'value' ait changé, la valeur de 'calcul' reste identique.

        calcul = rate * value; // Après cette nouvelle affectation, la valeur de 'calcul' a changé et est maintenant égale à 10 * 7.

        String str = "Hello World!"; // déclaration et initialisation d'une variable de type string

        str = "Hello girls"; // modification d'une variable de type String


QCM : déclaration et affectation
--------------------------------

Question 1 :
------------

Laquelle/Lesquelles de ses variables sont mal utilisées ?

.. code-block:: java

    int a;
    b = 5;
    int c = 42;
    int b;
    a = 7;

.. class:: positive

  - b

.. class:: negative

  - a et b

  - Toutes ces variables sont correctement utilisées.

  - a

  - c

  - Aucune n'est utilisée correctement.

  - b et c

  - a et c

Question 2 : Syntaxe correcte
-----------------------------

Quelles déclarations sont correctes ?

.. code-block:: java

        int val = 5;            // ligne A
        int val = 6;            // ligne B
        int entier = -4;        // ligne C
        String one, two, three; // ligne D & E
        one = two = three = "";

.. class:: negative

        - ligne A B et C

        .. class:: comment-feedback

            La variable val est déjà initialisée, donc la ligne B renvoie une erreur

.. class:: negative

        - ligne A & B & C & D & E

        .. class:: comment-feedback

            La variable val est déjà initialisée, donc la ligne B renvoie une erreur




.. class:: positive

        - ligne A & C & D & E

        .. class:: comment-feedback

                        Bonne réponse !

Question 3 : Modification de variable
-------------------------------------

.. code-block:: java

        int val = 2;                            // ligne 1
        val = 3;                                // ligne 2
        int rate  = 5;                     // ligne 3
        int calcul =  val * (rate + val);    // ligne 4

Quelle est la valeur de la variable *calcul* ?

.. class:: positive

        - 24

        .. class:: comment-feedback

                        Bonne réponse !

.. class:: negative

        - 14

        .. class:: comment-feedback

                        La variable *val* a changée lors de la ligne 2

.. class:: negative

        - 5.12

        .. class:: comment-feedback

                        Cette réponse n'a aucun sens :)

Question 4 : Portée des variables
---------------------------------

.. code-block:: java

        {
          int a = 3;
          {
            int a = 5;
            {
              int b = 7;
              // Ligne 1
            }
            // Ligne 2
          }
          // Ligne 3
        }

Quel est la valeur de la variable *a* à la Ligne 1 ?
----------------------------------------------------

.. class:: positive

  - 5

.. class:: negative

  - 3

  - 7

  - la variable *a* n'existe pas

Quel est la valeur de la variable *a* à la Ligne 2 ?
----------------------------------------------------

.. class:: positive

  - 5

.. class:: negative

  - 3

  - 7

  - la variable *a* n'existe pas

Quel est la valeur de la variable *a* à la Ligne 3 ?
----------------------------------------------------

.. class:: positive

  - 3

.. class:: negative

  - 5

  - 7

  - la variable *a* n'existe pas

Quel est la valeur de la variable *b* à la Ligne 1 ?
----------------------------------------------------

.. class:: positive

  - 7

.. class:: negative

  - 5

  - 3

  - la variable *b* n'existe pas


Quel est la valeur de la variable *b* à la Ligne 2 ?
----------------------------------------------------

.. class:: positive

  - la variable *b* n'existe pas

.. class:: negative

  - 5

  - 3

  - 7





Quel est la valeur de la variable *b* à la Ligne 3 ?
----------------------------------------------------

.. class:: positive

  - la variable *b* n'existe pas

.. class:: negative

  - 5

  - 3

  - 7

.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Fitvoye Florian, Mottet Sébastien, Charlier Gilles
