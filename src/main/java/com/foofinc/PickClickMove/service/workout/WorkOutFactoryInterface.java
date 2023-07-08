package com.foofinc.PickClickMove.service.workout;


import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Exercise;
import com.foofinc.PickClickMove.service.exercise.Region;

import java.util.List;

public class WorkOutFactoryInterface {

    private final List<Exercise> exercises;

    public WorkOutFactoryInterface(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Workout getParameterizedWorkout(int numberOfExercises,
                                           List<Region> regions,
                                           List<Equipment> equipment,
                                           boolean repeat) {
        WorkoutFactoryOrder order = new WorkoutFactoryOrder(numberOfExercises, regions, equipment, repeat);
        return ParameterizedWorkoutFactory.getFactory(order, exercises).create();
    }

    public Workout getParameterizedWorkout(WorkoutFactoryOrder order) {
        return ParameterizedWorkoutFactory.getFactory(order, exercises).create();
    }

    public Workout getRandomWorkout(int numberOfExercises,
                                    List<Region> regions,
                                    List<Equipment> equipment,
                                    boolean repeat) {
        WorkoutFactoryOrder order = new WorkoutFactoryOrder(numberOfExercises, regions, equipment, repeat);
        return RandomWorkoutFactory.getFactory(order, exercises).create();
    }

    public Workout getRandomWorkout(WorkoutFactoryOrder order) {
        return RandomWorkoutFactory.getFactory(order, exercises).create();
    }
}
