package main.java.exceptions.students;

public class GeoStudents extends Student {
    private int topologyMark;
    private int geographyMark;
    private int geologyMark;
    private int historyMark;

    public GeoStudents(int id, String surname, String name, int groupNumber, int quantityOfSubjects, int topologyMark, int geographyMark, int geologyMark, int historyMark) {
        super(id, surname, name, groupNumber, quantityOfSubjects);
        this.topologyMark = topologyMark;
        this.geographyMark = geographyMark;
        this.geologyMark = geologyMark;
        this.historyMark = historyMark;
        if (topologyMark <= 0 || geographyMark <= 0 || geologyMark <= 0 || historyMark <= 0) {
            throw new IllegalArgumentException("The score cannot be below zero");
        }
        if (topologyMark > 10 || geographyMark > 10 || geologyMark > 10 || historyMark > 10) {
            throw new IllegalArgumentException("The score cannot be higher than ten");
        }
    }

    public GeoStudents() {
        super();
    }

    public int getTopologyMark() {
        return topologyMark;
    }

    public void setTopologyMark(int topologyMark) {
        this.topologyMark = topologyMark;
    }

    public int getGeographyMark() {
        return geographyMark;
    }

    public void setGeographyMark(int geographyMark) {
        this.geographyMark = geographyMark;
    }

    public int getGeologyMark() {
        return geologyMark;
    }

    public void setGeologyMark(int geologyMark) {
        this.geologyMark = geologyMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }

}
