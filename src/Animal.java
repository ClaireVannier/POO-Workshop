public class Animal {
    private String name;
    private int size;
    private boolean isCarnivorous = false;
    private int numberOfLegs;

    public Animal(String name, int size, int numberOfLegs) {
        this.name = name;
        this.size = size;
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(String name, int size, boolean isCarnivorous, int numberOfLegs) {
        this.name = name;
        this.size = size;
        this.isCarnivorous = isCarnivorous;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean isCarnivorous) {
        this.isCarnivorous = isCarnivorous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String introduce() {
        String carnivorousStatus = isCarnivorous ? "je suis carnivore" : "je ne suis pas carnivore";
        return "Hey, en tant que " + name + ", j'ai " + numberOfLegs + " pattes et " + carnivorousStatus + ".";
    }

    public boolean isDangerous() {
        return size > 50 && isCarnivorous;
    }
}
