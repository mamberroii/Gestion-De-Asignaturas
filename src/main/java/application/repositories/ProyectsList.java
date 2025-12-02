package application.repositories;
import java.util.ArrayList;
import application.models.Proyect;

public class ProyectsList {
    private ArrayList<Proyect> proyects;

    public ProyectsList(){
        this.proyects = new ArrayList<>();
    }
    public ProyectsList(ArrayList<Proyect> proyects){
        this.proyects = proyects;
    }
    public ArrayList<Proyect> getProyects() {
        return proyects;
    }
    public void setProyects(ArrayList<Proyect> proyects) {
        this.proyects = proyects;
    }
}
