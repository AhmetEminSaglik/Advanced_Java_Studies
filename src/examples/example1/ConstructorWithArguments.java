package examples.example1;

import examples.MyNote;

public class ConstructorWithArguments implements MyNote {

    public ConstructorWithArguments(final String arg1,final String arg2) {
        System.out.println("double constructor arg1 : "+arg1+" arg2 :"+arg2);


    }
    public ConstructorWithArguments(final String arg1) {
        this(arg1, null);
        System.out.println("one  constructor arg1 : "+arg1);
    }

    @Override
    public void printMyNotes() {
        System.out.println(" Burada  bir constructor cagrildiginda nasil diger bir constructor kullanilabilecegini ogrendik. ==> "+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );
    }
}
