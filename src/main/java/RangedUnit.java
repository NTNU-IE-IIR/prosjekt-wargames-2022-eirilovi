public class RangedUnit  extends Unit {
    private int timesAttacked;


    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);}

    @Override
    int getAttackBonus() {
        return 3;
    }

    @Override
    int getResistBonus() {
        int attackBonus = 2;
        if (timesAttacked == 0) {
            attackBonus = 6;
        }
        else if (timesAttacked == 1) {
            attackBonus = 4;
        }
        timesAttacked += 1;
        return attackBonus;

    }
}
