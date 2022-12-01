package ConcreteBooks.Fiction;

import Categories.PhysicalBook;

public class PhysicalFictionBook extends PhysicalBook {
    public PhysicalFictionBook(int numberOfPages, String dimnesions, String coverType) {
        super(numberOfPages, dimnesions, coverType);
    }

    @Override
    public void getNumberOfPages() {
        System.out.println("This physical fiction book has " + numberOfPages + " pages");
    }

    @Override
    public void getCoverType() {
        System.out.println("This physical fiction book is " + coverType);
    }

    @Override
    public void getDimensions() {
        System.out.println("Physical fiction book's dimensions: " + dimnesions);
    }
}
