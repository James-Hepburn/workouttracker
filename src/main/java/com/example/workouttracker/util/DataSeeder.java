package com.example.workouttracker.util;

import com.example.workouttracker.model.Exercise;
import com.example.workouttracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private ExerciseService exerciseService;

    @Override
    public void run (String... args) throws Exception {
        seedExercises ();
    }

    private void seedExercises () {
        if (exerciseService.findAll ().isEmpty ()) {
            exerciseService.createExercise ("Push-Up", "Push-ups for chest and arms", "Strength", "Chest");
            exerciseService.createExercise ("Squat", "Bodyweight squats for legs", "Strength", "Legs");
            exerciseService.createExercise ("Plank", "Hold plank for core strength", "Strength", "Core");
            exerciseService.createExercise ("Jumping Jacks", "Full body cardio exercise", "Cardio", "Full Body");
            exerciseService.createExercise ("Lunges", "Forward lunges for legs", "Strength", "Legs");
            exerciseService.createExercise ("Burpees", "Full body cardio with push-up", "Cardio", "Full Body");
            exerciseService.createExercise ("Bicep Curl", "Dumbbell curls for biceps", "Strength", "Arms");
            exerciseService.createExercise ("Tricep Dip", "Bodyweight dip for triceps", "Strength", "Arms");
            exerciseService.createExercise ("Mountain Climbers", "Cardio for core and legs", "Cardio", "Core");
            exerciseService.createExercise ("Yoga Stretch", "Flexibility and stretching", "Flexibility", "Full Body");
        }
    }
}