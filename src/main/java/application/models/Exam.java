package application.models;

import java.time.LocalDate;

public class Exam {
    private String description;
    private LocalDate date;

    public Exam(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date){
        this.date=date;
    }
    public void setDescription(String description){
        this.description=description;
    }
    
}

