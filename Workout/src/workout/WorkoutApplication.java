
package workout;

// Main class WorkoutApplication

import java.util.Scanner;

public class WorkoutApplication {
    // Main method to run the application
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for workout details
        System.out.println("Enter your workout details:");

        // Get exercises from the user
        System.out.print("Enter exercises (comma-separated): ");
        String exercises = scanner.nextLine();

        // Get duration from the user
        System.out.print("Enter duration (in minutes): ");
        int duration = scanner.nextInt();

        // Get intensity level from the user
        System.out.print("Enter intensity level (1-10): ");
        int intensityLevel = scanner.nextInt();

        // Instantiate ProcessWorkout class with user input
        ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel);

        // Print the workout details
        workout.printWorkout();

        // Close the scanner
        scanner.close();
    }
}
