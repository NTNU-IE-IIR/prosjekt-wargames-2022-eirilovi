abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    /**
     * Makes a template of what a unit consists of
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public Unit(String name,int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor= armor;

    }

    /**
     * attacks the opponent
     * @param opponent
     */
    public void attack(Unit opponent) {

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
     * @return
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Gives an attack bonus
     * @param terrain
     * @return attack bonus
     */
    abstract int getAttackBonus(Terrain terrain);

    /**
     * Gives a resist bonus
     * @param terrain
     * @return resist bonus
     */
    abstract int getResistBonus(Terrain terrain);

}

