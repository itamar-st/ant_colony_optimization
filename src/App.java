import appLogic.Info;
import appLogic.AppFlow;
import sprite.Ant;

public class App {
    public static void main(String[] args) {
        Info info = new Info();
        info.setPheromone(4,5,5);
        info.setPheromone(5,5,5);
        info.setPheromone(6,6,5);
        Ant a1 = new Ant(info);
        AppFlow appFlow = new AppFlow(info);
        a1.addToGame(appFlow);
        appFlow.getInfo().printMap();
        appFlow.getInfo().printPheromoneMap();
        int i;
        for (i = 0; i < 3; i++) {
            appFlow.doOneRound();
            appFlow.getInfo().printMap();
            appFlow.getInfo().printPheromoneMap();
        }
        a1.setHasFood(true);
        for (; i < 6; i++) {
            appFlow.doOneRound();
            appFlow.getInfo().printMap();
            appFlow.getInfo().printPheromoneMap();
        }
    }
}
