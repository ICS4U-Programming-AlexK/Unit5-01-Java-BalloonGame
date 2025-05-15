public class Spike {
    /**
     * The x-position of the spike.
     */
    private int xPosition;
    /**
     * The y-coordinate of the spike.
     */
    public static final int YPOSITION = 0;
    /**
     * The color of the spike.
     * @param xPositionS
     */
    public Spike(final int xPositionS) {
        this.xPosition = xPositionS;
    }
    /**
     * Gets the x-coordinate of the spike.
     *
     * @param balloon The x-coordinate of the spike.
     */
    public void popBalloon(final Balloon balloon) {
        if (balloon.getXPosition() == this.xPosition
                && balloon.getYPosition() == YPOSITION) {
            balloon.setPopped(true);
        } else {
            System.out.println("The spike missed the balloon.");
        }
    }
    /**
     * Color of the balloon.
     *
     * @return Color of the balloon.
     */
    public int getXPosition() {
        return this.xPosition;
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
     * Moves the spike to a new x-coordinate.
     *
     * @param xSpaces The number of spaces to move the spike.
     */
    public void moveSpike(final int xSpaces) {
        this.xPosition += xSpaces;
    }
}
