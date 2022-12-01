package Genre;

import Categories.AudioBook;
import Categories.BookFactory;
import Categories.EBook;
import Categories.PhysicalBook;
import ConcreteBooks.Technical.PhysicalTechnicalBook;
import ConcreteBooks.Technical.TechnicalAudioBook;
import ConcreteBooks.Technical.TechnicalEbook;

public  class TechnicalFactory extends BookFactory {
    @Override
    public EBook createEBook(float size,boolean isDRMfree) {
        return new TechnicalEbook(size,isDRMfree);
    }

    @Override
    public AudioBook createAudioBook(float size,String length) {
        return new TechnicalAudioBook(size,length);
    }

    @Override
    public PhysicalBook createPhysicalBook(int numberOfPages, String dimnesions, String coverType) {
        return new PhysicalTechnicalBook(numberOfPages, dimnesions, coverType);
    }
}
