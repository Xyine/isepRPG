public class Healer extends SpellCaster {
    public Healer() {
        mana = 550;
        pointsDeVie = 400;
        atk = 5;
    }
    public String getName() {
        return " guerisseur ";
    }

    public String weaponName() {
        return " baton ";
    }

    @Override
    public void combattre(Combattant combattant) {
    }
    @Override
    public void defendre(Combattant combattant) {

    }
}

