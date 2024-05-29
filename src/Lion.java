public class Lion extends Animal implements Carnivorous {
    private boolean isAlpha;

    public Lion(String name, int size, int numberOfLegs, boolean isAlpha) {
        super(name, size, true, numberOfLegs);  // Lions are carnivorous by default
        this.isAlpha = isAlpha;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    @Override
    public String introduce() {
        String alphaStatus = isAlpha ? "Je suis le chef de meute." : "Je ne suis qu'un simple suiveur.";
        return super.introduce() + " " + alphaStatus;
    }

    @Override
    public void hunt() {
        System.out.println("Le lion chasse.");
    }
}
