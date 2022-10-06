import appLogic.Info;
import appLogic.appFlow;
import sprite.Ant;

public class App {
    public static void main(String[] args) {
        Info info = new Info();
        Ant a1 = new Ant();
        appFlow appFlow = new appFlow(info);
        a1.addToGame(appFlow);
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();

        appFlow.doOneRound();
        appFlow.getInfo().printMap();
    }
}
