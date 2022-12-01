import Categories.AudioBook;
import Categories.BookFactory;
import Categories.EBook;
import Categories.PhysicalBook;
import Genre.FictionFactory;
import Genre.NonFictionFactory;
import Genre.TechnicalFactory;

import java.util.Scanner;

public class Catalog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a book to catalog");
        System.out.println("1 - Fiction; 2 - Nonfiction; 3 - Technical");
        int choiceGenre = Integer.parseInt(input.nextLine());
        if (choiceGenre == 1) {
            createFiction(input);
        } else if (choiceGenre == 2) {
            createNonFiction(input);
        } else if (choiceGenre == 3) {
            createTechnical(input);
        }


    }


    private static void createTechnical(Scanner input) {
        BookFactory bookFactory = new TechnicalFactory();
        System.out.println("Choose format");
        System.out.println("1 - Physical; 2 - Audiobook; 3 - Ebook");
        int choiceFormat = Integer.parseInt(input.nextLine());
        if (choiceFormat == 1) {
            createPhysicalTechnicalBook(input, bookFactory);
        } else if (choiceFormat == 2) {
            createTechnicalAudiobook(input, bookFactory);
        } else if (choiceFormat == 3) {
            createTechnicalEbook(input, bookFactory);
        }
    }

    private static void createPhysicalTechnicalBook(Scanner input, BookFactory bookFactory) {
        System.out.println("Number of pages: ");
        int numberOfPages = Integer.parseInt(input.next());
        System.out.println("Dimensions (length cm x height cm):");
        String dimensions = input.nextLine();
        System.out.println("Type of cover:");
        String coverType = input.nextLine();
        PhysicalBook physicalTechnicalBook = bookFactory.createPhysicalBook(numberOfPages,
                dimensions, coverType);
        receivePhysicalBook(physicalTechnicalBook);
    }

    private static void createTechnicalEbook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeEbook = Float.parseFloat(input.nextLine());
        System.out.println("DRM free? Y - true; N - false");
        boolean isDRMfree = input.nextBoolean();
        EBook technicalEbook = bookFactory.createEBook(sizeEbook, isDRMfree);
        receiveEbook(technicalEbook);
    }

    private static void createTechnicalAudiobook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeAudioBook = Float.parseFloat(input.nextLine());
        System.out.println("Length (HH:mm:ss):");
        String length = input.nextLine();
        AudioBook technicalAudiobook = bookFactory.createAudioBook(sizeAudioBook, length);
        receiveAudioBook(technicalAudiobook);
    }


    private static void createFiction(Scanner input) {
        BookFactory bookFactory = new FictionFactory();
        System.out.println("Choose format");
        System.out.println("1 - Physical; 2 - Audiobook; 3 - Ebook");
        int choiceFormat = Integer.parseInt(input.nextLine());
        if (choiceFormat == 1) {
            createPhysicalFictionBook(input, bookFactory);
        } else if (choiceFormat == 2) {
            createFictionAudiobook(input, bookFactory);
        } else if (choiceFormat == 3) {
            createFictionEbook(input, bookFactory);
        }
    }

    private static void createPhysicalFictionBook(Scanner input, BookFactory bookFactory) {
        System.out.println("Number of pages: ");
        int numberOfPages = Integer.parseInt(input.nextLine());
        System.out.println("Dimensions (length cm x height cm):");
        String dimensions = input.nextLine();
        System.out.println("Type of cover:");
        String coverType = input.nextLine();

        PhysicalBook physicalFictionBook = bookFactory.createPhysicalBook(numberOfPages, dimensions, coverType);
        receivePhysicalBook(physicalFictionBook);
    }

    private static void createFictionAudiobook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeAudioBook = Float.parseFloat(input.nextLine());
        System.out.println("Length (HH:mm:ss):");
        String length = input.nextLine();
        AudioBook fictionAudiobook = bookFactory.createAudioBook(sizeAudioBook, length);
        receiveAudioBook(fictionAudiobook);
    }

    private static void createFictionEbook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeEbook = Float.parseFloat(input.nextLine());
        System.out.println("DRM free? Y - true; N - false");
        boolean isDRMfree = input.nextBoolean();
        EBook fictionEbook = bookFactory.createEBook(sizeEbook, isDRMfree);
        fictionEbook.getSize();
        fictionEbook.isDRMfree();
    }

    private static void createNonFiction(Scanner input) {
        BookFactory bookFactory = new NonFictionFactory();
        System.out.println("Choose format");
        System.out.println("1 - Physical; 2 - Audiobook; 3 - Ebook");
        int nonFictionFormat = Integer.parseInt(input.nextLine());
        if (nonFictionFormat == 1) {
            createPhysicalNonFiction(input, bookFactory);
        } else if (nonFictionFormat == 2) {
            createNonFictionAudiobook(input, bookFactory);
        } else if (nonFictionFormat == 3) {
            createNonFictionEbook(input, bookFactory);
        }
    }

    private static void createPhysicalNonFiction(Scanner input, BookFactory bookFactory) {
        System.out.println("Number of pages: ");
        int numberOfPages = Integer.parseInt(input.nextLine());
        System.out.println("Dimensions (length cm x height cm):");
        String dimensions = input.nextLine();
        System.out.println("Type of cover:");
        String coverType = input.nextLine();
        PhysicalBook physicalNonFictionBook = bookFactory.createPhysicalBook(numberOfPages,
                dimensions, coverType);
        receivePhysicalBook(physicalNonFictionBook);
    }

    private static void createNonFictionEbook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeEbook = Float.parseFloat(input.nextLine());
        System.out.println("DRM free? Y - true; N - false");
        boolean isDRMfree = input.nextBoolean();
        EBook nonFictionEbook = bookFactory.createEBook(sizeEbook, isDRMfree);
        receiveEbook(nonFictionEbook);
    }

    private static void createNonFictionAudiobook(Scanner input, BookFactory bookFactory) {
        System.out.println("Size (Mb): ");
        float sizeAudioBook = Float.parseFloat(input.nextLine());
        System.out.println("Length (HH:mm:ss):");
        String length = input.nextLine();
        AudioBook nonFictionAudiobook = bookFactory.createAudioBook(sizeAudioBook, length);
        receiveAudioBook(nonFictionAudiobook);
    }

    private static void receiveEbook(EBook ebook) {
        ebook.isDRMfree();
        ebook.getSize();
    }

    private static void receiveAudioBook(AudioBook audiobook) {
        audiobook.getLength();
        audiobook.getSize();
    }

    private static void receivePhysicalBook(PhysicalBook physicalBook) {
        physicalBook.getCoverType();
        physicalBook.getDimensions();
        physicalBook.getNumberOfPages();
    }


}
