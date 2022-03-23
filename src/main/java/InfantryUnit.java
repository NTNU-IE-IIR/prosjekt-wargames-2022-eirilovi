public class InfantryUnit extends Unit {

    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    @Override
    int getAttackBonus() {
        return 2;
    }

    @Override
    int getResistBonus() {
        return 1;
    }
}
