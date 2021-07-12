package examples.example6_Dependant;

import examples.MyNote;

import java.text.DateFormat;
import java.util.Date;

public class Dependant implements MyNote {
    private final DateFormat format;



    public Dependant(final DateFormat format) {
        this.format = format;
    }

    public String format(final Date date) {
        return format.format(date);
    }

    @Override
    public void printMyNotes() {
        System.out.println("Burada 'format' degeri final oldugu halde ragmen  constructorlara bagli oldugu icin bagimli olarak adlandiriliyor."+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );

    }
}
