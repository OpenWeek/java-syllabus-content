.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

.. author::

   Alexandre Fiset et Jean-Martin Vlaeminck

La boucle for
=============

Présentation
------------

Jusqu'à présent, nous avons vu la boucle ``while`` (et sa congénère la boucle ``do...while``). Celle-ci permet de réaliser toutes les boucles existantes en pratique, et on pourrait s'en contenter pour la suite. Néanmoins, il existe un autre type principal de boucle, qui est bien plus utilisé en pratique : la boucle ``for``.

Vous l'avez sans doute remarqué, en Java, on doit souvent écrire des boucles dans lesquelles on déclare une ou plusieurs variables avant la boucle, que l'on incrémente ensuite dans la boucle, et dont on vérifie la valeur dans la condition de la boucle. Par exemple,

.. code-block:: java

        int i = 0;
        while (i <= 5) {
                System.out.println("Coucou " + i + " fois.");
                i = i + 1;
        }

ou encore

.. code-block:: java

        int i = 10;
        System.out.print("Décollage dans ");
        while (i >= 1) {
                System.out.print(i + " ");
                i = i - 1;
        }
        System.out.println();
        System.out.println("Décollage !");

ou encore

.. code-block:: java

        System.out.println("Combien de tasse de café me faut-il ?");
        int i = 1;
        while (i < 10) {
                System.out.println(i + " tasses de caffé ?");
                i = i + 1;
        }
        System.out.println("Pfiou, ça fait beaucoup");

Toutes ces boucles comprennent des caractéristiques communes :

* la déclaration et/ou l'initialisation d'une variable avant d'entrer dans la boucle (par exemple, la variable ``i`` dans chacun des exemples ci-dessus) ;
* la condition de boucle utilisant cette variable pour déterminer s'il faut sortir de la boucle ou non, généralement par une comparaison ;
* un certain nombre d'instructions manipulant la variable (par exemple, les différents affichages avec ``System.out.println``) ;
* le changement de la valeur de la variable à la fin de ces instructions, généralement par un incrémentation ou une décrémentation.

Ce type de boucles est tellement fréquente en pratique (elle est omniprésente dans les tableaux par exemple) que les concepteurs du langage ont créé une structure condensée, la boucle for :

.. code-block:: java

        for (<déclarations et initialisation>; <condition>; <incrémentations>) {
                <code>
        }

Détaillons la manière dont fonctionne cette boucle :

* La boucle commence par effectuer tout ce qui se trouve dans la section ``<déclaration et initialisation>`` : il s'agit d'une seule instruction, qui est généralement une déclaration et/ou initialisation d'une ou plusieurs variables de même type. Cette instruction n'est exécutée qu'une seule fois, avant le début de la boucle proprement dite.
* Ensuite, à chaque tour de boucle :

  * elle vérifie la condition de la section ``<condition>`` : si elle est vérifiée, les instructions suivantes sont exécutées ; sinon, le programme sort de la boucle
  * elle exécute le ou les instruction(s) contenues dans la section ``<code>``.
  * elle exécute enfin le ou les instructions contenues dans la section ``<incrémentation>`` : ces instructions sont généralement une incrémentation ou une décrémentation d'une variable, mais il est possible de mettre plusieurs incrémentations ou décrémentations, ou de mettre des instructions plus complexes (comme des appels de fonctions).

Comme exemples, réécrivons les exemples ci-dessus à l'aide d'une boucle ``for`` :

.. code-block:: java

        for (int i = 0; i <= 5; i = i + 1) {
                System.out.println("Coucou " + i + " fois.");
        }

.. code-block:: java

        System.out.print("Décollage dans ");

        for (int i = 10; i >= 1; i = i - 1) {
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Décollage !");

.. code-block:: java

        System.out.println("Combien de tasse de café me faut-il ?");

        for (int i = 1; i < 10; i = i + 1) {
                System.out.println(i + " tasses de café ?");
        }

        System.out.println("Pfiou, ça fait beaucoup");

.. tache INGInious : quelle est l'avant-dernière ligne affichée par le programme ?

Pour vérifier que vous ayez bien compris, quelle est l'avant-ernière ligne affichée par le programme ci-dessus ?

.. class:: positive

   - "9 tasses de café ?"

.. class:: negative

   - "10 tasses de café ?"

   - "8 tasses de café ?"

           .. class:: comment-feedback

              Est-ce que vous avez compté la ligne de code en dehors de la boucle à la fin ?

Comme vous pouvez le constater, ces boucles sont plus court que les boucles écrites avec un ``while``, et souvent plus lisibles quand on a l'habitude de s'en servir : l'initialisation de la variable de boucle, son incrémentation, et la condition de la boucle sont situées au même endroit, entre les parenthèses du ``for``, au lieu d'être situés à plusieurs endroits de la boucle ; c'est du condensé, en quelque sorte.

Quelques exemples
-----------------

Voyons quelques exemples de boucles construites avec la boucle ``for``.

Afficher l'alphabet
'''''''''''''''''''

Le code suivant affiche l'alphabet, de la lettre ``'A'`` à la lettre ``'Z'``.

.. code-block:: java

        for (char ch = 'A'; ch <= 'Z'; ch = ch + 1) {
                System.out.println(ch);
        }

Le code utilise une particularité du type ``char`` : sa ressemblance avec des entiers. En effet, même si un ``char`` est conçu pour contenir un caractère, que ce soit une lettre, un chiffre ou un idéogramme chinois, il est possible d'effectuer des opérations arithmétiques dessus, notamment des additions. Par exemple, le code suivant

.. code-block:: java

        char a = 'a';
        char c = a + 2;
        System.out.println(c);

affiche la lettre ``'c'``. Littéralement, ce code signifie de prendre la lettre 'a' décalée de deux caractères dans l'alphabet, c'est-à-dire 'c'. Cette petite astuce nous permet de parcourir tout l'alphabet latin, en commençant à 'A', en terminant à 'Z' et en passant au caractère suivant par ``ch = ch + 1``. (N'essayez pas d'aller plus loin que 'Z' néanmoins, vous trouverez des caractères qui ont relativement peu de sens.)

Déterminer si un nombre est premier
'''''''''''''''''''''''''''''''''''

Un nombre entier est qualifié de *premier* s'il ne possède que deux diviseurs entiers différents : 1 et lui-même. Les nombres premiers sont 2, 3, 5, 7, 11, 13, et une infinité d'autres. Pour vérifier qu'un nombre est premier, il suffit de compter son nombre de diviseurs, et de comparer à 2. Le programme suivant permet de vérifier si un nombre est premier

.. code-block:: java

        int nombre = 34;
        int nbreDiviseurs = 0;
        for (int diviseurTest = 1; diviseurTest <= nombre; diviseurTest = diviseurTest + 1) {
                if (nombre % diviseurTest == 0) // si le nombre diviseurTest divise notre nombre
                {
                        nbreDiviseurs = nbreDiviseurs + 1;
                }
        }
        if (nbreDiviseurs == 2) {
                System.out.println("Le nombre " + nombre + " est premier.");
        } else {
                System.out.println("Le nombre " + nombre + " n'est pas premier.");
        }

Exercice : nombres parfaits
...........................

A vous ! Pour votre première boucle ``for``, vous allez écrire un petit programme qui détermine si un nombre est parfait. Un *nombre parfait* est un nombre naturel dont la somme des `diviseurs stricts`_ est égale au nombre lui-même. Le nombre naturel à vérifier est stocké dans la variable ``n``. Le résultat final, un booléen indiquant si le nombre ``n`` est parfait,  doit être stocké dans la variable ``isPerfect`` à la fin de l'exécution de votre boucle. Pour vous aider, le code permettant de vérifier si un nombre est premier est déjà pré-rempli, à l'exception des paramètres de la boucle ``for``. Faites bien attention à la valeur initiale et finale de la variable de boucle !

.. _diviseurs stricts: https://fr.wikipedia.org/wiki/Diviseur_strict

.. inginious:: CH4Q2_nbrepft

        // int n = 34; Le nombre naturel à vérifier
        int nbreDiviseurs = 0;
        for (/*à compléter*/) {
                if (n % /*une variable*/ == 0)
                {
                        nbreDiviseurs = nbreDiviseurs + 1;
                }
        }
        if (nbreDiviseurs == 2) {
                isPerfect = true;
        } else {
                isPerfect = false;
        }

Boucles ``for`` imbriquées
--------------------------

Pour certains programmes, une boucle ``for`` ne suffit pas. Il faut très souvent utiliser deux ou plusieurs boucles ``for`` imbriquées. Par exemple, imaginons que vous souhaitiez afficher une table de multiplication à l'attention de votre petit frère. Voici un exemple d'une telle table, de 12 lignes et de 20 colonnes :

.. code-block:: java

   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20
   2   4   6   8  10  12  14  16  18  20  22  24  26  28  30  32  34  36  38  40
   3   6   9  12  15  18  21  24  27  30  33  36  39  42  45  48  51  54  57  60
   4   8  12  16  20  24  28  32  36  40  44  48  52  56  60  64  68  72  76  80
   5  10  15  20  25  30  35  40  45  50  55  60  65  70  75  80  85  90  95 100
   6  12  18  24  30  36  42  48  54  60  66  72  78  84  90  96 102 108 114 120
   7  14  21  28  35  42  49  56  63  70  77  84  91  98 105 112 119 126 133 140
   8  16  24  32  40  48  56  64  72  80  88  96 104 112 120 128 136 144 152 160
   9  18  27  36  45  54  63  72  81  90  99 108 117 126 135 144 153 162 171 180
  10  20  30  40  50  60  70  80  90 100 110 120 130 140 150 160 170 180 190 200
  11  22  33  44  55  66  77  88  99 110 121 132 143 154 165 176 187 198 209 220
  12  24  36  48  60  72  84  96 108 120 132 144 156 168 180 192 204 216 228 240

Les colonnes de la table ne sont pas alignées, mais Voici un code qui affiche une telle table :

.. code-block:: java

        int nLignes = 12; // contient le nombre de lignes de la table de multiplication
        int nColonnes = 20; // contient le nombre de colonnes de la table
        for (int i = 1; i <= nLignes; i++) { // parcourt chaque ligne de la table
                for (int j = 1; j <= nColonnes; j++) { // parcourt chaque colonne
                        System.out.print((i * j) + " ");
                }
                System.out.println();
        }

Le programme consiste de deux boucles ``for`` imbriquées. La première boucle parcourt chaque ligne de la table de multiplication, avec comme variable de boucle ``i``. La seconde boucle parcourt chaque colonne avec la variable de boucle ``j``. Après avoir affiché chaque colonne de la table de multiplication (et donc, après être sorti de la seconde boucle ``for``), il est nécessaire d'afficher un retour à la ligne, avec ``System.out.println()``.

Lorsqu'on utilise plusieurs boucles imbriquées, il est important de faire attention

* aux limites de la boucle for (valeur initiales et finales pour chaque dimension)
* aux variables de boucle utilisées dans chaque boucle : il est très fréquent (même pour les programmeurs expérimentés ,;-) ) d'inverser deux variables de boucles (généralement nommées ``i`` et ``j`` par habitude), que ce soit dans le code exécuté par les boucles ou dans les conditions utilisées dans la première ligne de l'un des ``for``.

Exercice : les erreurs classiques des boucles ``for``
'''''''''''''''''''''''''''''''''''''''''''''''''''''

Le programme ci-dessous contient un certain nombre d'erreurs classiques lors de l'utilisation de boucles imbriquées. Pouvez-vous les identifier et les afficher ? Indice : il y en a 5.

.. inginious:: CH4Q3_forforerror

        /*
         * Effectue la somme sur chaque ligne des n premiers nombres multiples de 1, 2, 3, ..., m
         */
         //*
         // int n = 17;
         // int m = 6;
         for (int i = 0; i <= n; i++) {
                 int sum = 0;
                 for (int j = 0; i <= m; j++) {
                         sum = sum + j * m;
                 }
                 System.out.println("Somme des " + n + " premiers nombres multiples de " + j + " : " + sum);
         }

.. Un autre exemple de boucles imbriquées TODO

Les boucles imbriquées sont beaucoup utilisées avec les tableaux, que vous verrez dans une prochaine section.

.. Bouton de validation pour les QCM

.. raw:: html

   <div id="checker" class="checker">
   <h1>Vérifiez vos réponses</h1>
   <input type="submit" value="Vérifier" id="verifier">
   </div>

