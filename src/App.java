import appLogic.Info;
import appLogic.AppFlow;
import sprite.Ant;

public class App {
    public static void main(String[] args) {
        Info info = new Info();
        info.setPheromone(4,5,1);
        info.setPheromone(5,5,1);
        Ant a1 = new Ant(info);
        AppFlow appFlow = new AppFlow(info);
        a1.addToGame(appFlow);
        appFlow.getInfo().printMap();
        appFlow.getInfo().printPheromoneMap();

        for (int i = 0; i < 6; i++) {
            appFlow.doOneRound();
            appFlow.getInfo().printMap();
            appFlow.getInfo().printPheromoneMap();
        }
    }
}
