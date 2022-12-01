package ConcreteBooks.Fiction;

import Categories.AudioBook;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FictionAudiobook extends AudioBook {
    public FictionAudiobook(float size, String length) {
        super(size, length);
    }

    @Override
    public void getSize() {
        System.out.println("Size of fiction Audiobook file: " + size + " Mb");
    }

    @Override
    public void getLength(){
        System.out.println("Length of fiction audiobook: " + length);
    }
}
