package ConcreteBooks.Technical;

import Categories.EBook;

public class TechnicalEbook extends EBook {
    public TechnicalEbook(float size, boolean isDRMfree) {
        super(size, isDRMfree);
    }

    @Override
    public void getSize() {
        System.out.println("Size of technical ebook: " + size + " Mb");
    }

    @Override
    public void isDRMfree() {
        System.out.println("Is this technical ebook DRM-free: ");
        if(isDRMfree){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
