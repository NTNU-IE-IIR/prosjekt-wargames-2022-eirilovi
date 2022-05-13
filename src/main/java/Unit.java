abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name,int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor= armor;

    }

    public void attack(Unit opponent) {

    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getArmor() {
        return armor;
    }

    abstract int getAttackBonus(Terrain terrain);

    abstract int getResistBonus(Terrain terrain);

}

