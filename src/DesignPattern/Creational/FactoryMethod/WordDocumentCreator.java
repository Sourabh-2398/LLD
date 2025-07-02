package DesignPattern.Creational.FactoryMethod;

// Concrete Creator: WordDocumentCreator
public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
