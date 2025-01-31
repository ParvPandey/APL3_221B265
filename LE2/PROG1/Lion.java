class Lion extends Animal {
    public Lion() {
        super("Lion");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " voice: Roar!");
    }
}