# Convertisseur de couleurs Java

L'objectif de cette appplication est de générer des codes couleurs dans différentes écritures.

Par exemple, les codes couleur suivants:

- `rgb(255, 0, 0)`  (rouge, vert, bleu)
- `#FF0000`     (rouge, vert, bleu en hexadécimal)
- `hsl(0, 100%, 50%)`   (teinte, saturation, luminosité)

...correspondent tous à la même couleur (rouge). L'application doit permettre, lorsque l'on rentre un de ces codes, de générer tous les autres.

## Travail à réaliser

### 1. Convertir un code hexadécimal en décimal

L'application doit demander à l'utilisateur de rentrer un code hexadécimal, et générer le code RVB décimal correspondant.

> Exemple: si l'utilisateur entre `FF0000`, l'application doit renvoyer `rgb(255, 0, 0)`.

#### BONUS (facultatif)

Si l'utilisateur rentre un code qui contient autre chose d'autres caractères que des chiffres hexadécimaux (0-9, A-F), l'application doit générer une erreur.

### 2. Abstraire les couleurs

Afin de pouvoir effectuer des conversions de n'importe quelle écriture vers n'importe quelle autre, écrire une classe **RgbColor** répondant aux spécifications suivantes:

- Les objets de cette classe doivent posséder une propriété pour chaque canal: rouge, vert et bleu.
- Les objets de cette classe doivent pouvoir être construits indifféremment à partir d'une code hexadécimal (par exemple: `FF0000`) ou des trois valeurs rouge, vert, bleu (par exemple: `255`, `0`, `0`).
- Les objets de cette classe doivent posséder un ensemble de méthodes leur permettant de générer un code de couleur hexadécimal ou un code RVB à partir de leurs trois propriétés.

Refactoriser le code écrit à l'étape 1 pour utiliser cette classe.

#### BONUS (facultatif)

Valider les valeurs des 3 propriétés rouge, vert et bleu afin de s'assurer qu'elles ne tombent jamais en-dehors de la plage 0-255.

### 3. Choisir le format d'entrée

L'application doit demander à l'utilisateur s'il souhaite entrer un code couleur en hexadécimal, ou trois valeurs de rouge, vert et bleu. En fonction de ce choix, l'application doit adopter un comportement différent, créer un objet **RgbColor** de la façon adéquate, et afficher toutes les façons différentes d'écrire le code couleur existants dans la classe.

#### BONUS (facultatif)

Implémenter le changement de comportement de l'application en fonction du choix de l'utilisateur à l'aide du _design pattern_ State Machine.

### BONUS (facultatif)

Ajouter la conversion en format HSL en entrée et en sortie.
