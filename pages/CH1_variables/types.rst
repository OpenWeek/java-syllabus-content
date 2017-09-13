==================
Types de variables
==================

.. author::

    Fitvoye Florian, Mottet Sébastien, Charlier Gilles

Lorsque l'on déclare un variable en Java, on doit définir son **type**. Le type de la variable peut être vu comme la nature de la donnée qu'elle contient. Par exemple, une variable contenant le chiffre 1 sera de type entier (``int``).
Une variable Java ne peut contenir un autre type de donnée que celui défini lors de la déclaration.
Le compilateur renverra une erreur de syntaxe si on essaye d'assigner un mauvais type de donnée

Il existe 8 types intégrés dans Java appelés **types primitifs**, tout repose sur ces types primitifs.



(1) ``byte``, ``short``, ``int``, ``long`` : ces quatres types contiennent des entiers, chacun prenant une place différente en mémoire.
(2) ``float``, ``double`` : contiennent des nombres réels.
(3) ``char`` : contient un caractère unique comme ``'A'``, ``'*'``, ``'x'``, ``' '`` ainsi que des caractères spéciaux comme une tabulation (``'\\t'``) ou un retour à la ligne (``'\\n'``). Lorsque l'on utilise un caractère dans un programme, on doit rajouter des apostrophes (les ``' '``) sinon ``'*'`` devient * qui est le symbole de la multiplication.
(4) ``boolean`` : contient une des deux expressions logiques (``true`` ou ``false``), souvent le résultat d'expression logique (voir `le chapitre sur les expressions conditionnelles </CH3_conditionnelles/theorie>`_).

Pour comprendre la différence entre les types contenant des entiers (ou des réels), il faut s'intéresser à la manière dont une donnée est stockée en mémoire.
Une donnée est stockée sous forme de nombre binaire, c'est à dire une séquence de ``0`` et de ``1``.
Un seul ``0`` ou ``1`` est appellé un bit. Un séquence de 8 bits est appellé un byte. Généralement, on caractérise la taille d'un espace de stockage ou d'un fichier en bytes et non en bits.

* Un ``byte`` est donc un entier encodé sur 1 byte, il y a donc 256 séquences possibles avec des 0 et 1 (de ``00000000`` à ``11111111``), correspondant à l'intervalle allant de -128 à 127.
* Un ``short`` est un entier encodé sur 2 bytes, correspondant à l'intervalle allant de -32768 à 32767
* Un ``int`` est un entier encodé sur 4 bytes, correspondant à l'intervalle allant de -2147483648 à 2147483647
* Un ``long`` est un entier encodé sur 8 bytes, correspondant à l'intervalle allant de -9223372036854775808 à 9223372036854775807. Pour l'utiliser dans le programme il faut rajouter un 'L' à la fin du nombre (par exemple: ``long x = 1002L``).
* Un ``float`` est un réel encodé sur 4 bytes, permettant d'avoir jusqu'à 7 chiffres significatifs. Pour l'utiliser dans le programme il faut rajouter un 'F' ou 'f' (par exemple: ``float x = 1.2F``).
* Un ``double`` est un réel encodé sur 8 bytes, permettant d'avoir jusqu'à 15 chiffres significatifs.
* Un ``char`` est encodé sur 2 bytes.

Le type ``int`` est suffisant pour la plupart des utilisations avec les entiers et le ``double`` avec les réels. En général, on va utiliser un ``float`` si on travaille sur un ordinateur qui dispose de **très très peu** de mémoire vive.

Il existe d'autres types de données en Java dont le plus utilisé est le ``String`` qui est une séquence, une chaine de caractères
et est délimité par des guillemets (exemple : ``String s = "Hello World !"``).

Le type ``char``
****************

(Cette section est un complément d'information : vous ne devez pas la lire maintenant pour comprendre les chapitres suivants, mais elle est toujours utile.)

Le type ``char`` est un peu particulier. Même s'il est conçu pour contenir des caractères et non des nombres, on peut effectuer les mêmes opérations que sur un ``short`` : addition, soustraction, multiplication... ce qui permet, par exemple, de passer au caractère suivant dans l'alphabet. L'analogie a des limites ; toutes les opérations n'ont pas forcément un sens, et ne donnent pas spécialement un caractère logique.

En fait, pour comprendre comment fonctionne le type ``char``, il faut expliquer en partie la manière dont sont codés les caractères. Rappelons que pour un ordinateur, il n'y a que des zéros et des uns, ou des ensembles de zéros et de uns, les bytes. Un ordinateur ne sait pas ce que sont des lettres, il ne connait que des nombres. Pour pouvoir traiter avec un ordinateur, les informaticiens ont dû trouvé un moyen de coder l'alphabet avec des nombres. Le principal encodage qui a été utilisé est l'ASCII (*American Standard Code for Information Interchange*), qui permet de coder chaque caractère de l'alphabet, majuscules et minuscules, ainsi que les chiffres et d'autres symboles, en des nombres entiers de 8 bits, allant de 0 à 127. La table suivante présente la correspondance entre un entier (colonne Décimal) et le caractère correspondant (colonne Caractère). Les caractères 0 à 31 sont particuliers, ce sont des caractères de contrôle, qui ne s'affichent pas.

+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| Décimal | Signification                    | Caractère || Décimal | Caractère || Décimal | Caractère || Décimal | Caractère | Signification       |
+=========+==================================+===========++=========+===========++=========+===========++=========+===========+=====================+
| 0       | NULL                             | NULL      || 32      | espace    || 64      | @         || 96      | \`        |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 1       | start of heading                 | SOH       || 33      | !         || 65      | A         || 97      | a         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 2       | start of text                    | SOT       || 34      | "         || 66      | B         || 98      | b         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 3       | end of text                      | ETX       || 35      | #         || 67      | C         || 99      | c         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 4       | end of transmission              | EOT       || 36      | $         || 68      | D         || 100     | d         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 5       | enquiry                          | ENQ       || 37      | %         || 69      | E         || 101     | e         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 6       | acknowledge                      | ACK       || 38      | &         || 70      | F         || 102     | f         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 7       | bell                             | BEL       || 39      | '         || 71      | G         || 103     | g         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 8       | backspace (supprimer,            | BS        || 40      | (         || 72      | H         || 104     | h         |                     |
|         | espacement arrière)              |           ||         |           ||         |           ||         |           |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 9       | horizontal tab                   | HT        || 41      | )         || 73      | I         || 105     | i         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 10      | line feed (saut de ligne)        | LF        || 42      | \*        || 74      | J         || 106     | j         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 11      | vertical tab                     | VT        || 43      | \+        || 75      | K         || 107     | k         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 12      | form feed (saut de page)         | FF        || 44      | ,         || 76      | L         || 108     | l         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 13      | carriage return (retour chariot, | CR        || 45      | \-        || 77      | M         || 109     | m         |                     |
|         | retour à la ligne)               |           ||         |           ||         |           ||         |           |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 14      | shift out (code spécial)         | SO        || 46      | .         || 78      | N         || 110     | n         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 15      | shift in (code standard          | SI        || 47      | /         || 79      | O         || 111     | o         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 16      | data link escape                 | DLE       || 48      | 0         || 80      | P         || 112     | p         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 17      | device control 1                 | DC1       || 49      | 1         || 81      | Q         || 113     | q         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 18      | device control 2                 | DC2       || 50      | 2         || 82      | R         || 114     | r         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 19      | device control 3                 | DC3       || 51      | 3         || 83      | S         || 115     | s         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 20      | device control 4                 | DC4       || 52      | 4         || 84      | T         || 116     | t         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 21      | negative acknoledgement          | NAK       || 53      | 5         || 85      | U         || 117     | u         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 22      | synchronous idle                 | SYN       || 54      | 6         || 86      | V         || 118     | v         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 23      | end of transmission block        | ETB       || 55      | 7         || 87      | W         || 119     | w         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 24      | cancel (annulation)              | CAN       || 56      | 8         || 88      | X         || 120     | x         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 25      | end of medium                    | EM        || 57      | 9         || 89      | Y         || 121     | y         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 26      | substitute                       | SUB       || 58      | :         || 90      | Z         || 122     | z         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 27      | escape (échappement)             | ESC       || 59      | ;         || 91      | [         || 123     | {         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 28      | file separator                   | FS        || 60      | <         || 92      | \         || 124     | |         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 29      | group separator                  | GS        || 61      | =         || 93      | ]         || 125     | }         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 30      | record separator                 | RS        || 62      | >         || 94      | ^         || 126     | ~         |                     |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+
| 31      | unit separator                   | US        || 63      | ?         || 95      | _         || 127     | DEL       | delete (effacement) |
+---------+----------------------------------+-----------++---------+-----------++---------+-----------++---------+-----------+---------------------+

Vous l'aurez remarqué, comme c'est un standard américain, il est impossible de coder les lettres accentuées du français (é, è, ù). Pour remédier à cela, différents autres codages ont été créés au fil des années, jusqu'à l'apparition du standard *Unicode*, pouvant potentiellement coder tous les caractères de toutes les langues de la Terre, passées, présentes et futures, y compris les *emojis*. Java utilise Unicode pour le type ``char``, ce qui lui permet de gérer tous les caractères en pratique.

Comme les caractères sont en fait codés comme des nombres, il est possible d'effectuer des opérations dessus. Par exemple, le caractère 'a' correspond au nombre 97. Si on ajoute 10 caractères supplémentaires, on obtient 107, qui est le nombre correspondant à la lettre 'k', qui est la 11e lettre de l'alphabet (et donc, 10 lettres après 'a'). Ainsi, on peut écrire le code suivant (que vous comprendrez mieux après avoir lu le chapitre suivant) :

.. inginious:: execute_java

      char B = 'A' + ('b' - 'a'); // décale 'A' du même écart de lettres qu'il y a entre 'b' et 'a' (c'est à dire 1)
      System.out.println(B); // affiche 'B'
      B = 'A' + 1;				// donne la même valeur qu'à la ligne 1
      System.out.println(B); // affiche une deuxième fois 'B'

.. m

Exercice
********

Dans cette question nous allons vous demander de déclarer et d,initialiser plusieurs variables. Nous ne vous donnons pas leur type, c'est à vous de le déterminer grâce aux informations fournies.

1) Déclarez et initialisez une variable nommée ``piVal`` contenant la valeur de pi ***avec deux chiffres significatifs après la virgule***. (utilisez le moins de mémoire possible)

2) Déclarez une variable entière nommée ``popWorld`` pouvant contenir le nombre d'êtres humains vivants sur terre et ***initialisez la à 0***.

3) Déclarez et initialisez une variable nommée ``c`` contenant la 17ème lettre de l'alphabet en miniscule.

.. inginious:: CH1Q1_affectation

        /*
         * Votre code ici
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
