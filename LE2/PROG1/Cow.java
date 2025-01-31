class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " voice: Moo!");
    }
}


