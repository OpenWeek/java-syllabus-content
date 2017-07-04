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
unique soit une liste de noms de variable séparés par des virgules. Il est d'usage de déclarer les variables une par une
à part si elles ont un lien fort entre elles.

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
Ces variables sont appelées **variables locales**. Elles existent seulement à l'intérieur de la fonction
dans laquelle elles sont déclarées et sont inaccessibles depuis l'extérieur. Une variable peut être déclarée n'importe où dans
une fonction tant qu'elle est déclarée avant d'être utilisée.
