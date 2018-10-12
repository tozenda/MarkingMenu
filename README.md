# MarkingMenu

## Author : OZENDA Thomas & FERREIRA Joffrey


## Fonctionnalitées : 

controle + clic gauche -> Ouvre le menu1 -> drag sur élément -> Action de l élément -> Menu suivant ..<br>
Si relachement du clic ferme le menu <br><br>
Si plus de 8 éléments, lutiliser la molette pour faire défiler<br> 


## Première séance, le TODO :

Implémenter dans Paint.java :<br>
    - coder tool "oval"
    - méthode setOption(String opt, String value)
	- créer les diff menu (colorMenu et toolMenu) 
	- si maintient control -> apelle openMenu() du premier menu
	- Relachement ctrl -> maj color ou/et tool
	
Créer et implémenter les classes ElementMenu et MenuCirculaire

MenuCircular(List<ElementMenu>, MenuElement next, String opt)
	- opt : prend tool ou color dans notre cas


MenuElement(String value)
	- String value (blue par exemple)
	- méthode openMenu() qui ouvre le menu
	- methode getValue qui retourne la value
	

