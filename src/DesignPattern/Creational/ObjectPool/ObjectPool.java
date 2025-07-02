package DesignPattern.Creational.ObjectPool;

import java.util.Queue;
import java.util.LinkedList;

// Manages a pool of reusable objects
public class ObjectPool {
    private final Queue<Reusable> available;
    private final int maxSize;
    private int nextId = 1;

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
        this.available = new LinkedList<>();
        // Pre-populate the pool with Reusable objects
        for (int i = 0; i < maxSize; i++) {
            available.offer(new Reusable(nextId++));
        }
    }

    // Borrow an object from the pool
    public synchronized Reusable borrowObject() {
        if (available.isEmpty()) {
            throw new RuntimeException("No available objects in the pool");
        }
        return available.poll();
    }

    // Return an object to the pool
    public synchronized void returnObject(Reusable obj) {
        available.offer(obj);
    }

    // Get the number of available objects
    public synchronized int getAvailableCount() {
        return available.size();
    }
}

