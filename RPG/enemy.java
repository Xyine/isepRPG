public class enemy extends Combattant{
    public void Enemy(){
        pointsDeVie = 700;
        atk = 100;
    }
    public boolean Decede() {
        return false;
    }
    public String getName(){
        return "Enemy";
    }
    @Override
    public void combattre(Combattant combattant){}
    public static void degat(int atk){}

}
