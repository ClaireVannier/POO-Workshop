public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", 120, 4, true);
        Parrot parrot = new Parrot("Parrot", 20, 2, true);

        System.out.println(lion.introduce());
        System.out.println("Is lion dangerous? " + lion.isDangerous());
        lion.hunt();

        System.out.println(parrot.introduce());
        System.out.println("Is parrot dangerous? " + parrot.isDangerous());
        parrot.fly();
    }
}
