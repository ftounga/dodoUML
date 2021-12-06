package dodo.uml.model;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User{

    private List<String> competences;

    public Mentor() {
        this.competences = new ArrayList<>();
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }
}
