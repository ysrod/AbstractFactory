package ConcreteBooks.NonFiction;

import Categories.AudioBook;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NonFictionAudiobook extends AudioBook {
    public NonFictionAudiobook(float size, String length) {
        super(size, length);
    }

    @Override
    public void getSize() {
        System.out.println("Size of the nonfiction audiobook file: " + size + " Mb");
    }

    @Override
    public void getLength() {
        System.out.println("Length of nonfiction audiobook: " + length);
    }
}
