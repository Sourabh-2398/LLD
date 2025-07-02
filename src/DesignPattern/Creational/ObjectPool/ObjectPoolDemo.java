package DesignPattern.Creational.ObjectPool;

// Demonstrates the Object Pool Pattern
public class ObjectPoolDemo {
    public static void main(String[] args) {
        // Create an object pool with a maximum of 2 resources
        ObjectPool pool = new ObjectPool(2);

        // Borrow two resources from the pool
        Reusable r1 = pool.borrowObject();
        r1.use();
        Reusable r2 = pool.borrowObject();
        r2.use();

        // Try to borrow a third resource (should throw an exception)
        try {
            pool.borrowObject();
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Return one resource to the pool
        pool.returnObject(r1);
        System.out.println("Returned resource with id: " + r1.getId());

        // Now borrowing should succeed
        Reusable r3 = pool.borrowObject();
        r3.use();
    }
}

