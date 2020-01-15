package main.java.exceptions.faculties;

public class Faculty {
    private int facultyID;
    private String nameOfRector;

    public Faculty(int facultyID, String nameOfRector) {
        this.facultyID = facultyID;
        this.nameOfRector = nameOfRector;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getNameOfRector() {
        return nameOfRector;
    }

    public void setNameOfRector(String nameOfRector) {
        this.nameOfRector = nameOfRector;
    }
}
