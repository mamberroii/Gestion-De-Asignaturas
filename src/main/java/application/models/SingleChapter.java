package application.models;

public class SingleChapter {
    private String description;

    public SingleChapter(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}

