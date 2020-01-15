package main.java.exceptions.universities;

public class University {
    private double quantityOfFaculties;
    private double quantityOfStudents;

    public University(double quantityOfFaculties, double quantityOfStudents) {
        this.quantityOfFaculties = quantityOfFaculties;
        this.quantityOfStudents = quantityOfStudents;
        if (quantityOfFaculties <= 0) {
            throw new IllegalArgumentException("Quantity of faculties cannot be below zero");
        }
    }

    public double getQuantityOfFaculties() {
        return quantityOfFaculties;
    }

    public void setQuantityOfFaculties(double quantityOfFaculties) {
        this.quantityOfFaculties = quantityOfFaculties;
    }

    public double getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(double quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }
}
