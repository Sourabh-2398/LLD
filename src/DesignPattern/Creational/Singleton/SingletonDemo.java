package DesignPattern.Creational.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDemo {
    public static void main(String[] args) throws Exception {
        // Eager Singleton
        System.out.println("EagerSingleton: " + EagerSingleton.getInstance());
        // Lazy Singleton
        System.out.println("LazySingleton: " + LazySingleton.getInstance());
        // Thread Safe Singleton
        System.out.println("ThreadSafeSingleton: " + ThreadSafeSingleton.getInstance());
        // Double Checked Locking Singleton
        System.out.println("DoubleCheckedLockingSingleton: " + DoubleCheckedLockingSingleton.getInstance());
        // Bill Pugh Singleton
        System.out.println("BillPughSingleton: " + BillPughSingleton.getInstance());

        // Breaking Singleton with Reflection
        BreakingSingleton instance1 = BreakingSingleton.getInstance();
        BreakingSingleton instance2 = null;
        Constructor<?>[] constructors = BreakingSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instance2 = (BreakingSingleton) constructor.newInstance();
            break;
        }
        System.out.println("BreakingSingleton Reflection: " + (instance1 == instance2));

        // Breaking Singleton with Serialization
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.obj"));
        out.writeObject(instance1);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.obj"));
        BreakingSingleton instance3 = (BreakingSingleton) in.readObject();
        in.close();
        System.out.println("BreakingSingleton Serialization: " + (instance1 == instance3));

        // Breaking Singleton with Cloning
        BreakingSingleton instance4 = (BreakingSingleton) instance1.clone();
        System.out.println("BreakingSingleton Cloning: " + (instance1 == instance4));

        // SafeSingleton tests
        SafeSingleton safe1 = SafeSingleton.getInstance();
        SafeSingleton safe2 = null;
        try {
            Constructor<?>[] safeConstructors = SafeSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : safeConstructors) {
                constructor.setAccessible(true);
                safe2 = (SafeSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println("SafeSingleton Reflection prevented: " + e.getMessage());
        }
        // Serialization
        ObjectOutput out2 = new ObjectOutputStream(new FileOutputStream("file2.obj"));
        out2.writeObject(safe1);
        out2.close();
        ObjectInput in2 = new ObjectInputStream(new FileInputStream("file2.obj"));
        SafeSingleton safe3 = (SafeSingleton) in2.readObject();
        in2.close();
        System.out.println("SafeSingleton Serialization: " + (safe1 == safe3));
        // Cloning
        try {
            SafeSingleton safe4 = (SafeSingleton) safe1.clone();
        } catch (Exception e) {
            System.out.println("SafeSingleton Cloning prevented: " + e.getMessage());
        }
    }
}
