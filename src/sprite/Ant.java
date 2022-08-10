package sprite;

import appLogic.antCollection;
import appLogic.appFlow;

public class Ant implements Sprite{
    private int directionOfNextStep;
    private boolean hasFood;


    public Ant() {
        this.directionOfNextStep = 5;
        this.hasFood = false;
    }

    @Override
    public void timePassed() {

    }

    @Override
    public void addToGame(appFlow appFlow) {
        appFlow.addToApp(this);
    }

    @Override
    public void removeFromGame(appFlow appFlow) {
        appFlow.removeFromApp(this);
    }

}
