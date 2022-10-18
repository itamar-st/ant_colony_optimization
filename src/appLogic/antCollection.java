package appLogic;

import sprite.Ant;

import java.util.ArrayList;
import java.util.List;

public class antCollection {
    private List<Ant> ants;
    private int numOfAnts;

    public antCollection() {
        this.ants = new ArrayList<>();
        this.numOfAnts = 0;
    }

    public List<Ant> getAnts() {
        return ants;
    }

    public void addAnt(Ant ant) {
        this.ants.add(ant);
        numOfAnts++;
    }
    public void removeAnt(Ant ant) {
        this.ants.remove(ant);
        numOfAnts--;
    }
}
