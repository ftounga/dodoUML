package dodo.uml.model;

import java.util.ArrayList;
import java.util.List;

public class Mentoree extends User{

    private List<String> attentes;

    public Mentoree() {
        this.attentes = new ArrayList<>();
    }

    public List<String> getAttentes() {
        return attentes;
    }

    public void setAttentes(List<String> attentes) {
        this.attentes = attentes;
    }
}
