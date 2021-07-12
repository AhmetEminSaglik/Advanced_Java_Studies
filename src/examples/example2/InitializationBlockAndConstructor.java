package examples.example2;

import examples.MyNote;

public class InitializationBlockAndConstructor implements MyNote {
    {
        System.out.println("NOT: Once suslu parantezlerdeki islemi yapar sonra constructorda doner ");
        System.out.println("constructor ustundeki  suslu parantezdeyim");
    }

    public InitializationBlockAndConstructor() {
        System.out.println("constructordayim");
    }

    {
        System.out.println("constructor altina yaziyorum  suslu parantezdeyim");

    }

    @Override
    public void printMyNotes() {
        System.out.println(" Burada  sadece suslu parantezlerin de calisabildigini ve suslu parantezler ile constructordan daha once calistigini ogrendik. ==> "+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );

    }
}
