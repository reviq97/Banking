package pl.java.main.creditapp.core;

public class CreditApplicationService {

    PersonScoringCalculator personScoringCalculator = new PersonScoringCalculator();
    public String getDecision(Person person){
        int scoring = personScoringCalculator.calculate(person.getPersonalData());

        var name = person.getPersonalData().getName();
        var lastName = person.getPersonalData().getLastName();


        return scoring > 300 ?
                "Congratulations " +name +" "+ lastName +", decision is positive!"
                :
                "Sorry" + name + ", "+lastName + ", decision is negative";
    }
}
