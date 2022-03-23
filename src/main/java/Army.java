import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Army {
    String name;
     ArrayList <Unit> units;


    Army(String name, ArrayList<Unit> units) {

    }

    public String getName() {
        return name;
    }

    public void add(Unit units) {
        this.units.add(units);
    }

    public void addAll(ArrayList<Unit> units) {
        for (Unit unit: units) {
            add(unit);
        }
    }

    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    public boolean hasUnits() {
        if (this.units.size()>0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Unit getRandom() {
        int size = units.size();
        Random random = new Random();
        int unitToGet = random.nextInt(size);
        Unit randomUnit = units.get(unitToGet);
        return randomUnit;
    }

    public List<Unit> getInfantryUnit() {
        return units.stream()
                .filter(unit -> unit instanceof InfantryUnit)
                .collect(Collectors.toList());

    }

    public List<Unit> getCavalryUnit() {
        return units.stream()
                .filter(unit -> unit instanceof CavalryUnit)
                .collect(Collectors.toList());
    }

    public List<Unit> getRangedUnit() {
        return units.stream()
                .filter(unit -> unit instanceof RangedUnit)
                .collect(Collectors.toList());
    }

    public List<Unit> getCommanderUnit() {
        return units.stream()
                .filter(unit -> unit instanceof CommanderUnit)
                .collect(Collectors.toList());
    }

}

