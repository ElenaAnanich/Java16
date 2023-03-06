public class Player {
    private int id;
    private String name;
    private int Strength;


    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }

    public Player(int id, String name, int Strength) {
        this.id = id;
        this.name = name;
        this.Strength = Strength;
    }
}
