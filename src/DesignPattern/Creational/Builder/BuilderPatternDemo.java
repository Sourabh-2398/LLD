package DesignPattern.Creational.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Example 1: Valid Computer build
        Computer computer = new Computer.Builder("Intel i7", "16GB")
            .storage("512GB SSD")
            .graphicsCard(true)
            .bluetooth(true)
            .build();
        System.out.println("Valid Computer: " + computer);

        // Example 2: Corner case - missing required storage
        try {
            Computer invalidComputer = new Computer.Builder("Intel i5", "8GB")
                .graphicsCard(false)
                .bluetooth(false)
                .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Corner Case Error: " + e.getMessage());
        }
    }
}
