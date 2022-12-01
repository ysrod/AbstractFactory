package ConcreteBooks.NonFiction;

import Categories.EBook;

public class NonFictionEbook extends EBook {
    public NonFictionEbook(float size, boolean isDRMfree) {
        super(size, isDRMfree);
    }

    @Override
    public void getSize() {
        System.out.println("Size of nonfiction ebook file: " + size + " Mb");
    }

    @Override
    public void isDRMfree() {
        System.out.println("Is this nonfiction ebook DRM-free: ");
        if(isDRMfree){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
