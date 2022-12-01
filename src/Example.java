import Categories.AudioBook;
import Categories.BookFactory;
import Categories.EBook;
import Categories.PhysicalBook;
import Genre.FictionFactory;
import Genre.NonFictionFactory;
import Genre.TechnicalFactory;

public class Example {

    public static void main(String[] args) {

        BookFactory bookFactory;
        System.out.println("Fiction books: ");
        bookFactory = new FictionFactory();
        EBook fictionEbook = bookFactory.createEBook(5,true);
        fictionEbook.isDRMfree();
        fictionEbook.getSize();

        System.out.println();
        System.out.println("Technical books: ");

        bookFactory = new TechnicalFactory();
        AudioBook technicalAudiobook = bookFactory.createAudioBook(100,"54:20:35");
        technicalAudiobook.getLength();
        technicalAudiobook.getSize();

        System.out.println();
        System.out.println("Nonfiction books: ");
        bookFactory = new NonFictionFactory();
        PhysicalBook physicalNonFictionBook = bookFactory.createPhysicalBook(
                154,
                "28 cm x 27 cm",
                "hardcover");

        EBook nonFictionEbook = bookFactory.createEBook(10,false);
        nonFictionEbook.getSize();
        nonFictionEbook.isDRMfree();
    }
}
