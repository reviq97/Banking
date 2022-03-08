package pl.java.main.client;

import pl.java.main.creditapp.core.*;

import java.util.Scanner;

public class ConsoleReader {

    public Person getPerson(){
        var input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter you last name");
        String lastName = input.next();
        System.out.println("Enter your mother's maiden name");
        String maidenName = input.next();
        System.out.println("What is your marital status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED)");
        Status status = Status.valueOf(input.next());
        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Eduaction eduaction = Eduaction.valueOf(input.next());
        System.out.println("Enter your email address:");
        String mail = input.next();
        System.out.println("Enter your phone number:");
        String number = input.next();
        System.out.println("Enter total monthly income in PLN:");
        double totalMonthlyIncomeInPln = Double.parseDouble(input.next());
        System.out.println("Enter number of family dependants (including applicant):");
        int numOfFamilyDependants = Integer.parseInt(input.next());

        var personalData = new PersonalData(name, lastName, maidenName, eduaction,
                status, totalMonthlyIncomeInPln, numOfFamilyDependants);
        var contactData = new ContactData(mail, number);

        return new Person(personalData, contactData);
    }
}
