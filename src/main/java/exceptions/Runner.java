package main.java.exceptions;

import main.java.exceptions.faculties.GeoFaculty;
import main.java.exceptions.faculties.LawFaculty;
import main.java.exceptions.groups.GeoFaculty1stGroup;
import main.java.exceptions.groups.LawFaculty1stGroup;
import main.java.exceptions.students.GeoStudents;
import main.java.exceptions.students.LawStudents;
import main.java.exceptions.universities.University;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<LawStudents> lawStudents = new ArrayList();
        LawStudents firstLawStudent = new LawStudents(1, "Borushko", "Artyom", 1, 4, 8, 9, 8,9);
        LawStudents secondLawStudent = new LawStudents(2, "Minovich", "Ilya", 2, 4, 9, 9, 7,8);
        lawStudents.add(firstLawStudent);
        lawStudents.add(secondLawStudent);

        ArrayList<GeoStudents> geoStudents = new ArrayList();
        GeoStudents firstGeoStudent = new GeoStudents(4, "Rozanov", "Danila", 1, 4, 8, 9, 7,8);
        GeoStudents secondGeoStudent = new GeoStudents(5, "Ivanov", "Ivan", 2, 4, 8, 9, 9,9);
        geoStudents.add(firstGeoStudent);
        geoStudents.add(secondGeoStudent);

        ArrayList<GeoFaculty1stGroup> geoFaculty1stGroup = new ArrayList();
        GeoFaculty1stGroup firstGeoGroup = new GeoFaculty1stGroup(12, 1, 2, "geology");
        GeoFaculty1stGroup secondGeoGroup = new GeoFaculty1stGroup(13, 2, 2, "paleontology");
        geoFaculty1stGroup.add(firstGeoGroup);
        geoFaculty1stGroup.add(secondGeoGroup);

        ArrayList<LawFaculty1stGroup> LawFaculty1stGroups = new ArrayList();
        LawFaculty1stGroup firstLawGroup = new LawFaculty1stGroup(1, 1, 1, "commercial");
        LawFaculty1stGroup secondLawGroup = new LawFaculty1stGroup(2, 2, 1, "criminal");
        LawFaculty1stGroups.add(firstLawGroup);
        LawFaculty1stGroups.add(secondLawGroup);

        University university = new University(2, 4);
        LawFaculty lawFaculty = new LawFaculty(123, "Petr", 2, 2);
        GeoFaculty geoFaculty = new GeoFaculty(124, "Dima", 2, 2);

        LawStudents object = new LawStudents();
        Field[] fields = object.getClass().getDeclaredFields();

        double averageMarkForLawStudents = (firstLawStudent.getCivilLawMark() + firstLawStudent.getConstitutionalLawMark() + firstLawStudent.getCriminalLawMark() + firstLawStudent.getHistoryMark()) / fields.length;
        System.out.println("Average score in all subjects of the student " + averageMarkForLawStudents);

        double averageScoreInSpecializedSubjectInSpecializedGroupInSpecializedFaculty = 0;
        for (int i = 0; i < lawStudents.size(); i++) {
            if (lawStudents.get(i).getGroupNumber() == firstLawGroup.getGroupNumber()) {
                averageScoreInSpecializedSubjectInSpecializedGroupInSpecializedFaculty += lawStudents.get(i).getCivilLawMark() / firstLawGroup.getQuantityOfStudents();
            }
        }
        System.out.println("Average score in a particular subject in a particular group and in a particular faculty " + averageScoreInSpecializedSubjectInSpecializedGroupInSpecializedFaculty);

        double averageMarkForLawFaculty = 0;
        for (int i = 0; i < lawStudents.size(); i++) {
            averageMarkForLawFaculty += (lawStudents.get(i).getHistoryMark() / lawFaculty.getQuantityOfStudents());
        }
        double averageMarkForGeoFaculty = 0;
        for (int i = 0; i < geoStudents.size(); i++) {
            averageMarkForGeoFaculty += (geoStudents.get(i).getHistoryMark() / geoFaculty.getQuantityOfStudents());
        }
        double averageMarkInTheSubjectForTheEntireUniversity = (averageMarkForLawFaculty + averageMarkForGeoFaculty) / university.getQuantityOfFaculties();
        System.out.println("The average score in the subject for the entire University " + averageMarkInTheSubjectForTheEntireUniversity);
    }
}


