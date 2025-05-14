import java.awt.Color;
/**
 * This program recursively reverses a string entered by the user.
 * Author: Alex Smith
 * Version: 1.0
 * Since: 2025-04-22
 */
public class Main {
    /**
     * @param args The command line arguments.
     * The x-coordinate of the balloon.
     */
    public static void main(final String[] args) {
        Balloon balloonA = new Balloon(70, 10, Color.RED, 50);
        Balloon balloonB = new Balloon(100, 20, Color.BLUE, 60);

        balloonA.moveBalloon(24, 12);
        System.out.println("Balloon A moved to: ");
        System.out.println(balloonA.xPosition);
        System.out.println(balloonA.yPosition);
        System.out.println("");

        balloonB.moveBalloon(50, 40);
        System.out.println("Balloon B moved to: ");
        System.out.println(balloonB.xPosition);
        System.out.println(balloonB.yPosition);
    }
}
