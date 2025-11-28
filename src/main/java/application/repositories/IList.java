package application.repositories;
import java.util.*;

public interface IList<T> {
    public ArrayList<T> getItems();
    public void setItems(ArrayList<T> items);
    
}
