package DesignPattern.Creational.Prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }

    // Getters and setters (optional)
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public String getColor() { return color; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public void setColor(String color) { this.color = color; }
}

