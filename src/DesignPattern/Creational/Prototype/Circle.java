package DesignPattern.Creational.Prototype;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }

    // Getters and setters (optional)
    public int getRadius() { return radius; }
    public String getColor() { return color; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }
}

