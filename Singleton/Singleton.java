// Singleton Class
public class Singleton {
    // Private static instance of the same class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Usage
public class SingletonExample {
    public static void main(String[] args) {
        // Illegal construct: new Singleton() is not accessible
        // Singleton obj = new Singleton(); // Compilation error

        // Get the only object available
        Singleton obj = Singleton.getInstance();

        // Show message
        obj.showMessage(); // Output: Hello from Singleton!
    }
}
