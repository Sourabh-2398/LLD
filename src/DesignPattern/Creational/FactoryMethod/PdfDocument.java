package DesignPattern.Creational.FactoryMethod;

// Concrete Product: PdfDocument
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
