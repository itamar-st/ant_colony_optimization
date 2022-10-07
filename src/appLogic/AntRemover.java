package appLogic;

import sprite.Ant;

public class AntRemover {
    private AppFlow appFlow;

    public AntRemover(AppFlow appFlow) {
        this.appFlow = appFlow;
    }
    public void removeAnt(Ant ant){
        ant.removeFromGame(appFlow);
    }
}
