package examples.example8_defaultinterface;

import examples.MyNote;

public class DefaultInterfaceDenemesi implements InterfaceWithDefaultMethods, MyNote {
    @Override
    public void perform() {
        System.out.println("Perfom fonk zorunlu override");
    }

    @Override
    public void performDefaultAction() {
        InterfaceWithDefaultMethods.super.performDefaultAction();
        System.out.println("Override edildi ancak super()  fonk da cagiriliyor");


    }

    @Override
    public void printMyNotes() {
        System.out.println("Interfacede tanimladigimiz fonksiyonu default olarak ozel bir bicimde icinde kod yazabiliyoruz."+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );
    }

}

