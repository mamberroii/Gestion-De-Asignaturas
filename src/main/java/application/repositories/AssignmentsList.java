package application.repositories;
import java.util.ArrayList;
import application.models.Assignments;

public class AssignmentsList {
    private ArrayList<Assignments> assignmentsList;

    public AssignmentsList() {
        this.assignmentsList = new ArrayList<>();
    }
    public AssignmentsList(ArrayList<Assignments> assignmentsList) {
        this.assignmentsList = assignmentsList;
    }
    public ArrayList<Assignments> getAssignmentsList() {
        return assignmentsList;
    }
    public void setAssignmentsList(ArrayList<Assignments> assignmentsList) {
        this.assignmentsList = assignmentsList;
    }
}
