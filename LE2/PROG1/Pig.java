class Pig extends Animal {
    public Pig() {
        super("Pig");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " voice: Oink!");
    }
}