package appLogic;

import sprite.Ant;
import sprite.Sprite;

import java.util.ArrayList;
import java.util.List;

public class appFlow {
    private Info info;

    public appFlow(Info info) {
        this.info = info;
    }
    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void addToApp(Ant ant) {
        info.addAnt(ant);
    }
    public void removeFromApp(Ant ant) {
        info.removeAnt(ant);
    }
    public void doOneRound(){
        List<Ant> ants = new ArrayList<>(this.info.getAntCollection().getAnts());
        for (Ant a: ants) {
            a.timePassed();
            if(a.getDirectionOfNextStep() == 8){
                a.removeFromGame(this);
            }
        }
    }
}
