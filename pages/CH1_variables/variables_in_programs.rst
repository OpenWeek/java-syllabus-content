.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)


=============================
Variables dans les programmes
=============================

.. author::

    Fitvoye Florian, Mottet Sébastien, Charlier Gilles, Michel François

Une variable peut être utilisée par un programme seulement si elle a été préalablement déclarée.
Une déclaration de variable suit la forme suivante :

.. code-block:: console

  <type> <nom-ou-noms>;

Lorsque l'ordinateur exécute une déclaration de variable, il réserve un espace mémoire pour cette variable et
associe le nom de la variable avec cet espace mémoire. ``<nom-ou-noms>`` est soit un nom de variable
unique soit une liste de noms de variable ayant le même type séparés par des virgules.
Il est d'usage de déclarer les variables ensemble si elles ont un lien fort entre elles.

Par exemple :

.. code-block :: java

  int numberOfStudents;
  String name;
  double x, y;
  boolean isFinished;
  char firstInitial, middleInitial, lastInitial;

Il peut aussi être utile d'insérer des commentaires après chaque déclaration de variable pour
expliquer son utilité ou pour donner des informations simplifiant la compréhension du fonctionnement
de votre programme pour un potentiel lecteur.

Par exemple :

.. code-block :: java

  double principal; // Montant d'argent investi.
  double interestRate; // Taux d'intérêt en décimal, pas en pourcentage

Pour le moment, nous n'utilisons que des variables **locales**.
Elles existent uniquement à l'intérieur d'un bloc délimité par des accolade (``{ /* Code ici */ }``) dans lequel elles sont déclarées. Elles sont inaccessibles depuis l'extérieur de ce bloc.
Une variable locale peut être utilisée, après sa déclaration, n'importe où dans ce même bloc, même dans un bloc imbriqué dans le bloc. Par exemple, ce bout de code est correct:

.. inginious:: execute_java

    final char ge = 'げ';

    {
        char ko = ge + 1;
        System.out.println(ko); // affiche 'こ' ("ko")
    }

Vous noterez le mot réservé `final`, qui, s'il est écrit devant le type d'une variable lors de sa déclaration, assure au programme que la variable ne changera *jamais* (la variable est donc une *constante*). En affet, vouloir changer sa valeur donnera une erreur de compilation. Nous avons rendu la variable ``ge`` constante car sans cela, Java aurait lancé une erreur de compilation du programme. En effet, si ``ge`` n'était pas constante, le compilateur considérerait que sa valeur pourrait être différente de ``'げ'`` et qu'ajouter 1 à la valeur contenue dans ``ge`` pourrait donner une valeur **trop grande pour être contenue dans un** ``char`` et considère alors le résultat de l'addition comme un ``int``. Le compilateur refuse donc de compiler le programme, par prévention. En effet, on essaye d'assigner un ``int`` à une variable de type ``char``, ce qui pourrait impliquer une perte de données car un char est stocké sur 2 bytes tandis qu'un int est stocké sur 4 bytes. Vous pouvez essayer d'enlever le mot-clé ``final`` dans le code ci-dessus pour constater l'erreur de compilation qui survient.

À l'inverse, le code suivant **ne compile pas**. En effet, une variable déclarée dans un bloc ne peut pas être référencée hors de celui-ci :

.. inginious:: execute_java

    {
        final char ge = 'げ';
    }
    char ko = ge + 1;
    System.out.println(ko);

Ici, le message d'erreur indique que le compilateur ne trouve pas de variable nommée ``ge`` au niveau de l'addition de la ligne 4. C'est tout à fait logique car la portée d'une variable ne s'étend pas plus loin que le bloc dans lequel elle a été *déclarée*.



Exercices
*********

Ecrivez un code pour que la variable ``a`` prennne la valeur ``b+1`` et que la variable ``b`` garde sa valeur.
Les variables ``a`` et ``b`` ont déjà été déclarées. (la réponse est courte).

.. code-block :: java

  int a = ... ; // la variable a est initialisée avec une valeur aléatoire
  int b = ... ; // la variable b est initialisée avec une valeur aléatoire

.. inginious:: CH1Q2_misconceptions_variables

        // your code here

QCM : Fin de chapitre
---------------------

Ce QCM vérifie votre compréhension globale du chapitre sur les variables.


Question 1
----------

.. code-block:: java

    int a = 2;
    int b = 3;
    a = b;
    // Quelles sont les valeurs de a et b  en ce point ?

.. class:: positive

    - a = 3 et b = 3

.. class:: negative

    - a = 2 et b = 2


Question 2
----------

.. code-block :: java

  int a = 5;
  int b = a+2;
  a = 3;
  // Quelles sont les valeurs de a et b  en ce point ?

.. class :: positive

  - a = 3 et b = 7

.. class :: negative

  - a = 3 et b = 5
  - a = 5 et b = 7
  - a = 5 et b = 5

.. This line include the "check your answer" button that gives a note to the student and mark questions with the correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

  <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>
