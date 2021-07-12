package examples.example3;

public class NaiveSingleton {
    private static NaiveSingleton instance;

    private NaiveSingleton() {
    }

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            System.out.println("null du degerlendirildi");
            instance = new NaiveSingleton();
        }else{
            System.out.println("zaten onceden deger verilmis");
        }
        return instance;
    }
}
