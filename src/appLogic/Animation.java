package appLogic;

/**
 * animation interface - all screens need to implement this.
 */
public interface Animation {
    /**
     * what should happen when a frame is passed in the animation.
     *
     * @param d the surface we draw on
     */
    void doOneFrame();

    /**
     * what is the indication for stopping the animation.
     *
     * @return true when the animation needs to stop
     */
    boolean shouldStop();
}
