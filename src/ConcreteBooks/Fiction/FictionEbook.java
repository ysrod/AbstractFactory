package ConcreteBooks.Fiction;

import Categories.EBook;

public class FictionEbook extends EBook {

    public FictionEbook(float size, boolean isDRMfree) {
        super(size, isDRMfree);
    }

    @Override
    public void getSize() {
        System.out.println("Size of the fiction ebook file: " + size + " Mb" );
    }

    @Override
    public void isDRMfree() {
        System.out.println("Is this fiction ebook DRM-free: ");
        if(isDRMfree){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
