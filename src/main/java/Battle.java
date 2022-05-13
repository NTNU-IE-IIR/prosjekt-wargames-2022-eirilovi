public class Battle {
    private Army armyOne;
    private Army armyTwo;

    Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army simulate (Terrain terrain) {
        while (armyOne.hasUnits() && armyTwo.hasUnits()) {
            Unit unitOne = armyOne.getRandom();
            Unit unitTwo = armyTwo.getRandom();

            do {
                unitOne.attack(unitTwo);
                unitTwo.attack(unitOne);
            }   while (unitOne.getHealth() > 0 && unitTwo.getHealth() > 0) ;

                if (unitOne.getHealth() < 1) {
                    armyOne.remove(unitOne);
                } else {
                    armyTwo.remove(unitTwo);
                }
            }

            Army winner = null;

            if (armyOne.hasUnits() && !armyTwo.hasUnits()) {
                winner = armyOne;
            }
            if (armyTwo.hasUnits() && !armyOne.hasUnits()) {
                winner = armyTwo;
            }
            return winner;
        }

        public void MakeArmies() {
            for (int i = 0; i < 10; i++) {
                armyOne.add(new InfantryUnit("CoolName", 10));
                armyTwo.add(new InfantryUnit("LameName", 20));
            }
    }
}
