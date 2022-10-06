package appLogic;

import sprite.Sprite;

/**
 * Velocity specifies the change in position on the `x` and the `y` axes.
 *
 * @author itamar shachenc tov
 * @since 2021-04-28
 */
public class Velocity {
    private int dx;
    private int dy;

    /**
     * constructor.
     *
     * @param dx move x pixels in the x coordinate
     * @param dy move y pixels in the y coordinate
     */
    public Velocity(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * accessor.
     *
     * @return dx
     */
    public int getVelocityX() {
        return this.dx;
    }

    /**
     * accessor.
     *
     * @return dy
     */
    public int getVelocityY() {
        return this.dy;
    }

    public void setVelocitX(int dx) {
        this.dx = dx;
    }

    public void setVelocitY(int dy) {
        this.dy = dy;
    }

    /**
     * @return the velocity value in terms of speed
     */
    public double getSpeed() {
        return Math.sqrt(Math.pow(this.dx, 2) + Math.pow(this.dy, 2));
    }

    /**
     * Take a point with position (x,y) and return a new point.
     * with position (x+dx, y+dy)
     *
     * @param s the point we want to apply the movement
     * @return new point with the coordinates shifted dx,dy pixels
     */
    public void applyToSprite(Sprite s) {
        s.setX(s.getX()+ this.dx);
        s.setY(s.getY() + this.dy);
    }
}