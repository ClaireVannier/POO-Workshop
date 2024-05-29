public class Parrot extends Bird {
    private boolean canTalk;

    public Parrot(String name, int size, int numberOfLegs, boolean canTalk) {
        super(name, size, numberOfLegs);
        this.canTalk = canTalk;
    }

    public boolean canTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public String introduce() {
        String talkStatus = canTalk ? "Je peux parler" : "Je ne peux pas parler ";
        return super.introduce() + " " + talkStatus;
    }

    @Override
    public void fly() {
        System.out.println("Le perroquet vole.");
    }
}
