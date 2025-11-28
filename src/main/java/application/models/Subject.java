package application.models;

import application.repositories.*;

public class Subject {
    private String name;
    private ChapterList temario;
    private ExamsList exams;
    private int roomId;
    private AssignmentsList assignmentsList;

    public Subject(String name, int roomId) {
        this.name = name;
        this.roomId = roomId;
        this.temario = new ChapterList();
        this.exams = new ExamsList();
        this.assignmentsList = new AssignmentsList();
    }
    public String getName() {
        return name;
    }   
    public ChapterList getTemario() {
        return temario;
    }
    public ExamsList getExams() {
        return exams;
    }
    public int getRoomId() {
        return roomId;
    }
    public AssignmentsList getAssignmentsList() {
        return assignmentsList;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTemario(ChapterList temario) {
        this.temario = temario;
    }
    public void setExams(ExamsList exams) {
        this.exams = exams;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public void setAssignmentsList(AssignmentsList assignmentsList) {
        this.assignmentsList = assignmentsList;
    }

}

