public abstract class Bird extends Animal {

    public Bird(String name, int size, int numberOfLegs) {
        super(name, size, numberOfLegs);
    }

    public abstract void fly();
}
