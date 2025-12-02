package application.models;

import application.repositories.*;

public class Subject {
    private int roomId;
    private String name;
    private ChapterList temario;
    private ExamsList exams;
    private AssignmentsList assignmentsList;
    private Professor professor;

    public Subject(String name, Professor professor, int roomId) {
        this.name = name;
        this.professor = professor;
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
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}

