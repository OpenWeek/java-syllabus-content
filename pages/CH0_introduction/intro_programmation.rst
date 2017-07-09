.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. author::

        Gilles Charlier, Alexandre Fiset, Florian Fitvoye, Arnaud Gellens, Antoine Habran, Pablo Gonzalez Alvarez, François Michel, Sébastien Mottet, Antoine Lambot, Maxime Mulamba, Marie-Marie van der Beek et Jean-Martin Vlaeminck

===============================================
Introduction : qu'est-ce que la programmation ?
===============================================

Avant de commencer à apprendre la programmation, qui plus est en langage Java, il est nécessaire de d'abord présenter ce qu'est la programmation, comment fonctionne un ordinateur, ainsi que diverses autres choses. Cela vous permettra de mieux comprendre "le paysage mental" dans lequel vous allez évoluer dans ce cours.

La programmation, c'est un ensemble d'activités qui consiste à écrire un programme informatique. Un programme informatique, c'est un ensemble d'opérations, d'instructions, de commandes qui sont effectuées sur un ordinateur, avec un but bien précis ; par exemple, un éditeur de texte (tel que Bloc-Note ou Notepad++), un navigateur web (tel que Chrome ou Firefox), un programme de synchronisation de documents (tel que Dropbox ou OneDrive), ou encore un système d'exploitation entier (tel que GNU/Linux, macOS ou Windows). La clé pour comprendre les programmes informatiques est de comprendre les ordinateurs.

------------------------------
Fonctionnement des ordinateurs
------------------------------

Vous avez très certainement déjà croisés des ordinateurs (ne serait-ce que celui derrière (ou devant) lequel vous vous trouvez) : ordinateur portable, station de travail, smartphone, tablette, Raspberry Pi... ils sont désormais incontournables.

De manière générale, les ordinateurs sont constitués d'un certain nombre de composants, qui interagissent entre eux :

* Le *processeur*, le cerveau de l'ordinateur, qui exécute véritablement vos programme, à la façon d'une calculatrice avancée, pour afficher vos photos de vacances à l'écran par exemple.
* La *mémoire vive* (RAM), qui retient des informations utiles à l'ordinateur, tant qu'il est allumé, et qui contient notamment les programmes que vous exécutez pour le moment, comme le programme qui affiche vos photos de vacances, ainsi que les photos elles-même.
* Les *dispositifs de stockage*, du type disque dur, clé USB ou disque SSD, qui retient des informations requises à long terme, comme vos photos de vacances, vos documents, mais aussi l'ensemble des programmes de votre ordinateur, en cours d'exécution ou non.
* La *carte réseau*, qui permet de se connecter au fameux Wi-Fi qui se déconnecte si souvent, ou au câble qui se déconnecte moins souvent, et qui permet de partager ces photos de vacances avec le reste du monde.
* Des *ports de connection et de communication* comme l'USB, l'Ethernet, l'HDMI, le slot de carte SD, qui permettent de connecter des *périphériques* supplémentaires à l'ordinateur, comme une imprimante, un écran supplémentaire, du stockage supplémentaire, une connection Internet...

Tous ces éléments sont généralement reliés entre eux par la *carte mère*, qui permet à tous les dispositifs de l'ordinateur de communiquer entre eux. Chacun de ces composants a son importance et son utilité, mais dans ce cours introductif, nous ne nous intéresserons qu'à deux d'entre eux : le processeur et la mémoire vive.

Le processeur
=============

Le processeur est le cerveau de l'ordinateur. C'est lui qui exécute vos programmes, effectue les calculs, provoque l'affichage de vos programmes sur votre écran, et bien d'autre chose. En tant que tel, on peut lui demander de faire de nombreuses choses, comme des opérations arithmétiques, des transferts de données d'une mémoire à une autre, ou des interactions avec d'autres dispositifs.

Si le processeur exécute les programmes, c'est parce qu'il est commandé par les programmes : ceux-ci sont en effet constitués d'n grand nombre de commandes, nommées **instructions**, qui permettent de donner des ordres au processeur. De la même manière que vous ne pouvez demander à quelqu'un de vous servir du café que si vous lui parlez dans une langue qu'il comprend, il faut utiliser un langage spécial pour communiquer avec le processeur : le **langage machine**. C'est un langage pas très beau à voir : en effet, il s'agit de binaire, une suite de 0 et de 1 qui, pour l'ordinateur, a un sens, mais qui, pour nous autre humains, n'en a aucun. N'importe quel programme contient ainsi des millions d'instructions écrites en binaire, pour des dizaines de millions de 0 et de 1... Evidemment, personne n'écrit en langage machine ses programmes. Un peu plus "haut dessus de la machine", un peu éloigné de la dure réalité, on a le *langage assembleur*, qui utilise des mots un peu plus compréhensibles. Un peu plus :

.. code-block:: asm

        movl $1, %eax
        movl 8(%esp), %ebx
        addl %eax, %ebx
        movl %ebx, 4(%esp)

La très grande majorité des programmeurs ne code pas en assembleur, mais dans des langages de plus haut niveau. Un de ces langages de haut niveau est justement Java, qui va nous permettre d'écrire beaucoup plus simplement

.. code-block:: java

        b = a + 1;

La mémoire vive
===============

Si le processeur est le cerveau de l'ordinateur, alors la mémoire vive est la mémoire à court terme. C'est elle qui va par exemple retenir le calcul que le programme effectue, ses opérandes, son résultat, ainsi que les prochains calculs à effectuer (les prochaines instructions). Elle contient donc chaque programme (ses instructions en langage machine) en cours d'exécution sur l'ordinateur, des données utiles à chacun de ces programmes (résultats de calculs, photos à afficher, le texte que vous êtes en train de lire).

La mémoire vive est constituée d'un ensemble de cases numérotées (des tiroirs) pouvant contenir toutes ces informations. Ces cases sont nommées des **variables** (elles changent généralement durant l'exécution du programme). Le processeur dispose d'un grand nombre d'instructions permettant de récupérer la valeur de n'importe quelle variable en mémoire vive, et peut aussi modifier cette valeur. Un programme peut demander à l'ordinateur un nouveau tiroir, pour son utilisation personnelle, et peut alors stocker différentes informations dedans.

L'exécution d'un programme
==========================

En pratique, un programme sera exécutée en une série d'étape, mettant en relation les deux principaux composants de l'ordinateur. Tout d'abord, au lancement du programme (quand vous cliquez sur le logo multicolore de Chrome), celui-ci est chargé en mémoire vive pour pouvoir être exécuté. Ensuite, chacune des instructions du programme va être lue par le processeur, reconnue et exécutée, avec généralement des modifications de la mémoire vive, et l'instruction suivante sera exécutée.

------------------------------------------------------------------------------
Java en pratique : la JVM, le JDK, les IDE et l'interface en ligne de commande
------------------------------------------------------------------------------

Maintenant que les programmes informatiques sont expliqués, décrivons un peu la programmation en elle-même.

Un programme est généralement écrit dans un **langage de programmation**, qui est généralement conçu pour être lisible facilement par un humain, et en même temps suffisamment logique que pour pouvoir être traduit par l'ordinateur. Il existe pleins de langages de programmation, comme Python, Java, C++, C, Javascript, qui ont chacun leurs avantages et leurs inconvénients.

Le programme est écrit dans des fichiers texte qu'on appelle **fichier source**. Ce sont des fichiers spéciaux, créés avec des éditeurs de texte (comme Bloc-Note), et non avec des traitement de texte (comme Word). Un exemple de contenu de fichier source est le suivant, qui constitue aussi le code minimum à écrire en Java :

.. code-block:: Java

        public class Main {
                public static void main(String[] args) {
                        System.out.println("Hello, world!");
                }
        }

Un programme va contenir de nombreux fichiers de ce type, avec un grand nombre de lignes (des *lignes de codes*). Le problème, c'est que le processeur ne comprend pas ces fichiers ; il va falloir les lui traduire. Pour cela, on utilise un programme nommé **compilateur**, qui va traduire ces fichiers de code source en langage machine, pouvant être exécutées par l'ordinateur.

Dans le cas de Java, c'est un peu plus compliqué : en fait, le programme est traduit dans un *bytecode*, qui sera ensuite traduit en langage machine lors de l'exécution par un programme nommé *machine virtuelle Java* (la JVM, *Java virtual Machine*). Cela permet de ne compiler qu'une seule fois, mais de pouvoir exécuter le programme sur énormément d'ordinateurs.

Pour pouvoir programmer, il va donc falloir différents programmes :

* La fameuse JVM, généralement comprise dans un logiciel nommé *Java Runtime Environment* (JRE). Il y a de fortes chances qu'il soit déjà installé sur votre ordinateur, vu le nombre de logiciels utilisant Java aujourd'hui.
* Un compilateur Java, généralement comprise dans un logiciel nommé *Java Development Kit* (JDK). Il y a de fortes chances qu'il faille l'installer sur votre ordinateur.
* Un éditeur de fichier de code source. Un logiciel tel que le Bloc-Note suffit, mais on préfère généralement des programmes un peu plus puissants, qu'on appelle des *environnements de développement intégrés* ou IDE. Un IDE particulièrement simple est *BlueJ*, tandis qu'un IDE plus puissant mais plus complexe est *Eclipse*.

.. TODO : rajouter des liens, un peu simplifier pour rednre plus user-friendly.


