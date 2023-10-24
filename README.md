## Des nains sur des épaules de géants

### Objectif

La citation *Des nains sur des épaules de géants* se réfère à l'importance pour tout homme de s'appuyer sur les travaux de ses prédécesseurs.
 
À la lecture des textes, on ne glane qu'une petite partie de cette dépendance : telle personne a influencé telle autre personne. 
On apprendra par la suite que cette seconde personne en a, à son tour, influencé une troisième, et ainsi de suite.
C'est cette chaîne d'influence qui nous intéresse dans cet exercice, et plus précisément, il s'agit de trouver la longueur de la plus grande de ces chaînes.

### Règles

On choisit de représenter chaque personne par un nombre entier distinct. 
Si la personne `1` a influencé les personnes `2` et `3`, et que `3` a influencé `4`, alors il existe une succession de pensée entre `1`, `3` et `4`. 
C'est la plus longue succession existante dans ce cas, et le résultat attendu sera `3` car elle implique `3` personnes.

![exemple1](images/exemple_1.png)

Si on complète cet exemple en apprenant que `2` a également influencé `4` et `5`, la plus longue succession reste de longueur `3`, mais il en existe désormais plusieurs.

![exemple2](images/exemple_2.png)

Si on ajoute que `10` a influencé `11`, le résultat reste `3`. 
Mais dès que l'on apprend que `10` a également influencé `1` et `3`, alors le résultat devient `4`, car il existe alors par exemple la succession `10, 1, 2, 5` comportant `4` personnes.

![exemple3](images/exemple_3.png)

### Exemple

*entrée*:

Une `liste`de relation:  une relation d'influence entre deux personnes, de la forme d'un tuple `(X, Y)` indiquant que `X` influence `Y`. 
Les relations d'influence sont listées dans un ordre quelconque.


*sortie*:
Le nombre de personnes impliquées dans la plus longue succession d'influences.



