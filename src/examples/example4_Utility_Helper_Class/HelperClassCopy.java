package examples.example4_Utility_Helper_Class;

import examples.MyNote;

public class HelperClassCopy implements MyNote {

    public HelperClassCopy() {
    }

    public static void helperMethod1() {
// Method body here
    }

    public static void helperMethod2() {
// Method body here
    }

    @Override
    public void printMyNotes() {
        System.out.println("(Helper Class Private oldugundan cagiramiyorduk o yuzden public constructorlu olan sahte kopyasini olusturduk)\n Burasi  utility/helper classi diye gecer. Ayni seyleri veya Tek kullanimliklari burada olusturabiliriz.\n" +
                "(Genelde ayarlama olarak yada veritabani olusturma ve kullanma olarak kullanilir) "+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );
    }
}


