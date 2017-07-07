======================
Portee des variables
======================
Avant d'entamer cette dernière section, nous rappelons que nous considérons comme acquis la portée des variables à l'intérieur de la main.
Il est évident que la syntaxe d'un langage est la même à l'intérieur d'une méthode que dans la main, de ce fait tous les concepts de portée des variables est également le même.
Dans de cette section, nous allons simplement voir quels changements une méthode peut appliquer sur les variables qu'elle reçoit en argument.

Premièrement, vous serez peut-être tenté d'utiliser des variables déclarées dans la main, à l'intérieur de votre méthode.
Cela est impossible, et rendrait l'utilisation des arguments inutiles. Cependant, cela permet de réutiliser des noms de variables.
Dans le code ci-dessous, un entier "int" est déclaré dans la main, mais il vous est tout à fait possible de renommer une variable "int" dans chacune de vos méthodes auxiliaires.

<exemple>

Il est à noter que toutes les variables déclarées à l'intérieur d'une méthode, ne pourront être utilisées que par elle. Ainsi, le code suivant est incorrect.

<exemple : déclare une variable, essaie de l'utiliser après avoir appelé la méthode>

Ainsi, si vous désirez utiliser cette valeur, il faut que ce soit la valeur de retour de la méthode.

Deuxièmement, les variables passées en argument sont les variables utilisée par le reste du code, par exemple, si une méthode est appelée avec un entier nommé "i", et que ce "i" est modifier dans la méthode, la valeur sera modifiée pour tout le reste du code.

<exemple>

Si vous désirez manipuler un argument d'une méthode sans le modifier pour le reste du code, il suffit de déclarer une variable à l'intérieur de la méthode, et de lui assigner la valeur de l'argument.

<exemple>
