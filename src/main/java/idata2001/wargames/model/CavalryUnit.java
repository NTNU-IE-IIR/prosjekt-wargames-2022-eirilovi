package idata2001.wargames.model;

public class CavalryUnit  extends Unit {
    private boolean firstAttack;

    /**
     * Creates a cavalry unit
     * @param name
     * @param health
     */
    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
        firstAttack = true;
    }

    /**
     * Gives an attack bonus if the proper criteria are fulfilled
     * @param terrain
     * @return attack bonus
     */
    @Override
    int getAttackBonus(Terrain terrain) {
        int attackBonus = 0;
        if (firstAttack) {
            firstAttack = false;
            attackBonus = 6;
        }
        else {
            attackBonus = 2;
        }
        if (terrain == Terrain.PLAINS) {
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
        int resistBonus = 0;
        if (terrain == Terrain.FOREST) {
            resistBonus = 0;
        }
        return resistBonus;
    }
}
