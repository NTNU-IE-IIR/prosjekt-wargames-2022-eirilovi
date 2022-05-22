public class RangedUnit  extends Unit {
    private int timesAttacked;

    /**
     * Creates a ranged unit
     * @param name
     * @param health
     */
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
    }

    /**
     * Gives an attack bonus if the proper criteria are fulfilled
     * @param terrain
     * @return attack bonus
     */
    @Override
    int getAttackBonus(Terrain terrain) {
        int attackBonus = 0;
        if (terrain == Terrain.HILL) {
            attackBonus += 3;

        }

            return attackBonus;
    }

    /**
     * Gives an attack bonus if the proper criteria are fulfilled
     * @param terrain
     * @return attack bonus
     */
    @Override
    int getResistBonus(Terrain terrain) {
        int resistBonus = 2;
        if (timesAttacked == 0) {
            resistBonus = 6;
        } else if (timesAttacked == 1) {
            resistBonus = 4;
        }
        timesAttacked += 1;

        if (terrain == Terrain.FOREST) {
            resistBonus += 3;
        }
        return resistBonus;

    }
}
