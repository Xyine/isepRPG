public abstract class SpellCaster extends hero {
    protected int  mana;

    @Override
    public void combattre(Combattant combattant) {
        super.combattre(combattant);
        mana -= 125;

    }
    public int Mana() {
        return Math.max(0,mana);
    }
}
