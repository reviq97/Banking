package pl.java.main.creditapp.core;

public class ContactData {

    private final String email;
    private final String phoneNumber;

    public ContactData(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
