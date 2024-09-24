package Programmeringsuppgift3;
import java.util.List;

public class Team {
    private String name;
    private Association association;
    private Series series;
    private List<Person> players;

    public Team(String name, Association association, Series series) {
        this.name = name;
        this.association = association;
        this.series = series;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public List<Person> getPlayers() {
        return players;
    }

    public void setPlayers(List<Person> players) {
        this.players = players;
    }
}
