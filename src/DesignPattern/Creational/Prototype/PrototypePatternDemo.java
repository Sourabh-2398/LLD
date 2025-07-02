package DesignPattern.Creational.Prototype;

// Demonstrates the Prototype Design Pattern with Circle and Rectangle examples
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // --- Circle Prototype Demo ---
        // Create an original Circle object
        Circle originalCircle = new Circle(10, "red");
        originalCircle.draw();

        // Clone the original Circle
        Circle clonedCircle = originalCircle.clone();
        clonedCircle.draw();

        // Modify the clone and show that the original is unaffected
        clonedCircle.setColor("blue");
        clonedCircle.setRadius(20);
        System.out.println("After modifying the circle clone:");
        System.out.print("Original: ");
        originalCircle.draw();
        System.out.print("Clone: ");
        clonedCircle.draw();

        // --- Rectangle Prototype Demo ---
        // Create an original Rectangle object
        Rectangle originalRectangle = new Rectangle(30, 15, "green");
        originalRectangle.draw();

        // Clone the original Rectangle
        Rectangle clonedRectangle = originalRectangle.clone();
        clonedRectangle.draw();

        // Modify the clone and show that the original is unaffected
        clonedRectangle.setColor("yellow");
        clonedRectangle.setWidth(50);
        System.out.println("After modifying the rectangle clone:");
        System.out.print("Original: ");
        originalRectangle.draw();
        System.out.print("Clone: ");
        clonedRectangle.draw();
    }
}
