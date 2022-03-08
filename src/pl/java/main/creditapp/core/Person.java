package pl.java.main.creditapp.core;

public class Person {
    private final PersonalData personalData;
    private final ContactData contactData;

    public Person(PersonalData personalData, ContactData contactData) {
        this.personalData = personalData;
        this.contactData = contactData;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}
