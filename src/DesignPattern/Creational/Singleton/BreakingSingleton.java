package DesignPattern.Creational.Singleton;

import java.io.Serializable;

// Singleton vulnerable to breaking
public class BreakingSingleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private static BreakingSingleton instance;

    private BreakingSingleton() {}

    public static BreakingSingleton getInstance() {
        if (instance == null) {
            instance = new BreakingSingleton();
        }
        return instance;
    }

    // For demonstration: allow cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
