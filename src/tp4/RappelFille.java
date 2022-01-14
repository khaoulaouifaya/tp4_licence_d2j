package tp4;

public class RappelFille extends Rappel2 {
static int vitesse = 10;
static void afficher() {
System.out.println(vitesse);
}
public static void main(String[] args) {
Rappel2 r = new RappelFille();
((RappelFille) r).afficher();
}
}