package idata2001.wargames.model;

import java.util.ArrayList;

/**
 * Blank constructor
 */
public class UnitFactory {
        private UnitFactory() {

        }

        /**
         * Creates a unit based on the parameters that are input
         * @param unitType
         * @param unitName
         * @param unitHealth
         * @return unit created
         */
        public Unit createUnit(String unitType, String unitName, int unitHealth) {
                Unit unit;

                switch (unitType) {
                        case "Infantry":
                                unit = new InfantryUnit(unitName, unitHealth);
                        case "Ranged":
                                unit = new CommanderUnit(unitName, unitHealth);
                        case "Cavalry":
                                unit = new CavalryUnit(unitName, unitHealth);
                        case "Commander":
                                unit = new CommanderUnit(unitName, unitHealth);
                        case default:
                                unit = null;

                }
                return unit;

        }

        /**
         * Creates multiple of the same unit
         * @param unitAmount
         * @param unitType
         * @param unitName
         * @param unitHealth
         * @return List of units
         */
        public ArrayList<Unit> UnitList(int unitAmount, String unitType, String unitName, int unitHealth) {
                ArrayList<Unit> units = new ArrayList<>();
                while (unitAmount > units.size()) {
                        units.add(createUnit(unitType, unitName, unitHealth));
                }
                return units;
        }
}