import java.util.Scanner;

public class GardenPlanener {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("🌱 Welcome to the Plant Spacing Calculator 🌱");

            // Get garden dimensions
            System.out.print("Enter the garden length in meters: ");
            double length = input.nextDouble();

            System.out.print("Enter the garden width in meters: ");
            double width = input.nextDouble();

            // Get spacing required per plant
            System.out.print("Enter spacing required per plant (in meters): ");
            double spacing = input.nextDouble();

            // Calculate total number of plants
            double area = length * width;
            double plantArea = spacing * spacing;
            int totalPlants = (int)(area / plantArea);

            System.out.println("\n✅ You can plant approximately " + totalPlants + " plants in your garden.");
        }
    }
}
