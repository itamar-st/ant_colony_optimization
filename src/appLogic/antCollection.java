package appLogic;

import sprite.Ant;

import java.util.ArrayList;
import java.util.List;

public class antCollection {
    private List<Ant> ants;

    public antCollection() {
        this.ants = new ArrayList<>();
    }

    public List<Ant> getAnts() {
        return ants;
    }

    public void addAnt(Ant ant) {
        this.ants.add(ant);
    }
    public void removeAnt(Ant ant) {
        this.ants.remove(ant);
    }
}
