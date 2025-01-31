class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " voice: Bark!");
    }
}
