import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class hero extends Combattant{
    protected int pointsDeVie;
    protected int atk;
    protected boolean protege = false;
    protected final List<Potion> Potions = new ArrayList<>();
    protected final List<Food> pomme = new ArrayList<>();
    public void Hero() {
            int PotionCount = 10;
            int pommeCount = 10;

            for (int i = 0; i < PotionCount; i++) {
                Potions.add(new Potion());
            }
            for (int i = 0; i < pommeCount; i++) {
                pomme.add(new Food());
            }
    }

    public abstract String weaponName();
    public abstract String getName();
    public void combattre(Combattant combattant){
        System.out.println(getName() + " combat " + "enemy");
        degat();
    }
    protected int degat() {
        if(protege == true){
            return 0;
        }
        System.out.println("enemy combat " + getName());
        pointsDeVie -= atk;
        System.out.println(getName() + " perd " + atk + " points de vie ");
        return 0;
    }
    public void defendre(){
        System.out.println(getName() + " se protege ");
        protege = true;
    }
    public boolean Decede(){
        return pointsDeVie <= 0;
    }
    public void boirePotion(){
        System.out.println(getName() + " regagne " + Potions + " mana ");
        mana += Potion.Potion();
        Potions.remove(0);
        if (Potions.isEmpty()){
            System.out.println(" Vous n'avez plus de potion ");
        }
    }
    public void manger(){
        System.out.println(getName() + " regagne " + pomme + " points de vie " );
        pointsDeVie += Food.pomme();
        pomme.remove(0);
        if (pomme.isEmpty()){
            System.out.println(" Vous n'avez plus de pomme ");
        }
    }
    public int getPotionsCount() {
        return Potions.size();
    }
    public int getpommeCount() {
        return pomme.size();
    }
    public abstract void defendre(Combattant combattant);
}
