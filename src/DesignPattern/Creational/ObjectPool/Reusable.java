package DesignPattern.Creational.ObjectPool;

// Represents a resource to be pooled (e.g., a mock database connection)
public class Reusable {
    private final int id;
    public Reusable(int id) {
        this.id = id;
    }
    public void use() {
        System.out.println("Using resource with id: " + id);
    }
    public int getId() {
        return id;
    }
}

