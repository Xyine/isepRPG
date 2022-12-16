public class Hunter extends hero{
    private int fleche;
    public Hunter(){
        fleche = 15;
        atk = 190;
        pointsDeVie = 750;
        mana = 0;
    }
    @Override
    public void combattre(Combattant combattant) {
        if(fleche < 0) {
            System.out.println("mince plus de fleche");
        }
        super.combattre(combattant);
        fleche -=1;
    }

    @Override
    public void defendre(Combattant combattant) {}
    public String weaponName(){
        return "fleches";
    }
    public String getName(){
        return "archer";
    }
    public int getFleche(){
        return Math.max(0,fleche);
    }
}
