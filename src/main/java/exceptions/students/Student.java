package main.java.exceptions.students;

public class Student {
    private int id;
    private String surname;
    private String name;
    private int groupNumber;
    private int quantityOfSubjects;

    public Student(int id, String surname, String name, int groupNumber, int quantityOfSubjects) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.quantityOfSubjects = quantityOfSubjects;
        if (quantityOfSubjects <= 0) {
            throw new IllegalArgumentException("Quantity of subjects cannot be below zero");
        }
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getQuantityOfSubjects() {
        return quantityOfSubjects;
    }

    public void setQuantityOfSubjects(int quantityOfSubjects) {
        this.quantityOfSubjects = quantityOfSubjects;
    }
}
