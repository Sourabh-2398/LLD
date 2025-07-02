package DesignPattern.Creational.FactoryMethod;

// Concrete Creator: PdfDocumentCreator
public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
