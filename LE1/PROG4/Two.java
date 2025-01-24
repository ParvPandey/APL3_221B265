class Two extends One {
    // Constructor of class Two
    Two() {
        // Explicitly calling the parameterized constructor of class One
        super(10); 
        System.out.println("Constructor of Two");
    }
}
