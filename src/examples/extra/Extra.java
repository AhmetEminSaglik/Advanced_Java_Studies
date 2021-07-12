package examples.extra;

import examples.example7_Format.Person;

public class Extra {
    {
        Nurse nurse = new Nurse("Ayse", "Can", "a@gmail.com");
        Person person = new Person("Zulal", "ayyildiz", "z@gmail.com");

        Nurse newNurse;
        Person newPerson;
        newNurse = nurse;
//        newNurse=(Person) nurse; //Hatali calismiyor
        newPerson = person;
        newPerson = nurse;
        newPerson = (Person) nurse;
    }

}
