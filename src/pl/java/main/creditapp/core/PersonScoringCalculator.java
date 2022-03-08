package pl.java.main.creditapp.core;

public class PersonScoringCalculator {

    public int calculate(PersonalData person){

        var education = person.getEduaction();

        int scoring = 0;

        var income = person.getTotalMonthlyIncomeInPln()/ person.getNumOfFamilyDependants();

        if (String.valueOf(income).length() > 3){
            scoring += (income/1000)*100;}

        if (person.getStatus() == Status.MARRIED|| person.getStatus() == Status.SEPARATED){
            scoring += 100;}

        switch (education){
            case NONE -> scoring -= 200;
            case PRIMARY -> scoring -= 100;
            case TERTIARY -> scoring +=100;
        }
        return scoring;
    }
}
