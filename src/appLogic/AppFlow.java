package appLogic;

import sprite.Ant;

import java.util.ArrayList;
import java.util.List;

public class AppFlow {
    private Info info;

    public AppFlow(Info info) {
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

    /**
     * exec one round. every ant do its thing.
     */
    public void doOneRound(){
        List<Ant> ants = new ArrayList<>(this.info.getAntCollection().getAnts());
        for (Ant a: ants) {
            a.timePassed();
            // if the ant is designate to exit the app
            if(a.getDirectionOfNextStep() == 8){
//                a.removeFromGame(this);
                removeFromApp(a);
            }
        }
    }
}
