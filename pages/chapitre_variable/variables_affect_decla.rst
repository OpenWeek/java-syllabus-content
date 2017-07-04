======================================
Déclaration et affectation de variable
======================================


Les programmes de tous les jours utilisent constamment des *variables* stockées en mémoire.
En langage machine, il est nécessaire de préciser l'endroit à laquelle la variable va être stockée en donnant une adresse numérique concrète.
En java, ce n'est pas le cas. C'est à l'ordinateur de s'occuper des emplacements de variables.
Le programmeur devra donc uniquement retenir le nom des variables.

**Un nom utilisé pour faire référence à une donnée stockée en mémoire est donc appelé une variable.**
La notion de variable est plutot subtile.
Pour mieux comprendre le fonctionnement des variables, il est nécessaire de distinguer trois notions élémentaires :

- le nom de la variable : nom qui permet d'identifier un endroit où un contenu est stocké
- le contenu de la variable : l'information stockée. Le contenu d'une variable peut être modifié au cours de l'exécution d'un programme.
- le type de variable (notion expliquée dans la section suivante)

Pour déclarer une variable, nous utilisons une **déclaration**. Une déclaration suit la syntaxe suivante :

.. code-block:: console

  <type-name> <variable-name>;

Une déclaration crée une variable en mémoire de type *<type-name>* et ayant comme nom *<variable-name>*.

Une fois la variable déclarée, il faut l'initialiser. Le **seul** moyen pour initialiser ou modifier le **contenu** d'une variable, est d'utiliser une **instruction d'affecation**.
L'initialisation correspond à la première affectation d'une variable.

L'affectation suit la syntaxe suivante :

.. code-block:: console

  <variable-name> = <expression>;

De plus, la déclaration et l'affectation peuvent s'effectuer en même temps en suivant la syntaxe suivante :

.. code-block:: console

  <type-name> <variable-name> = <expression>;


Voici une illustration des différents concepts évoqués :


.. code-block:: java

        int value; // déclaration d'une variable

        value  = 5; // initialisation d'une variable

        int rate = 7; // déclaration et initialisation de 'rate'

        int calcul  = rate * value; // calcul = 7 * 5

        value  = 10; // modification d'une variable

        // Bien que la valeur de 'value' ait changé, la valeur de 'calcul' reste identique.

        calcul = rate * value; // Après cette nouvelle affectation, la valeur de 'calcul' a changé et est maintenant égale à 10 * 7.

        String str = "Hello World!"; // déclaration et initialisation d'une variable de type string

        str = "Hello girls"; // modification d'une variable de type String

Exercices
*********
Question 1 : Syntaxe correcte
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

Question 2 : Modification de variable
-------------------------------------

.. code-block:: java

        int val = 2;                            // ligne 1
        val = 3;                                // ligne 2
        int rate  = 5;                     // ligne 3
        int calcul =  val * (rate + val);    // ligne 4

Combien vaut la variable *calcul* suivante ?

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


.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>
