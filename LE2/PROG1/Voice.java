class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];

        // Instantiate animals and assign them to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        // Call hear method to hear each animal's voice
        hear(animals);
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();  // This uses polymorphism to call the correct makeVoice() method
        }
    }
}
