public class Spike {
    /**
     * The x-position of the spike.
     */
    public int xPosition;
    /**
     * The y-coordinate of the spike.
     */
    public static final int yPosition = 0;
    /**
     * The color of the spike.
     * @param xPosition
     */
    public Spike(final int xPosition) {
        this.xPosition = xPosition;
    }
    /**
     * Gets the x-coordinate of the spike.
     *
     * @param balloon The x-coordinate of the spike.
     */
    public void popBalloon(final Balloon balloon) {
        if (balloon.xPosition == this.xPosition) {
            balloon.popped = true;
        }
    }
    /**
     * Moves the spike to a new x-coordinate.
     *
     * @param xSpaces The number of spaces to move the spike.
     */
    public void moveSpike(final int xSpaces) {
        this.xPosition += xSpaces;
    }
}
