package main;

import examples.MyNote;
import examples.example1.ConstructorWithArguments;
import examples.example2.InitializationBlockAndConstructor;
import examples.example3.EagerSingleton;
import examples.example3.LazySingleton;
import examples.example4_Utility_Helper_Class.HelperClassCopy;
import examples.example6_Dependant.Dependant;
import examples.example7_Format.Person;
import examples.example8_defaultinterface.DefaultInterfaceDenemesi;

import java.util.ArrayList;

public class Notes {
    public Notes() {
        ArrayList<MyNote> list = new ArrayList<MyNote>();
        list.add(new ConstructorWithArguments("a1"));
        list.add(new InitializationBlockAndConstructor());
        list.add(EagerSingleton.getInstance());
        list.add(LazySingleton.getInstance());
        list.add(new HelperClassCopy());
        list.add(new Dependant(null));
        list.add(new Person("Ad","Soyad","email"));
        list.add(new DefaultInterfaceDenemesi());

        int i = 1;
        for (MyNote index : list) {
            System.out.print(i + " - ) ");
            index.printMyNotes();
            System.out.println();
            i++;
        }
        System.out.println("------------------");

        final String str1 = new String( "bbb" );
        System.out.println( "Using == operator: " + ( str1 == "bbb" ) );
        System.out.println( "Using equals() method: " + str1.equals( "bbb" ) );
    }
}
