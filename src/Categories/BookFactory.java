package Categories;

public abstract class BookFactory {


    public abstract EBook createEBook(float size, boolean isDRMfree);

    public abstract AudioBook createAudioBook(float size, String length);

    public abstract PhysicalBook createPhysicalBook(int numberOfPages, String dimnesions, String coverType);
}
