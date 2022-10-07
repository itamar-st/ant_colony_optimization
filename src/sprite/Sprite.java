package sprite;
import appLogic.AppFlow;

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
    void addToGame(AppFlow appFlow);

    /**
     * remove the spirit to the game.
     *
     */
    void removeFromGame(AppFlow appFlow);
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);

    }