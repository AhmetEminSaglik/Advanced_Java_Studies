package examples.example3;

import examples.MyNote;

public class EagerSingleton implements MyNote {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;

    }

    @Override
    public void printMyNotes() {
        System.out.println(" Burada  veri  program calismaya baslandigi anda olusturuldugu icin istekli Singleton kuralina uyar. ==> "+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );
    }
}