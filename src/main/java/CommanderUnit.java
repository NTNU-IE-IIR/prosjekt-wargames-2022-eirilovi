public class CommanderUnit extends CavalryUnit{
    private String name;
    private int health;
    private int attack;
    private int armor;

    /**
     * Creates a commander unit
     * @param name
     * @param health
     */
    public CommanderUnit(String name, int health) { super(name, health);
    }
}
