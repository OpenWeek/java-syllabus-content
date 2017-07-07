==================
Types de variables
==================
Lorsque l'on déclare un variable en Java, on doit définir son **type**.
Une variable Java ne peut contenir un autre type de donnée que celui défini lors de la déclaration.
Le compilateur renverra une erreur de syntaxe si on essaye d'assigner un mauvais type de donnée

Il existe 8 types intégrés dans Java appelés **types primitifs**, tout repose sur ces **types primitifs**.



(1) **byte**, **short**, **int**, **long** : ces quatres types contiennent des entiers.
(2) **float**, **double** : contiennent des nombres réels.
(3) **char** : contient un caractère unique comme 'A', '*', 'x', ' ' ainsi que des caractères spéciaux comme une tabulation ('\\t') ou un retour à la ligne ('\\n'). Lorsque l'on utilise dans un programme, on doit rajouter les ' ' sinon '*' devient * qui est le symbole de la multiplication.
(4) **boolean** : contient une des deux expressions logiques (True ou False), souvent le résultat d'expression logique (cfr chapitre sur les expressions logiques).

Pour comprendre la différence entre les types contenant des entiers (ou des réels), il faut s'intéresser à la manière dont une donnée est stockée en mémoire.
Une donnée est stockée sous forme de numéro binaire, c'est à dire une séquence de 0 et de 1.
Un seul 0 ou 1 est appellé un bit. Un séquence de 8 bits est appellé un byte. Généralement, on caractérise la taille d'une mémoire en bytes.


* Un **byte** est donc un entier encodé sur 1 byte, il y a donc 256 séquences possibles avec des 0 et 1, correspondant à l'intervalle allant de -128 à 127.
* Un **short** est un entier encodé sur 2 bytes, correspondant à l'intervalle allant de -32768 à 32767
* Un **int** est un entier encodé sur 4 bytes, correspondant à l'intervalle allant de -2147483648 à 2147483647
* Un **long** est un entier encodé sur 8 bytes, correspondant à l'intervalle allant de -9223372036854775808 à 9223372036854775807. Pour l'utiliser dans le programme il faut rajouter un 'L' (x=1002L).
* Un **float** est un réel encodé sur 4 bytes, permettant d'avoir jusqu'à 7 chiffres significatifs. Pour l'utiliser dans le programme il faut rajouter un 'F' ou 'f' (x=1.2F).
* Un **double** est un réel encodé sur 8 bytes, permettant d'avoir jusqu'à 15 chiffres significatifs.
* Un **char** est encodé sur 2 bytes.

Le type **int** est suffisant pour la plupart des utilisations avec les entiers et le **double** avec les réels.

Il existe d'autres types de données en Java dont le plus utilisé est le **String** qui est un séquence de caractères (**char**)
et est délimité par des guillemets (exemple : String s = "Hello World !").

Exercice
********

Dans cette question nous allons vous demander de déclarer et d,initialiser plusieurs variables. Nous ne vous donnons pas leur type, c'est à vous de le déterminer grâce aux informations fournies.

1) Déclarez et initialisez une variable nommée "piVal" contenant la valeur de pi avec deux chiffres significatifs après la virgule. (utilisez le moins de mémoire possible)

2) Déclarez une variable nommée "popWorld" pouvant contenir le nombre d'êtres humains vivants sur terre et initialisez la à 0.

3) Déclarez et initialisez une variable nommée "c" contenant la 17 ième lettre de l'alphabet en miniscule.

.. inginious:: CH1Q1_affectation

        /*
        your code here
        */


QCM : types de variables
------------------------

Ce QCM vérifie votre compréhension des différents types de variables.

Les déclarations de variables suivantes sont-elles correctes ?


Question 1
----------

.. code-block:: java

    int MyInt = 42;

.. class:: positive

    - Oui

.. class:: negative

    - Non

.. class:: comment-feedback

    42 est un entier se trouvant entre -2147483648 à 2147483647 ("range" pour les int)


Question 2
----------

.. code-block:: java

        double MyDouble = 1.56;

.. class:: positive

- Oui

.. class:: negative

- Non

.. class:: comment-feedback

  1.56 est un réel

Question 3
----------

.. code-block:: java

        short MyShort = 42424;

.. class:: negative

- Oui

.. class:: positive

- Non

.. class:: comment-feedback

  Le nombre maximum possible pour un long est 32767

Question 4
----------

.. code-block:: java

        long MyLong = 42;

.. class:: positive

- Non

.. class:: negative

- Oui

.. class:: comment-feedback

  les long doivent avoir un 'L' à la fin lors de leur déclaration (MyLong = 42L)

Question 5
----------

.. code-block:: java

        char MyChar = C;

.. class:: positive

- Non

.. class:: negative

- Oui

.. class:: comment-feedback

  Un caractère est défini entre apostrophe 'C'

Question 6
----------

.. code-block:: java

        float MyFloat = 88.88F ;

.. class:: positive

- Oui

.. class:: negative

- Non

.. class:: comment-feedback

  un float est un réel et doit terminer par F ou f lors de sa déclaration.

Question 7
----------

.. code-block:: java

        char c = "ch" ;

.. class:: positive

- Non

.. class:: negative

- Oui

.. class:: comment-feedback

  Ici "ch" contient plusieurs caractères, il s'agit donc d'un String

Question 8
----------

.. code-block:: java

        char c = '0' ;

.. class:: positive

- Oui

.. class:: negative

- Non

.. class:: comment-feedback

  Tout les caractères du code ASCII sont des char

Question 9
----------

Quel type de variable utiliseriez-vous pour stocker la population mondiale ?

.. class:: positive

- long

.. class:: negative

- char

- boolean

- int

  .. class:: comment-feedback

    le valeur maximale d'un int est 2147483647

- double

.. This line include the "check your answer" button that gives a note to the student and mark questions with the correct marker if the answer is to good one, or the incorrect marker if not.

.. raw:: html

  <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

.. author::

    Fitvoye Florian, Mottet Sébastien, Charlier Gilles
