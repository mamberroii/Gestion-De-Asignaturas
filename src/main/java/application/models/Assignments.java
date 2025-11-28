package application.models;

public class Assignments {
    private String description;
    private State state;

    public Assignments(String description, State state){
        this.description=description;
        this.state=state;
    }
    public String getDescription(){
        return description;
    }
    public State getState(){
        return state;
    }
}
