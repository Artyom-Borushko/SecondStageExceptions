package main.java.exceptions.students;

public class LawStudents extends Student {
    private int civilLawMark;
    private int criminalLawMark;
    private int constitutionalLawMark;
    private int historyMark;

    public LawStudents(int id, String surname, String name, int groupNumber, int quantityOfSubjects, int civilLawMark, int criminalLawMark, int constitutionalLawMark, int historyMark) {
        super(id, surname, name, groupNumber, quantityOfSubjects);
        this.civilLawMark = civilLawMark;
        this.criminalLawMark = criminalLawMark;
        this.constitutionalLawMark = constitutionalLawMark;
        this.historyMark = historyMark;
        if (civilLawMark <= 0 || criminalLawMark <= 0 || constitutionalLawMark <= 0 || historyMark <= 0) {
            throw new IllegalArgumentException("The score cannot be below zero");
        }
        if (civilLawMark > 10 || criminalLawMark > 10 || constitutionalLawMark > 10 || historyMark > 10) {
            throw new IllegalArgumentException("The score cannot be higher than ten");
        }
    }



    public LawStudents() {
        super();
    }

    public int getCivilLawMark() {
        return civilLawMark;
    }

    public void setCivilLawMark(int civilLawMark) {
        this.civilLawMark = civilLawMark;
    }

    public int getCriminalLawMark() {
        return criminalLawMark;
    }

    public void setCriminalLawMark(int criminalLawMark) {
        this.criminalLawMark = criminalLawMark;
    }

    public int getConstitutionalLawMark() {
        return constitutionalLawMark;
    }

    public void setConstitutionalLawMark(int constitutionalLawMark) {
        this.constitutionalLawMark = constitutionalLawMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }
}

