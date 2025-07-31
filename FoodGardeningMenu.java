
import java.util.Scanner;

public class FoodGardeningMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;

        // Arrays to store tips, challenges, and recommendations (optional enhancement)
        String[] tips = {
            "Prepare soil properly",
            "Use quality seeds",
            "Water regularly",
            "Control pests naturally"
        };

        String[] challenges = {
            "Poor soil quality",
            "Pest infestations",
            "Unpredictable weather",
            "Limited space"
        };

        String[] recommendations = {
            "Promote community gardens",
            "Conduct gardening workshops",
            "Encourage organic farming"
        };

        // Main menu loop
        do {
            // Display menu
            System.out.println("\n=== Welcome to Food Gardening Guide ===");
            System.out.println("Menu:");
            System.out.println("1. Gardening Tips");
            System.out.println("2. Challenges in Gardening");
            System.out.println("3. Recommendations");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            // Check if input is valid integer
            if (input.hasNextInt()) {
                userChoice = input.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("\n--- Tips for Successful Gardening ---");
                        for (String tip : tips) {
                            System.out.println("- " + tip);
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Common Challenges in Gardening ---");
                        for (String challenge : challenges) {
                            System.out.println("- " + challenge);
                        }
                        break;

                    case 3:
                        System.out.println("\n--- Recommendations to Improve Food Security ---");
                        for (String recommendation : recommendations) {
                            System.out.println("- " + recommendation);
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the Gardening Guide!");
                        break;

                    default:
                        System.out.println("Invalid input. Please enter a number from 1 to 4.");
                }
            } else {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // clear invalid input
                userChoice = -1; // reset choice to stay in loop
            }

        } while (userChoice != 4);

        input.close();
    }
}
