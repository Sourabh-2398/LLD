package DesignPattern.Creational.FactoryMethod;

// Concrete Product: WordDocument
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}
