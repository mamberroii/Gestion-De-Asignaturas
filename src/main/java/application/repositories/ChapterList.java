package application.repositories;
import java.util.ArrayList;
import application.models.SingleChapter;

public class ChapterList {
    private ArrayList<SingleChapter> chapters;
    private int numChapters;

    public ChapterList() {
        this.chapters = new ArrayList<>();
        this.numChapters=0;
    }
    public ChapterList(ArrayList<SingleChapter> chapters) {
        this.chapters = chapters;
        this.numChapters=chapters.size();
    }
    public void setChapters(ArrayList<SingleChapter> chapters) {
        this.chapters = chapters;
    }
    public ArrayList<SingleChapter> getChapters() {
        return chapters;
    }
    public int getNumChapters() {
        return numChapters;
    }
    public void setNumChapters() {
        this.numChapters = this.chapters.size();
    }
    
}
