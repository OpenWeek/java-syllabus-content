=========================
Créer une tâche INGInious
=========================

Les pages du syllabus sont constituées d'une partie de **théorie** et d'une partie d'**exercice**. L'ajout d'un exercice
se fait en deux étapes.

Étape 1. Créer l'exercice INGInious
===================================

La première étape consiste à créer l'exercic INGInious. Un exercice INGInious est un dossier dont la structure minimale est la suivante:

.. code-block::

    .
    ├── task.yaml # Fichier contenant la configuration de la tâches.
    ├── run # Script de lancement des tests et d'envoie du résultat
    ├── student # Dossier dans lequel sera exécuté la soumission de l'étudiant.
        ├── ...

**Attention** les tâches que vous créer doivent se trouver dans le dossiers ``INGInious_storage/tutorial``, où ``INGInious_storage``
est le chemin jusqu'à l'endroit dans lequel vous stocker vos cours (voir installation d'INGInious).

Vous pouvez créer les tâches via une interface graphique en lançant votre instance d'inginious via la commande
``inginious-webapp`` et en allant à l'addresse http://127.0.0.1:8080/.

Dans le dossiers ``student/``, vous devez au moins fournir les tests pour votre tâches ainsi qu'un fichier qui servira de
réceptacle pour le code de l'étudiant. De plus, il est important de noter que lors de l'exécution des tests, vous n'aurez accès
qu'à ce qui se trouve dans ``student/``.

Étape 2. Insérer la tâche dans le fichier .rst
==============================================

Une fois que vôtre tâche est créée, vous devez l'insérer dans votre fichier. Pour cela, vous aurez besoin d'utiliser la directive
rST **inginious**. Supposons que nous avons une tâche nomée ``Test``. Nous pouvons alors l'ajoutée via le bout de code suivant:

.. code-block::

    .. inginious:: Test


Si en plus, vous désirez mettre un début de bout de code dans l'encadré pour le code, vous pouvez rajouter ce contenu de la manière suivante:

.. code-block::

    .. inginious:: Test

        public static void main(String [] args) {
            /* à compléter */
        }
