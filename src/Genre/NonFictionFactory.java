package Genre;

import Categories.AudioBook;
import Categories.BookFactory;
import Categories.EBook;
import Categories.PhysicalBook;
import ConcreteBooks.NonFiction.NonFictionAudiobook;
import ConcreteBooks.NonFiction.NonFictionEbook;
import ConcreteBooks.NonFiction.PhysicalNonFictionBook;

public  class NonFictionFactory extends BookFactory {
    @Override
    public EBook createEBook(float size,boolean isDRMfree) {
        return new NonFictionEbook(size,isDRMfree);
    }

    @Override
    public AudioBook createAudioBook(float size,String length) {
        return new NonFictionAudiobook(size,length);
    }

    @Override
    public PhysicalBook createPhysicalBook(int numberOfPages, String dimnesions, String coverType) {
        return new PhysicalNonFictionBook(numberOfPages, dimnesions, coverType);
    }
}
