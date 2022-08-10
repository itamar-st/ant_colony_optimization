package appLogic;

import sprite.Ant;

public class appFlow {
    private Info info;
    private antCollection antCollection;

    public appFlow(Info info, antCollection antCollection) {
        this.info = info;
        this.antCollection = antCollection;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public antCollection getAntCollection() {
        return antCollection;
    }

    public void addToApp(Ant ant) {
        this.antCollection.addAnt(ant);
    }
    public void removeFromApp(Ant ant) {
        this.antCollection.removeAnt(ant);
    }
}
