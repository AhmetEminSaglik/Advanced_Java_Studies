package examples.example9_Generic;

public class GenericInterfaceDeneme implements GenericInterfaceOneType<String>, GenericInterfaceSeveralTypes<Integer, String> {

    @Override
    public void performAction(String action) {

    }


    @Override
    public String performActionSeveralTypes(Integer action) {
        return null;
    }
}
