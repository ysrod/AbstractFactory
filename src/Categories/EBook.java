package Categories;

public abstract class EBook {

    public float size;
    public boolean isDRMfree;

    public EBook(float size, boolean isDRMfree){
        this.size = size;
        this.isDRMfree = isDRMfree;
    }

    public abstract void getSize();

    public abstract void isDRMfree();
}
