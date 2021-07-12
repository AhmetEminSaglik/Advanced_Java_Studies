package examples.example7_Format;

import examples.MyNote;

public class Person implements MyNote {
    private final String firstName;
    private final String lastName;
    private final String email;

    public Person(final String firstName, final String lastName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return String.format( "%s[email=%s, first name=%s, last name=%s]",
                getClass().getSimpleName(), email, firstName, lastName );
    }

    @Override
    public void printMyNotes() {
        System.out.println("String degerini ozel bir formatla yaziyoruz %s ler ve virguller kullnailiyor."+ getClass().getSimpleName()+" <-> "+getClass().getPackageName() );

    }
}
