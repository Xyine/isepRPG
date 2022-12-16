public class Warrior extends hero{

    public Warrior(){
        pointsDeVie = 1000;
        atk = 150;
        mana = 0;
    }

    public String weaponName(){
        return "hache";
    }
    public String getName(){
      return "chevalier";
    }
    @Override
    public void combattre(Combattant combattant) {}
    @Override
    public void defendre(Combattant combattant){}
}
