Comprendre le compilateur
=========================

.. author::

    Olivier Goletti

Le langage Java est un langage dit **compilé**. Cela signifie que, avant d'être exécuter, le code doit être compilé. C'est le **compilateur** (``javac`` dans notre cas) qui va s'en occupé. Il faut que le code source d'un programme respecte la syntaxe de java pour qu'il puisse être correctement compilé. Quand ce n'est pas le cas, le compilateur essaie tant bien que mal de comprendre le texte qu'il essaie de compiler et imprime une erreur en cas de soucis. Dans son message, le compilateur essayera d'indiquer la ligne de l'erreur, ce qu'il pense être l'erreur et un endroit de la ligne où il a rencontré un problème.

En tant que programmeur débutant, il faut donc s'accoutumer à recevoir, lire et comprendre les messages du compilateur qui ne sont pas toujours aussi clairs qu'on pourrait l'espérer. En effet, une erreur de syntaxe peut être due à un oubli, une mauvaise compréhension voire une faute de frappe. Et dans tous les cas, une bonne compréhension de la syntaxe et de ces messages d'erreur permettra de pouvoir se concentrer sur le fond (ce que fait le programme) plutôt que sur la forme ou en tous cas la façon de l'écrire pour qu'il fasse effectivement quelque chose.

Parmi les erreurs les plus courantes, il faut toujours veiller à passer en revue celles-ci :

- Un caractère fermant correspondant à un caractère ouvrant : les ``( )``, les ``{ }``, les ``" "``. Dans ce cas-ci le compilateur pense que la chaîne de caractères ouverte par le premier guillemet n'est toujours pas fermée, ce qui peut lui faire penser que toute la suite du programme en fait partie.
- Une faute de frappe (voire simplement de casse) dans un identifiant qui fait penser à java qu'on cherche à utiliser quelque chose d'inconnu
- Un point virgule ``;`` manquant à la fin d'une instruction

Voici une série de message d'erreur que vous pourriez rencontrer lors de vos exercices et leur signification :

Pour le code suivant : 

.. code-block:: console

	public class Hello {
	   public static void main (String[] args {
	      System.out.println("Hello, world !");
	   } 
	} 

Le compilateur renvoie le message suivant :

.. code-block:: console

	Hello.java:2: error: ')' expected
	   public static void main (String[] args {
		                                 ^
	1 error

Il manquait bien une parenthèse à cet endroit-là.

Pour le code suivant : 

.. code-block:: console

	public class Hello {
	   public static void main (String[] args) {
	      System.out.println("Hello, world !");
	    
	} 

Le compilateur renvoie le message suivant :

.. code-block:: console

	Hello.java:5: error: reached end of file while parsing
	}
	 ^
	1 error

Il manquait bien une accolade à la fin de la méthode ``main``

Pour le code suivant :

.. code-block:: console

	public class Hello {
	   public static void main (String[] args) {
	      System.out.println("Hello, world !);
	   }
	} 

Le compilateur renvoie le message suivant :

.. code-block:: console

	Hello.java:3: error: unclosed string literal
	      System.out.println("Hello, world !);
		                 ^
	Hello.java:3: error: ';' expected
	      System.out.println("Hello, world !);
		                                  ^
	Hello.java:5: error: reached end of file while parsing
	}
	 ^
	3 errors

Ici les choses se complique. Mais toutes les erreurs sont liées à la même erreur, comme indiqué dans le premier message, la chaîne de caractères n'a pas été fermée correctement.

Pour le code suivant :

.. code-block:: console

	public class HelloTest {
	   public static void main (String[] args) {
	      System.out.println(hello);
	   }
	} 

Le compilateur renvoie le message suivant :

.. code-block:: console

	Hello.java:1: error: class HelloTest is public, should be declared in a file named HelloTest.java
	public class HelloTest {
	       ^
	Hello.java:3: error: cannot find symbol
	      System.out.println(hello);
		                 ^
	  symbol:   variable hello
	  location: class HelloTest
	2 errors

La première erreur indique que le nom de la classe ne correspond pas au nom du fichier comme attendu.
La deuxième qu'il ne connait pas le symbole ``hello``. 

Pour le code suivant :

.. code-block:: console

	public class Hello {
	    public static void main (String[] args) {
		System.out.println("Hello, world !")
	    } 
	}

Le compilateur renvoie le message suivant :

.. code-block:: console

	Hello.java:3: error: ';' expected
		System.out.println("Hello, world !")
		                                    ^
	1 error

Qui est de nouveau assez clair.


