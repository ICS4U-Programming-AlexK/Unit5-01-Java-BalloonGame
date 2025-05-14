import java.awt.Color;
public class Balloon {
    /**
     * The x-coordinate of the balloon.
     */
    int xPosition;
    /**
     * The y-coordinate of the balloon.
     */
    int yPosition;
    /**
     * The color of the balloon.
     */
    Color color;
    /**
     * The size of the balloon.
     */
    int size;
    /**
     * The popped status of the balloon.
     */
    Boolean popped;
    /**
     * Constructor for the Balloon class.
     *
     * @param xPosition The x-coordinate of the balloon.
     * @param yPosition The y-coordinate of the balloon.
     * @param color The color of the balloon.
     * @param size The size of the balloon.
     */
    public Balloon(final int xPosition, final int yPosition,
            final Color color, final int size) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        this.size = size;
        this.popped = false;
    }
    /**
     * Gets the x-coordinate of the balloon.
     *
     * @param xSpaces
     * @param ySpaces The x-coordinate of the balloon.
     */
    public void moveBalloon(final int xSpaces, final int ySpaces) {
        this.xPosition += xSpaces;
        this.yPosition += ySpaces;
    }
    /**
     * Pops the balloon.
     * @param color
     */
    public void changeColor(final Color color) {
        this.color = color;
    }
}
