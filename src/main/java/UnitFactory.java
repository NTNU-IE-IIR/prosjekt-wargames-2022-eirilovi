import java.util.ArrayList;

public class UnitFactory {
        private UnitFactory() {

        }

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

        public ArrayList<Unit> UnitList(int unitAmount, String unitType, String unitName, int unitHealth) {
                ArrayList<Unit> units = new ArrayList<>();
                while (unitAmount > units.size()) {
                        units.add(createUnit(unitType, unitName, unitHealth));
                }
                return units;
        }
}