package com.nl.mprog.example.boris.strengthprogramapp.classes;
/**
 * Created by Boris on 11-01-2017.
 * Workout program data - Class creates the objects for each workout program in cardview item.
 */
public class WorkoutProgramData {

    // ArtData object contains these 'columns'
    private String workout_name;
    private String description;

    // Empty constructor
    public WorkoutProgramData() {}

    // Initialize object
    public WorkoutProgramData(String workout_name, String description) {
        this.workout_name = workout_name;
        this.description = description;
    }

    // Getters and setters
    public String getWorkout_name() {
        return workout_name;
    }

    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
