package main.java.exceptions.groups;

public class GeoFaculty1stGroup extends Group {
    private int quantityOfStudents;
    private String specialization;

    public GeoFaculty1stGroup(int groupID, int groupNumber, int quantityOfStudents, String specialization) {
        super(groupID, groupNumber);
        this.quantityOfStudents = quantityOfStudents;
        this.specialization = specialization;
        if (quantityOfStudents <= 0) {
            throw new IllegalArgumentException("Quantity of students cannot be below zero");
        }
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
