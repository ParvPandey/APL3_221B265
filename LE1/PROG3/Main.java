public class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();  
        m1.show();  
        
        // Test static methods
        m1.staticShow();  // This will cause an error as static methods are not polymorphic
        
    }
}
