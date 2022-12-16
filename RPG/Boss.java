public class Boss extends Combattant{
    public Boss(){
        pointsDeVie = 2000;
        atk = 350;
    }
    public boolean Decede() {
        return false;
    }
    public String getName(){
        return "Boss";
    }

    @Override
    public void combattre(Combattant combattant) {

    }
}
