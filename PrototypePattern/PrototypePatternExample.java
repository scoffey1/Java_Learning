// Prototype Interface
interface Prototype {
    Prototype clone();

    void show();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private int id;
    private String name;

    public ConcretePrototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implement clone method
    public Prototype clone() {
        return new ConcretePrototype(this.id, this.name);
    }

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Usage
public class PrototypePatternExample {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype(1, "Original");

        // Clone the prototype
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        // Modify the clone
        clone.show(); // Output: ID: 1, Name: Original

        // Verify that it's a different object
        System.out.println(prototype == clone); // Output: false
    }

    /*
     * Key Points:
     * Reduces the cost of creating objects.
     * Useful when the object creation is resource-intensive.
     * 
     * Use Cases:
     * When creating a new object is costly or complex.
     * When you need to create multiple similar objects.
     */}
