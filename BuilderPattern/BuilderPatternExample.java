// Product
class Computer {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters and toString() for demonstration
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM +
                ", Graphics Card Enabled=" + isGraphicsCardEnabled +
                ", Bluetooth Enabled=" + isBluetoothEnabled + "]";
    }

    // Builder Class
    public static class ComputerBuilder {
        // Required parameters
        private String HDD;
        private String RAM;

        // Optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Usage
public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer);
        // Output: Computer [HDD=500 GB, RAM=16 GB, Graphics Card Enabled=true,
        // Bluetooth Enabled=true]
    }
}
/*
 * Key Points:
 * Improves readability by using method chaining.
 * Makes the object immutable if only getters are provided.
 * 
 * Use Cases:
 * When you need to create an object with lots of possible configuration
 * options.
 * When the creation process is complex and should be independent of the
 * components that make up the object.
 */