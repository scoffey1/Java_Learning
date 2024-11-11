// Abstract Products
interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

// Concrete Products for Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering Windows Button.");
    }
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering Windows Checkbox.");
    }
}

// Concrete Products for Mac
class MacButton implements Button {
    public void paint() {
        System.out.println("Rendering Mac Button.");
    }
}

class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering Mac Checkbox.");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

// Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Client
public class AbstractFactoryPatternExample {
    private static void runApplication(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        // Assume we are using Windows
        GUIFactory factory = new WindowsFactory();
        runApplication(factory);
        // Output:
        // Rendering Windows Button.
        // Rendering Windows Checkbox.

        // Assume we are using Mac
        factory = new MacFactory();
        runApplication(factory);
        // Output:
        // Rendering Mac Button.
        // Rendering Mac Checkbox.
    }
}
/*
 * Key Points:
 * Ensures that products from the same family are used together.
 * Makes exchanging product families easy.
 * 
 * Use Cases:
 * When a system needs to be independent of how its products are created,
 * composed, or represented.
 * When families of related product objects are designed to be used together.
 */