package main.java.exceptions.faculties;

public class LawFaculty extends Faculty {
    private double quantityOfGroups;
    private double quantityOfStudents;

    public LawFaculty(int facultyID, String nameOfRector, double quantityOfGroups, double quantityOfStudents) {
        super(facultyID, nameOfRector);
        this.quantityOfGroups = quantityOfGroups;
        this.quantityOfStudents = quantityOfStudents;
        if (quantityOfGroups <= 0) {
            throw new IllegalArgumentException("Quantity of groups can't be below zero");
        }
    }

    public double getQuantityOfGroups() {
        return quantityOfGroups;
    }

    public void setQuantityOfGroups(double quantityOfGroups) {
        this.quantityOfGroups = quantityOfGroups;
    }

    public double getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(double quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }
}
