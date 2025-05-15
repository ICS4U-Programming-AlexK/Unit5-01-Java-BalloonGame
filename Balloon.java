import java.awt.Color;
public class Balloon {
    /**
     * The x-coordinate of the balloon.
     */
    private int xPosition;
    /**
     * The y-coordinate of the balloon.
     */
    private int yPosition;
    /**
     * The color of the balloon.
     */
    private Color color;
    /**
     * The size of the balloon.
     */
    private int size;
    /**
     * The popped status of the balloon.
     */
    private Boolean popped;
    /**
     * Constructor for the Balloon class.
     *
     * @param xSpaceP The x-coordinate of the balloon.
     * @param ySpaceP The y-coordinate of the balloon.
     * @param colorC The color of the balloon.
     * @param sizeS The size of the balloon.
     */
    public Balloon(final int xSpaceP, final int ySpaceP,
            final Color colorC, final int sizeS) {
        this.xPosition = xSpaceP;
        this.yPosition = ySpaceP;
        this.color = colorC;
        this.size = sizeS;
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
     * Gets the x-coordinate of the balloon.
     *
     * @return The x-coordinate of the balloon.
     */
    public int getXPosition() {
        return this.xPosition;
    }
    /**
     * Color of the balloon.
     *
     * @return Color of the balloon.
     */
    public int getYPosition() {
        return this.yPosition;
    }
    /**
     * Color of the balloon.
     *
     * @return Color of the balloon.
     */
    public Color getColor() {
        return this.color;
    }
    /**
     * Color of the balloon.
     *
     * @return Color of the balloon.
     */
    public int getSize() {
        return this.size;
    }
    /**
     * Color of the balloon.
     *
     * @return Color of the balloon.
     */
    public Boolean getPopped() {
        return this.popped;
    }
    /**
     * Pops the balloon.
     * @param colorC
     */
    public void changeColor(final Color colorC) {
        this.color = colorC;
    }
}
