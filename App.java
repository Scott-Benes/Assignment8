import java.util.Scanner;

/**
 *  user creates and draws either a Circle or Rectangle object.
 * The user enters information such as color,
 * dimensions, and position coordinates.
 * shape is  positioned, drawn,
 * and displayed using its toString method.
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SHAPE DRAWING PROGRAM");

        System.out.println("\nChoose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter circle color: ");
                String circleColor = scanner.next();

                System.out.print("Enter circle size: ");
                int circleSize = scanner.nextInt();

                System.out.print("Enter x coordinate: ");
                int circleX = scanner.nextInt();

                System.out.print("Enter y coordinate: ");
                int circleY = scanner.nextInt();

                Circle circle =
                        new Circle(circleColor, circleSize);

                circle.position(circleX, circleY);

                circle.draw();

                System.out.println(circle);

                break;

            case 2:

                System.out.print("Enter rectangle color: ");
                String rectColor = scanner.next();

                System.out.print("Enter rectangle width: ");
                int rectWidth = scanner.nextInt();

                System.out.print("Enter rectangle height: ");
                int rectHeight = scanner.nextInt();

                System.out.print("Enter x coordinate: ");
                int rectX = scanner.nextInt();

                System.out.print("Enter y coordinate: ");
                int rectY = scanner.nextInt();

                Rectangle rectangle =
                        new Rectangle(rectColor,
                                      rectWidth,
                                      rectHeight);

                rectangle.position(rectX, rectY);

                rectangle.draw();

                System.out.println(rectangle);

                break;

            default:

                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
