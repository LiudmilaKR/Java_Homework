package Homeworks.OOPHW.Lesson5OOPHW.Presenter;

import Homeworks.OOPHW.Lesson5OOPHW.Model.Model;

public class Presenter {
    // private View view;
    private Model model;

    public Presenter(String pathNotepad) {
        model = new Model(pathNotepad);
    }
  

    public String loadNotepad() {
        return model.readFromNotepad();
    }

    
    public void addNoteToNotepad(String nTitle, String nText) {
        model.addToNotepad(nTitle, nText);
        System.out.println(model.printAddNote(nTitle, nText));
    }
}
