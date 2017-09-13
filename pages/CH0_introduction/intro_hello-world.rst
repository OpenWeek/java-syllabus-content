.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

        Gilles Charlier, Alexandre Fiset, Florian Fitvoye, Arnaud Gellens, Antoine Habran, Pablo Gonzalez Alvarez, François Michel, Sébastien Mottet, Antoine Lambot, Maxime Mulamba, Marie-Marie van der Beek et Jean-Martin Vlaeminck

============================
Introduction au langage Java
============================

Maintenant que vous avez une idée de ce qu'est la programmation, il est grand temps de commencer réellement votre apprentissage, et notamment de découvrir Java.

-------------
Hello, world!
-------------

La tradition veut que, lorsqu'on débute un cours de programmation, le premier programme que l'on écrit et que l'on découvre est un programme qui se contente d'afficher sur la sortie standard la phrase ``Hello, world!`` ("Bonjour, le monde !" littéralement). Voici un code source qui effectue justement cela :

.. inginious:: execute_main_from_class

        public class Hello
        {
                public static void main(String[] args) {
                        System.out.println("Hello, world!");
                }
        }

Vous pouvez directement exécuter ce code sur ce site internet en cliquant sur le bouton "Soumettre".
Pour pouvoir exécuter ce programme sur votre propre ordinateur, copiez-collez le code ci-dessus dans BlueJ, enregistrez-le dans un fichier nommé ``Hello.java`` (la majuscule et l'extension du fichier sont importantes - vérifiez bien que votre système d'exploitation ne s'amuse pas à rajouter un ``.txt`` ou autre à la fin !), et compilez-le ; avec BlueJ, il suffit d'appuyer sur "Compile". Une fois qu'il est compilé sans encombre, et que vous n'avez pas de message d'erreur (ça ne devrait pas arriver), vous pouvez l'exécuter avec le bouton "Execute". BlueJ ouvrira alors une nouvelle fenêtre, contenant un petit salut amical. Bravo, vous avez exécuté votre premier programme Java ! :-)


Détaillons un peu le code ci-dessus, qui est déjà relativement chargé.

``public class Hello``
=========================

Cette première ligne déclare ce que l'on appelle une *classe*. Pour ce chapitre, vous n'avez pas besoin de savoir ce dont il s'agit, juste que vous devrez mettre l'ensemble des fonctions (nous y reviendrons) et des variables globales (également) entre l'accolade ``{`` de la ligne 2 et l'accolade fermante de la ligne 7.

Pour les curieux : les classes constituent les briques de base du langage Java, et particulièrement d'une technique de programmation appelée *programmation orientée objet*. Java requiert obligatoirement au moins une classe pour pouvoir fonctionner, au point que l'auteur de cette page aime qualifier Java de "langage obsédé objets". Dans ce premier chapitre, nous ne verrons pas la programmation orientée objet.

``public static void main(String[] args)``
=============================================

Cette ligne déclare ce que l'on appelle une *méthode* (vous avez peut-être déjà croisé le terme *fonction* au lieu de méthode si vous avez déjà utilisé de langages non orienté objet). Une méthode est un ensemble d'instructions qui peut être exécuté par un autre point du programme, sans avoir besoin de répéter ces instructions à plusieurs endroits du code (on appelle cela *découpe en sous-problèmes*: chaque méthode résolvant un sous problème spécifique du problème global) et avec des petites variantes via ce qu'on appelle des *arguments*. Les méthodes seront vues dans un chapitre ultérieur et vous pouvez donc considérer, jusqu'à ce futur chapitre, que l'ensemble du code des prochains chapitres devra être écrit entre l'accolade ouvrante à la fin de la ligne 3 et l'accolade fermante de la ligne 5.

``System.out.println("Hello world!");``
==========================================

Il s'agit enfin de la première (et unique) instruction de notre programme ! Celle-ci affiche la *chaine de caractères* (texte) comprise entre les guillemets anglais ``"`` à l'écran. Pour cela, on utilise une fonction, ``System.out.println``. Celle-ci a pour rôle d'afficher une ligne de texte, la ligne de texte étant spécifiée comme paramètre, entre les parenthèses ``(...)``. En Java, les chaines de caractères (nommées ``String``) sont comprises entre guillemets, et permettent de stocker du texte. Enfin, il y a un point-virgule à la fin de la ligne, marquant la fin de l'instruction.

Pour le moment, ce programme est relativement léger, avec une seule instruction. On peut bien évidemment rajouter des instructions, pour afficher un bonjour dans d'autres langues :

.. inginious:: execute_java

        System.out.println("Goeiedag allemaal !");
        System.out.println("Hola Mundo!");

.. TODO mettre le point d'exclamation inversé

D'ailleurs, les encarts de code dans ce syllabus sont modifiables ; pourriez-vous modifier le programme ci-dessous pour qu'il affiche "Bonjour !" à la place de "Hello, world!" ? Pour vous assurer que votre programme est correct, vous pouvez appuyer sur le bouton "Soumettre" : votre code sera alors corrigé automatiquement.

.. inginious:: CH0Q1_bonjour

        public class Hello
        {
                public static void main(String[] args) {
                        System.out.println("Hello, world!");
                }
        }

--------------------------
La syntaxe du langage Java
--------------------------

Comme tous les langages humains, les langages de programmation possèdent une *syntaxe*, un ensemble de règles à respecter pour obtenir un programme valide (mais qui n'est pas forcément correct !). Chaque langage a la sienne, et le petit exemple ci-dessus montre déjà un certain nombre d'éléments de syntaxe :

* Toutes les instructions se terminent par un point-virgule ``;``. Cela permet de bien voir la séparation des instructions, et cela permet au compilateur de déterminer la fin d'une instruction. En effet, même s'il vaut mieux ne mettre qu'une instruction par ligne (par clarté), on peut tout à fait en écrire plusieurs à chaque ligne (ce n'est fait que dans de très rares cas et on vous déconseille fortement de le faire).
* Les instructions doivent toujours être comprises dans des blocs de code, délimités par des accolades. C'est le cas pour les instructions dans une fonction et dans une classe. Dans d'autres cas, les accolades sont optionnelles, mais conseillées.
* Lors d'un appel de fonction, les arguments sont placés entre parenthèses.

Il y a bien d'autres règles de syntaxe, que vous verrez dans les prochains chapitre.
