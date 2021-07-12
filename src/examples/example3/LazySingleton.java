package examples.example3;

import examples.MyNote;

public class LazySingleton implements MyNote {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public void printMyNotes() {
        System.out.println(" Burada  veri istendigi zaman olusturuldugu icin tembel singleton (yani tek degerli veri olusturma)  gerceklestirilir. ==> "+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );

    }
}