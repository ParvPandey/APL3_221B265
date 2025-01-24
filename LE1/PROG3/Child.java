class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Child's show method");
    }
    
    // Static method in Child
    public static void staticShow() {
        System.out.println("Child's static show method");
    }
}
