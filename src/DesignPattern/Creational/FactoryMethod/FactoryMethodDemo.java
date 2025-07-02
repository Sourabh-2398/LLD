package DesignPattern.Creational.FactoryMethod;


public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.openDocument();

        DocumentCreator pdfCreator = new PdfDocumentCreator();
        pdfCreator.openDocument();
    }
}
