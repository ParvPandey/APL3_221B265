class Goat extends Animal {
    public Goat() {
        super("Goat");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " voice: Baa!");
    }
}