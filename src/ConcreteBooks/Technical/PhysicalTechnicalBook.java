package ConcreteBooks.Technical;

import Categories.PhysicalBook;

public class PhysicalTechnicalBook extends PhysicalBook {
    public PhysicalTechnicalBook(int numberOfPages, String dimnesions, String coverType) {
        super(numberOfPages, dimnesions, coverType);
    }

    @Override
    public void getNumberOfPages() {
        System.out.println("This physical technical book has " + numberOfPages + " pages");
    }

    @Override
    public void getCoverType() {
        System.out.println("This physical technical book is " + coverType);
    }

    @Override
    public void getDimensions() {
        System.out.println("Physical technical book's dimensions: " + dimnesions);
    }
}
