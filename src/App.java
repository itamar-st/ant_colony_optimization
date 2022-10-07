import appLogic.Info;
import appLogic.AppFlow;
import sprite.Ant;

public class App {
    public static void main(String[] args) {
        Info info = new Info();
        Ant a1 = new Ant();
        AppFlow appFlow = new AppFlow(info);
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
