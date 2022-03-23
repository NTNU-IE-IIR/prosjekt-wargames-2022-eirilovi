public class CavalryUnit  extends Unit {
    private boolean firstAttack;

    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
        firstAttack = true;
    }

    @Override
    int getAttackBonus() {
        if (firstAttack) {
            firstAttack = false;
            return 6;
        }
        else {
            return 2;
        }
    }

    @Override
    int getResistBonus() {
        return 1;
    }
}
