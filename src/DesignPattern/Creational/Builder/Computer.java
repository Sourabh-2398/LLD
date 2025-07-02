package DesignPattern.Creational.Builder;

// Product class
public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean value) {
            this.hasGraphicsCard = value;
            return this;
        }

        public Builder bluetooth(boolean value) {
            this.hasBluetooth = value;
            return this;
        }

        public Computer build() {
            if (this.storage == null || this.storage.isEmpty()) {
                throw new IllegalArgumentException("Storage must be specified");
            }
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", hasGraphicsCard=" + hasGraphicsCard + ", hasBluetooth=" + hasBluetooth + "]";
    }
}
