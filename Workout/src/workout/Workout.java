package workout;
import java.util.Scanner;

// Abstract class Workout
abstract class Workout {
    // Fields for workout details
    private String exercises;
    private int duration; // Duration in minutes
    private int intensityLevel; // Intensity level of the workout

    // Constructor to initialize the fields
    public Workout(String exercises, int duration, int intensityLevel) {
        this.exercises = exercises;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
    }

    // Getter method for exercises
    public String getExercises() {
        return exercises;
    }

    // Getter method for duration
    public int getDuration() {
        return duration;
    }

    // Getter method for intensity level
    public int getIntensityLevel() {
        return intensityLevel;
    }
}

// Interface IWorkout
interface IWorkout {
    // Method to print workout details
    void printWorkout();
}

// Class ProcessWorkout extending Workout and implementing IWorkout
class ProcessWorkout extends Workout implements IWorkout {

    // Constructor to initialize the fields using superclass constructor
    public ProcessWorkout(String exercises, int duration, int intensityLevel) {
        super(exercises, duration, intensityLevel);
    }

    // Implementation of the printWorkout method from IWorkout interface
    @Override
    public void printWorkout() {
        // Display workout details
        System.out.println("Workout Details:");
        System.out.println("Exercises: " + getExercises());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Intensity Level: " + getIntensityLevel());
    }
}
