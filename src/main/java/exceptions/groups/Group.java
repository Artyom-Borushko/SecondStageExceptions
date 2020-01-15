package main.java.exceptions.groups;

public class Group {
    private int groupID;
    private int groupNumber;

    public Group(int groupID, int groupNumber) {
        this.groupID = groupID;
        this.groupNumber = groupNumber;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
