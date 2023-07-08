package com.foofinc.PickClickMove.repository;


import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Exercise;
import com.foofinc.PickClickMove.service.exercise.Region;

import java.util.List;

public  class ExerciseInit {
    public static List<Exercise> getExercises() {
        return List.of(

                //Body Weight

                new Exercise("Push Ups",
                             "Least amount of sets as possible",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CHEST}),

                new Exercise("Single Leg Romanian Dead Lifts",
                             "Reps are for each side:30",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.LEGS}),

                new Exercise("Dips",
                             "4x6",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CHEST}),

                new Exercise("Archer Push-Ups",
                             "4x8",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CHEST}),


                new Exercise("Pull-Ups",
                             "4x6",
                             new Equipment[]{Equipment.STRAIGHT_BAR},
                             new Region[]{Region.BACK}),

                new Exercise("Incline Push-Ups",
                             "4x10",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CHEST}),

                new Exercise("Belgian Split Squats",
                             "4x8 each side",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.LEGS}),

                new Exercise("Body Squats",
                             "4x20",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.LEGS}),

                new Exercise("8 count body builders",
                             "4x10",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CARDIO}),

                new Exercise("Jumping Jacks",
                             "4x10",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CARDIO}),

                new Exercise("Leg Raises",
                             "4x8",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CORE}),

                new Exercise("Planks",
                             "1 min = 1 rep",
                             new Equipment[]{Equipment.BODY_WEIGHT},
                             new Region[]{Region.CORE}),

                //KettleBells

                new Exercise("Kettle bell Swings",
                             "Single Arm 2 x25",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Kettle bell Rows",
                             "4x8 each arm",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.BACK}),

                new Exercise("Kettle bell Flys",
                             "4x8 each arm",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.CHEST}),

                new Exercise("Goblet Squats",
                             "3x8",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),
                new Exercise("Goblet Squats",
                             "3x8",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Kettle Bell Snatch",
                             "4x6",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Kettle Bell Single-Leg Romanian Deadlift",
                             "4x6",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Halos",
                             "4x8 each direction",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.BACK, Region.CHEST}),

                new Exercise("Turkish Get-Up",
                             "4x4 each side",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Around the world",
                             "4x10 each direction",
                             new Equipment[]{Equipment.KETTLE_BELL},
                             new Region[]{Region.CHEST}),

                //Barbell

                new Exercise("Bench Press",
                             "4x10",
                             new Equipment[]{Equipment.BARBELL},
                             new Region[]{Region.CHEST}),

                new Exercise("Back Squat",
                             "4x8",
                             new Equipment[]{Equipment.BARBELL},
                             new Region[]{Region.LEGS}),

                new Exercise("Barbell Row",
                             "4x8",
                             new Equipment[]{Equipment.BARBELL},
                             new Region[]{Region.BACK}),

                new Exercise("Front Squat",
                             "4x8",
                             new Equipment[]{Equipment.BARBELL},
                             new Region[]{Region.LEGS}));
    }
}
