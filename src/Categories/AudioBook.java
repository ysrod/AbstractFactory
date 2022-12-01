package Categories;

import java.text.ParseException;

public abstract class AudioBook {

    public float size;
    public String length;

    public AudioBook(float size, String length){
        this.size = size;
        this.length = length;
    }

    public abstract void getSize();

    public abstract void getLength();
}
