package Categories;

public abstract class PhysicalBook {

    public int numberOfPages;
    public String dimnesions;
    public String coverType;

    public PhysicalBook(int numberOfPages, String dimensions, String coverType) {
        this.numberOfPages = numberOfPages;
        this.dimnesions = dimensions;
        this.coverType = coverType;
    }

    public abstract void getNumberOfPages();

    public abstract void getCoverType();

    public abstract void getDimensions();
}
