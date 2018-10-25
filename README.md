# MarkingMenu

## Author : OZENDA Thomas & FERREIRA Joffrey


## Fonctionnalitées : 

controle + clic gauche -> Ouvre le menu1 -> drag sur élément -> Action de l élément -> Menu suivant ..<br>
Si relachement du clic ferme le menu <br><br>
Si plus de 8 éléments, lutiliser la molette pour faire tourner les éléments (pas implémentés)<br> 


## Architecture :
Nous avons utilisé une architecture MVC pour l'application Paint et le composant menu.

Le package MenuTemplate est l'endroit où on crée et gère l'héridité des menus.

##Le menu

Notre menu permet juste de choisir un Tool et ensuite de choisir une couleur. 

## TODO
Implémenter la rotation des éléments du Menu si il y a plus de 8 éléments (rotation au scroll)
Vrai MarkingMenu (sélection d'élément au drag)