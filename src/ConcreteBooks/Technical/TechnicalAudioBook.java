package ConcreteBooks.Technical;

import Categories.AudioBook;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TechnicalAudioBook extends AudioBook {
    public TechnicalAudioBook(float size, String length) {
        super(size, length);
    }

    @Override
    public void getSize() {
        System.out.println("Size of technical audiobook file: " + size + " Mb");
    }

    @Override
    public void getLength() {
        System.out.println("Length of technical audiobook: " + length);
    }
}
