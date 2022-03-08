package pl.java.main;

import pl.java.main.client.ConsoleReader;
import pl.java.main.creditapp.core.CreditApplicationService;

public class Program {
    public static void main(String [] args){

        var reader = new ConsoleReader();
        var person = reader.getPerson();
        var decision = new CreditApplicationService();

        System.out.println(decision.getDecision(person));

    }
}
