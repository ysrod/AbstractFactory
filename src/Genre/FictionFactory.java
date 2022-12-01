package Genre;

import Categories.AudioBook;
import Categories.BookFactory;
import Categories.EBook;
import Categories.PhysicalBook;
import ConcreteBooks.Fiction.FictionAudiobook;
import ConcreteBooks.Fiction.FictionEbook;
import ConcreteBooks.Fiction.PhysicalFictionBook;


public  class FictionFactory extends BookFactory {



    @Override
    public EBook createEBook(float size,boolean isDRMfree) {
        return new FictionEbook(size,isDRMfree);
    }

    @Override
    public AudioBook createAudioBook(float size,String length) {
        return new FictionAudiobook(size,length);
    }

    @Override
    public PhysicalBook createPhysicalBook(int numberOfPages, String dimnesions, String coverType) {
        return new PhysicalFictionBook(numberOfPages, dimnesions, coverType);
    }
}
