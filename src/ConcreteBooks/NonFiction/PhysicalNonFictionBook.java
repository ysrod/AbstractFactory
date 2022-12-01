package ConcreteBooks.NonFiction;

import Categories.PhysicalBook;

public class PhysicalNonFictionBook extends PhysicalBook {


    public PhysicalNonFictionBook(int numberOfPages, String dimnesions, String coverType) {
        super(numberOfPages, dimnesions, coverType);
    }

    @Override
    public void getNumberOfPages() {
        System.out.println("This physical nonfiction book has " + numberOfPages + " pages");
    }

    @Override
    public void getCoverType() {
        System.out.println("This physical nonfiction book is " + coverType);
    }

    @Override
    public void getDimensions() {
        System.out.println("Physical nonfiction book's dimensions: " + dimnesions);
    }
}
