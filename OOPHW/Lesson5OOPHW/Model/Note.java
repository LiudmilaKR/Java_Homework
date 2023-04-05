package Homeworks.OOPHW.Lesson5OOPHW.Model;

public class Note {
    private String noteTitle;
    private String noteText;

    public Note(String noteTitle, String noteText) {
        this.noteTitle = noteTitle;
        this.noteText = noteText;
    }


    @Override
    public String toString() {
        return "   заголовок заметки => " + noteTitle + "\n   текст заметки => " + noteText + "\n";
    }

}
