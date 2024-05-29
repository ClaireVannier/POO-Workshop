public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", 120, 4, true);
        Parrot parrot = new Parrot("Pérroquet", 20, 2, true);

        System.out.println(lion.introduce());
        System.out.println("Le lion est-il dangereux ? " + lion.isDangerous());
        lion.hunt();

        System.out.println(parrot.introduce());
        System.out.println("Le perroquet est-il dangereux ? " + parrot.isDangerous());
        parrot.fly();
    }
}
