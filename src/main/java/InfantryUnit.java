public class InfantryUnit extends Unit {

    /**
     * Creates an infantry unit
     * @param name
     * @param health
     */
    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    /**
     * Gives an attack bonus if the proper criteria are fulfilled
     * @param terrain
     * @return attack bonus
     */
    @Override
    int getAttackBonus(Terrain terrain) {
        int attackBonus = 0;
        if (terrain == Terrain.FOREST) {
            attackBonus += 3;

        }

        return attackBonus;
    }

    /**
     * Gives a resist bonus if the proper criteria are fulfilled
     * @param terrain
     * @return resist bonus
     */
    @Override
    int getResistBonus(Terrain terrain) {
        int attackBonus = 0;
        if (terrain == Terrain.FOREST) {
            attackBonus += 3;

        }

        return attackBonus;
    }
}
