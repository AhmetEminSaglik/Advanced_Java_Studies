package examples.example8_defaultinterface;

public interface InterfaceWithDefaultMethods {
    void perform();

    default void performDefaultAction() {
        System.out.println("Interface icinde tanimlanmis bu fonksiyon : performDefaultAction(){}");

    }

       static void createAction() {
         System.out.println("Static void fonkName ile interface icinde olusturuldu bu fonksiyon");

    }
}
