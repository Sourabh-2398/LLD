package DesignPattern.Creational.Singleton;

import java.io.Serializable;

// Singleton protected from breaking
public class SafeSingleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private static SafeSingleton instance;

    private SafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method");
        }
    }

    public static SafeSingleton getInstance() {
        if (instance == null) {
            synchronized (SafeSingleton.class) {
                if (instance == null) {
                    instance = new SafeSingleton();
                }
            }
        }
        return instance;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // Prevent deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
