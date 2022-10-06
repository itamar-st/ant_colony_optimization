package sprite;
import appLogic.antCollection;
import appLogic.appFlow;

/**
 * spirit interface.
 */
public interface Sprite {
    /**
     * draw the sprite to the screen.
     *
     */
//    void drawOn(DrawSurface d);

    /**
     * notify the sprite that time has passed.
     */
    void timePassed();

    /**
     * add the spirit to the game.
     *
     */
    void addToGame(appFlow appFlow);

    /**
     * remove the spirit to the game.
     *
     */
    void removeFromGame(appFlow appFlow);
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);

    }