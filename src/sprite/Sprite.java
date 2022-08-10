package sprite;
import appLogic.antCollection;
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
    void addToGame();

    /**
     * remove the spirit to the game.
     *
     */
    void removeFromGame();
}