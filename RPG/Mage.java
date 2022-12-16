public class Mage extends SpellCaster {

    public Mage() {
        mana = 700;
        pointsDeVie = 500;
        atk = 210;
    }

    public String weaponName() {
        return "baton";
    }

    public String getName() {
        return "sorcier";
    }

    @Override
    public void combattre(Combattant combattant) {}

    @Override
    public void defendre(Combattant combattant) {}
}

