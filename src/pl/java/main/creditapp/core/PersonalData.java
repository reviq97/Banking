package pl.java.main.creditapp.core;

public class PersonalData{
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final Eduaction eduaction;
    private final Status status;
    private final double totalMonthlyIncomeInPln;
    private final int numOfFamilyDependants;


    public PersonalData(String name,
                        String lastName,
                        String mothersMaidenName,
                        Eduaction eduaction,
                        Status status,
                        double totalMonthlyIncomeInPln,
                        int numOfFamilyDependants) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.eduaction = eduaction;
        this.status = status;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.numOfFamilyDependants = numOfFamilyDependants;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hello " + name + ", " + lastName + "!";
    }

    public int getNumOfFamilyDependants() {
        return numOfFamilyDependants;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public Eduaction getEduaction() {
        return eduaction;
    }

    public Status getStatus() {
        return status;
    }
}
