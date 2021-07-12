package examples.example4_Utility_Helper_Class;

import examples.MyNote;

public class HelperClass implements MyNote {

    private HelperClass() {
    }

    public static void helperMethod1() {
// Method body here
    }

    public static void helperMethod2() {
// Method body here
    }

    @Override
    public void printMyNotes() {
        System.out.println("Burasi  utility/helper classi diye gecer. Ayni seyleri veya Tek kullanimliklari burada olusturabiliriz." +
                "(Genelde ayarlama olarak yada veritabani olusturma ve kullanma olarak kullanilir)" + getClass().getSimpleName() + " <-> " + getClass().getPackageName());
    }
}
