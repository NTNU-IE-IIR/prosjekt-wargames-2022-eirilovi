package idata2001.wargames.model;

/**
 * Creates the abstract class Unit
 */
public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    /**
     * Makes a template of what a unit consists of
     * @param name name of unit
     * @param health health of unit
     * @param attack attack-power of unit
     * @param armor armour-stats of unit
     */
    public Unit(String name,int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor= armor;

    }

    /**
     * attacks the opponent
     * @param opponent opposite army
     */
    public void attack(Unit opponent) {
        this.health -= 5;
    }

    /**
     * returns the name of the unit
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * returns the health of a unit
     * @return health
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * returns the attack value
     * @return attack value
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * returns the armor value
     * @return armor value
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Gives an attack bonus
     * @param terrain input terrain
     * @return attack bonus
     */
     abstract int getAttackBonus(Terrain terrain);

    /**
     * Gives a resist bonus
     * @param terrain input terrain
     * @return resist bonus
     */
    abstract int getResistBonus(Terrain terrain);

}

