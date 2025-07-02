package DesignPattern.Creational.FactoryMethod;

// Creator (Abstract Class)
public abstract class DocumentCreator {
    public abstract Document createDocument();
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}
