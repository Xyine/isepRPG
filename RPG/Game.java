import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Game {
    private static int enemyCount;
    private static final List<hero> heroes = new ArrayList<>();
    private static int heroIndex;
    public static void main(String[] args) {
        game();
    }
     public static void game() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("combien d'ennemy voulez vous combattre? (entre 1 et 4)");
         int x = scanner.nextInt();
         while (x < 0 || x > 4) {
             System.out.println("The value is not within range. Try again.");
             x = scanner.nextInt();
         }
         while (x!=0) {
             System.out.println("Choisissez un chiffres (1 ou 2) pour creer votre hero");
             int heroi = scanner.nextInt();
             while (x < 1 || x > 2) {
                 System.out.println("The value is not within range. Try again.");
                 x = scanner.nextInt();
             }
             hero Hero = null;
             if (heroi == 1) {
                 int min = 0;
                 int max = 1;
                 int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                 if (random_int == 1) {
                    Hero = new Warrior();
                     heroes.add(Hero);
                     x--;
                 }
                 if (random_int == 0) {
                     Hero = new Hunter();
                     heroes.add(Hero);
                     x--;
                 }
             }
             if (heroi == 2) {
                 int min = 0;
                 int max = 1;
                 int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                 if (random_int == 1) {
                     Hero = new Mage();
                     heroes.add(Hero);
                     x--;
                 }
                 if (random_int == 0) {
                     Hero = new Healer();
                     heroes.add(Hero);
                     x--;
                 }
             }
         }
         System.out.println(" premier round ");
         int nombreDeTour=4;
         Combattant Enemy = (nombreDeTour == 0) ? new enemy() : new Boss();
         if(x>=2){
              Enemy = new enemy();
             if(x>=3){
                 Enemy = new enemy();
                 if(x>=4){
                    Enemy = new enemy();
                 }
             }
         }
         hero Hero = heroes.get(heroIndex);
         while ((!Hero.Decede() || !heroDecede(Hero)) && (!Enemy.Decede() || !enemyDecede())) {
             System.out.println("debut du tour");
             System.out.println(Hero.getName()+" Que voulez vous faire ?");
             System.out.println("1: Attaquer, " + "2: Se proteger, " + "3: Utiliser une potion (" + Hero.getPotionsCount() + " restantes)" + " 4: Manger une pomme (" + Hero.getpommeCount() + " restants)");
             int a = scanner.nextInt();
             switch (a) {
                 case 1 -> Hero.combattre(Enemy);
                 case 2 -> Hero.defendre();
                 case 3 -> Hero.boirePotion();
                 case 4 -> Hero.manger();
             }

             System.out.println("A toi de souffrir!");
         }
         nombreDeTour-=1;
     }

    private static boolean heroDecede(hero Hero) {
        System.out.println("ton hero passe l'arme à gauche...");
        heroes.remove(Hero);
        if (heroes.size() == 0) {
            System.out.println("bah c'est perdu...");
            return true;
        }
        return false;
    }
    private static boolean enemyDecede() {
        System.out.println("Trop fort, il est mort!");
        enemyCount--;
        if (enemyCount == 0) {
            System.out.println("C'est gagné");
            return true;
        }
        else {
            Combattant Enemy = (4 == 0) ? new enemy() : new Boss();
            return false;
        }
    }


}