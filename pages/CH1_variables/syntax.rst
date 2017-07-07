.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

  <script type="text/javascript">$nmbr_prop = 4</script>

============================
Syntaxe des noms de variable
============================

Dans les programmes, les noms sont utilisés pour faire référence à différents éléments (par exemple à une variable). Afin d'utiliser
ces éléments, le programmeur doit comprendre les règles de nommage ainsi que la syntaxe et la sémantique des
noms.

Selon les règles de syntaxe Java, un nom est une séquence d'un ou plusieurs caractères. Il doit
commencer par une lettre ou un underscore et être composé uniquement de lettres, de chiffres et d'underscores ('underscore' fait référence au caractère '_').
Par exemple, les noms suivants respectent la syntaxe Java :

**N n rate x15 quitea long name HelloWorld**

Les espaces ne sont pas autorisés dans les noms; "HelloWorld" est un nom correct mais "Hello World" ne l'est pas.
Les lettres majuscules et miniscules sont considérées comme différentes. Par conséquent les noms "helloWorld", "hELLOwORLD" et "HELLOworld" sont tous des noms
différents. De plus, en Java, certains noms sont réservés pour une utilisation spécifique et ne peuvent donc pas être utilisés comme nom de variable par le programmeur. Les noms
**class**, **public**, **static**, **if** et **else** sont des exemples de noms réservés. Il en existe plusieurs dizaines.

En Java il existe des conventions de nommage pour les variables. Rien ne vous oblige à suivre ces conventions
mais les respecter vous évitera sans doute beaucoup de confusion et rendra votre code plus lisible aux yeux des autres programmeurs.
Par exemple, il est de coutume d'utiliser une lettre majuscule pour commencer le nom d'une classe et une lettre miniscule pour commencer
le nom d'une variable ou d'une fonction. Une autre convetion concerne les noms composés de plusieurs mots; la règle veut que l'on commence chaque
mot par une majuscule à part, éventuellement, pour le premier. Par exemple les mots **interestRate** ou **counterOfTransactions** suivent la convention.

======================================
Questions : Syntaxe des noms variables
======================================

Les noms de variables suivant respectent-ils la syntaxe Java ?

Question 1
----------

.. code-block:: java

    int Name_Variables;

.. class:: positive

    - Oui

.. class:: negative

    - Non


Question 2
----------

.. code-block:: java

        int My Variable;

.. class:: positive

- Non

.. class:: negative

- Oui

Question 3
----------

.. code-block:: java

        int nomdevariabletrestreslongquinesertarien;

.. class:: positive

- Oui

.. class:: negative

- Non

Question 4
----------

.. code-block:: java

        int variableName;

.. class:: positive

- Oui

.. class:: negative

- Non

Question 5
----------

.. code-block:: java

        int 42num;

.. class:: positive

- Non

.. class:: negative

- Oui

.. This line include the "check your answer" button that gives a note to the student and mark questions with the correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

  <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Fitvoye Florian, Mottet Sébastien, Charlier Gilles
