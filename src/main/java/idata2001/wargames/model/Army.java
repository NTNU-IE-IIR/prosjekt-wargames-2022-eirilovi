package idata2001.wargames.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Creates an army
 */
public abstract class Army {
    String name;
     ArrayList <Unit> units;


    Army(String name, ArrayList<Unit> units) {

    }

    /**
     * Returns the name of the unit
     * @return  name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a unit to the arraylist
     * @param units
     */
    public void add(Unit units) {
        this.units.add(units);
    }

    /**
     * Adds all of a certain unit to the arraylist
     * @param units
     */
    public void addAll(ArrayList<Unit> units) {
        for (Unit unit: units) {
            add(unit);
        }
    }

    /**
     * Removes a unit from the arraylist
     * @param unit
     */
    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    /**
     * Checks if there are units in the list
     * @return true/false
     */
    public boolean hasUnits() {
        if (this.units.size()>0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Returns a random unit
     * @return random unit
     */
    public Unit getRandom() {
        int size = units.size();
        Random random = new Random();
        int unitToGet = random.nextInt(size);
        Unit randomUnit = units.get(unitToGet);
        return randomUnit;
    }

    /**
     * Returns a ist of the infantry units
     * @return List of infantry units
     */
    public List<Unit> getInfantryUnit() {
        return units.stream()
                .filter(unit -> unit instanceof InfantryUnit)
                .collect(Collectors.toList());

    }

    /**
     * Returns a list of the cavalry units
     * @return List of cavalry units
     */
    public List<Unit> getCavalryUnit() {
        return units.stream()
                .filter(unit -> unit instanceof CavalryUnit)
                .collect(Collectors.toList());
    }

    /**
     * Returns a list of the ranged-units
     * @return  list of the ranged units
     */
    public List<Unit> getRangedUnit() {
        return units.stream()
                .filter(unit -> unit instanceof RangedUnit)
                .collect(Collectors.toList());
    }

    /**
     * Returns a list of the commander units
     * @return list of the commander units
     */
    public List<Unit> getCommanderUnit() {
        return units.stream()
                .filter(unit -> unit instanceof CommanderUnit)
                .collect(Collectors.toList());
    }

}

