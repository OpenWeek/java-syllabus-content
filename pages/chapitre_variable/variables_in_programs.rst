.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)


=============================
Variables dans les programmes
=============================


Une variable peut être utilisée par un programme seulement si elle a été préalablement déclarée.
Une déclaration de variable suit la forme suivante :

.. code-block:: console

  <type-name> <variables-name-or-names>;

Lorsque l'ordinateur exécute une déclaration de variable, il réserve un espace mémoire pour cette variable et
associe le nom de la variable avec cet espace mémoire. *<variables-name-or-names>* est soit un nom de variable
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

  double principal; // Amount of money invested.
  double interestRate; // Rate as a decimal, not percentage.

Pour le moment, nous n'utilisons que des variables déclarées à l'intérieur des fonctions du programme.
Ces variables sont appelées **variables locales**. Elles existent seulement à l'intérieur du bloc (délimité par des {} )
dans laquelle elles sont déclarées et sont inaccessibles depuis l'extérieur de ce bloc. Une variable peut être déclarée n'importe où dans
une fonction tant qu'elle est déclarée avant d'être utilisée.

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
