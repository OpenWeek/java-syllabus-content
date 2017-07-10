.. Cette page est publiée sous la license Creative Commons BY-SA (https://creativecommons.org/licenses/by-sa/3.0/fr/)

.. raw:: html

  <script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="static/js/jquery-shuffle.js"></script>
  <script type="text/javascript" src="static/js/rst-form.js"></script>
  <script type="text/javascript" src="static/js/prettify.js"></script>
.. This variable hold the number of proposition shown to the student

  <script type="text/javascript">$nmbr_prop = 3</script>

.. author::

    Alexandre Fiset et Jean-Martin Vlaeminck

=========================
La boucle while : QCM
=========================

-----------------------------------------
Question 1. Sémantique de la boucle while
-----------------------------------------

Quel bout de code est valide en Java ?

.. class:: positive
	
	- .. code-block:: java

	    	int i = 0;
	    	while(i != 10 )
	    	{
	      		System.out.println(i);
	      		i++;
	    	}


.. class:: negative
	
	- .. code-block:: java

		while(i != 10 )
    		{
      			System.out.println(i);
      			i++;
    		}


.. class:: negative
	
	- .. code-block:: java

		int i = 0;
		while(i = 10 )
		{
			System.out.println(i);
      			i++;
		}

.. class:: negative
	
  	- .. code-block:: java

		while(i < 10 )
		{
			int i = 0;
      			System.out.println(i);
      			i++;
    		}


-----------------------------------------------
Question 2. Sémantique de la boucle do...while.
-----------------------------------------------

Quel bout de code est valide en Java ?

.. class:: positive
	
	- .. code-block:: console
		
		int i = 0;
	    	do{
			system.out.println(i);
			i++;
		}while(i<10);


.. class:: negative
	
	- .. code-block:: console

		int i = 0;
		{
			system.out.println(i);
			i++;
		}while(i<10);


.. class:: negative
	
	- .. code-block:: console

    		do{
			int i = 0;
			system.out.println(i);
			i++;
		}while(i<10);


.. class:: negative
	
	- .. code-block:: console
		
		int i = 0;
	    	do{
			system.out.println(i);
			i++;
		}while(i<10)

---------------------------
Question 3. Boucle infinie.
---------------------------

Quel bout de code ne provoque pas une boucle infinie ?

.. class:: positive
	
	- .. code-block:: console
		
		int i = 0;
		do{
			system.out.println(i);
			i+=2;
		}while(i<10);


.. class:: negative
	
	- .. code-block:: console

		int i = 0;
		{
			system.out.println(i);
			i=i+3;
		}while(i!=10);


.. class:: negative
	
	- .. code-block:: console

		int i = 1;
		int a = 0;
		while(i = a +1 )
		{
			i+=2;
		}


.. class:: negative
	
	- .. code-block:: console
		
		int i = 0;
		while(i<10)
		{
			i = i-1;
		}

--------------------------------------
Question 4. Boucle while et exécution.
--------------------------------------

Quelle est la sortie sur le terminal (sortie standard) du bout de code suivant ?

.. code-block:: console
		
		int i = 0;
		while(i =< 10)
		{
			if(i%2 == 0)
			{
				System.out.println(i++);
			}
			else
			{
				i++;
			}
		}
		


.. class:: negative
	
	- .. code-block:: console
		
		1
		2
		3
		...
		11


.. class:: negative
	
	- .. code-block:: console

		1
		2
		3
		...
		9

.. class:: positive
	
	- .. code-block:: console

		1
		3
		5
		...
		11


.. class:: negative
	
	- .. code-block:: console
		
		0
		2
		4
		...
		10

.. class:: negative
	
	- Le bout de code n'est pas valide sous java ou la boucle est infinie.


-------------------------------------------
Question 5. Boucle do...while et exécution.
-------------------------------------------

Quelle est la sortie sur le terminal du bout de code suivant ?

.. code-block:: console
		
		int i = 0;
		do
		{
			i++;
			System.out.println(i);
		}while(i < 10);
		


.. class:: negative
	
	- .. code-block:: console
		
		0
		1
		2
		...
		9


.. class:: negative
	
	- .. code-block:: console

		1
		2
		3
		...
		11

.. class:: positive
	
	- .. code-block:: console

		1
		2
		3
		...
		10


.. class:: negative
	
	- Le bout de code n'est pas valide sous java ou la boucle est infinie.


.. raw:: html

    <div id="checker" class="checker"><h1>Vérifiez vos réponses</h1><input type="submit" value="Vérifier" id="verifier"></div>

