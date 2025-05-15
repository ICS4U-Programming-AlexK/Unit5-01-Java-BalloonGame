import java.awt.Color;
/**
 * This program recursively reverses a string entered by the user.
 * Author: Alex Smith
 * Version: 1.0
 * Since: 2025-04-22
 */
final class Main {
    /**
     * Private constructor to prevent instantiation.
     * @throws IllegalStateException Utility class.
     */
    private Main() {
        throw new IllegalStateException("Utility Class");
    }
    /**
     * @param args The command line arguments.
     * The x-coordinate of the balloon.
     */
    public static void main(final String[] args) {
        Balloon balloonA = new Balloon(70, 10, Color.RED, 50);
        Balloon balloonB = new Balloon(100, 20, Color.BLUE, 60);

        balloonA.moveBalloon(24, 12);
        System.out.println("Balloon A moved to: ");
        System.out.println(balloonA.getXPosition());
        System.out.println(balloonA.getYPosition());
        System.out.println("");

        balloonB.moveBalloon(50, 40);
        System.out.println("Balloon B moved to: ");
        System.out.println(balloonB.getXPosition());
        System.out.println(balloonB.getYPosition());
    }
}
