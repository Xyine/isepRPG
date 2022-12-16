public abstract class Combattant {
   protected int pointsDeVie;
   protected static int atk;
   protected int mana;

   public String getName() {
      return null;
   }

   public void combattre(Combattant combattant) {}

   public static void degat(int atk){}

   public boolean Decede() {
      return this.pointsDeVie <= 0;
   }

   public int getPointsDeVie() {
      return pointsDeVie;
   }
}
